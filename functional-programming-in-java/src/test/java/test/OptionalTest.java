package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import static org.junit.jupiter.api.Assertions.*;

class OptionalTest {

    @Test
    @DisplayName("can check if value is present (not a best practice)")
    void canCheckIfValueIsPresentNotABestPractice() {
        Optional<String> anOptional = Optional.ofNullable(null);
        assertFalse(anOptional.isPresent());
        assertSame(Optional.empty(), anOptional);
    }

    @Test
    @DisplayName("can execute a side effect only when value is present")
    void canExecuteASideEffectOnlyWhenValueIsPresent() {
        Optional<String> present = Optional.of("Hello, World!");
        Optional<String> missing = Optional.empty();

        CompletableFuture<String> forPresent = new CompletableFuture<>();
        present.ifPresent(forPresent::complete);
        missing.ifPresent(ignored -> {
            throw new IllegalStateException("should not be called");
        });

        assertEquals("Hello, World!", forPresent.join());
    }

    @Test
    @DisplayName("can get stored value or something else")
    void canGetStoredValueOrSomethingElse() {
        Optional<String> present = Optional.of("Hello, World!");
        Optional<String> missing = Optional.empty();

        assertEquals("Hello, World!", present.orElse("Hello, Missing!"));
        assertEquals("Not found", missing.orElse("Not found"));
    }

    @Test
    @DisplayName("can get stored value or throw an exception")
    void canGetStoredValueOrThrowAnException() {
        Optional<String> missing = Optional.empty();
        assertThrows(IllegalStateException.class, () -> missing.orElseThrow(IllegalStateException::new));
    }

    @Test
    @DisplayName("can map value when present")
    void canMapValueWhenPresent() {
        Optional<String> present = Optional.of("Hello, World!");
        Optional<String> missing = Optional.empty();

        assertEquals(Optional.of(13), present.map(String::length));
        assertEquals(Optional.empty(), missing.map(String::length));
    }

}
