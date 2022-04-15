package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

interface Now {
    LocalDateTime get();
}

class SimpleTest {

    static String canReturnNull() {
        return null;
    }

    static int theAnswer() {
        return 42;
    }

    static LocalDateTime calculateTheRequiredDeliveryDate(Now now) {
        return now.get().minusDays(1);
    }

    @Test
    void sumOfTwoIntegers() {
        assertEquals(42, 40 + 2);
    }

    @Test
    @DisplayName("Optionals are a better alternative to nulls")
    void optionalsAreABetterAlternativeToNulls() {
        String result = Optional.ofNullable(canReturnNull())
                .filter(t -> t.contains("some string"))
                .orElse("string not found");
        assertEquals("string not found", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 42, 100})
    void parametrizedTestsCanBeUsefulInSomeCases(int theAnswer) {
        assertTrue(theAnswer == 42);
    }

    @Test
    void assertjAssertionsAreVeryPowerful() {
        assertThat(theAnswer()).isEqualTo(42);
    }

    @Test
    @DisplayName("mockito can be used where we should mock dependencies")
    void mockitoCanBeUsedWhereWeShouldMockDependencies() {
        LocalDateTime NOW = LocalDateTime.now();
        Now now = Mockito.mock(Now.class);
        when(now.get()).thenReturn(NOW);

        LocalDateTime result = calculateTheRequiredDeliveryDate(now);

        assertThat(result).isBefore(NOW);
    }

}
