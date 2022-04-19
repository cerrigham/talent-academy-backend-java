package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrategyTest {

    @Test
    @DisplayName("can fail fast")
    void canFailFast() {
        List<Result> results = CheckForFailure.failFast().check(
                () -> Result.failure("engine"),
                () -> {
                    throw new IllegalStateException("should never be called");
                }
        );

        assertEquals(List.of(Result.failure("engine")), results);
    }

    @Test
    @DisplayName("can fail after all checks")
    void canFailAfterAllChecks() {
        List<Result> results = CheckForFailure.complete().check(
                () -> Result.failure("engine"),
                () -> Result.failure("lights"),
                () -> Result.failure("brakes")
        );

        assertEquals(List.of(
                        Result.failure("engine"),
                        Result.failure("lights"),
                        Result.failure("brakes"))
                , results);
    }

}


sealed interface Result {
    record Success() implements Result {
    }

    record Failure(String description) implements Result {
    }

    static Result failure(String description) {
        return new Failure(description);
    }
}

interface Check {
    Result check();
}

interface CheckForFailure {
    List<Result> check(Check... checks);

    static CheckForFailure failFast() {
        return checks -> Arrays.stream(checks)
                .map(Check::check)
                .filter(result -> result instanceof Result.Failure)
                .findFirst()
                .map(List::of)
                .orElse(Collections.emptyList());
    }

    static CheckForFailure complete() {
        return checks -> Arrays.stream(checks)
                .map(Check::check)
                .filter(result -> result instanceof Result.Failure)
                .collect(Collectors.toList());
    }

}



