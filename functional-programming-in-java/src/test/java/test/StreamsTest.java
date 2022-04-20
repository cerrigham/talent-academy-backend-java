package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamsTest {

    @Test
    @DisplayName("can filter collections without using loops")
    void canFilterCollectionsWithoutUsingLoops() {
        List<String> aList = List.of("foo", "bar", "baz");

        // don't do in this way, methods are chainable
        Stream<String> startingStream = aList.stream();
        Stream<String> filteredStream = startingStream.filter(t -> t.startsWith("b"));
        filteredStream.toList();

        // better do like this
        List<String> result = aList.stream()
                .filter(t -> t.startsWith("b"))
                .toList();
        assertEquals(List.of("bar", "baz"), result);
    }

    @Test
    @DisplayName("can transform (map) values into something else")
    void canTransformMapValuesIntoSomethingElse() {
        List<String> aList = List.of("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
        List<Integer> result = aList.stream()
                .map(String::length)
                .toList();
        assertEquals(List.of(4, 3, 3, 5, 4, 4, 3, 5, 5, 4), result);
    }

    @Test
    @DisplayName("can remove duplicate elements")
    void canRemoveDuplicateElements() {
        List<String> aList = List.of("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
        List<Integer> result = aList.stream()
                .map(String::length)
                .distinct()
                .toList();
        assertEquals(List.of(4, 3, 5), result);
    }

    @Test
    @DisplayName("can sort using natural ordering")
    void canSortUsingNaturalOrdering() {
        List<Integer> aList = List.of(4, 3, 5);
        List<Integer> result = aList.stream()
                .sorted()
                .toList();
        assertEquals(List.of(3, 4, 5), result);
    }

    @Test
    @DisplayName("can sort specifying how to do that")
    void canSortSpecifyingHowToDoThat() {
        List<Integer> aList = List.of(4, 3, 5);
        List<Integer> result = aList.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        assertEquals(List.of(5, 4, 3), result);
    }

    @Test
    @DisplayName("can do all things together")
    void canDoAllThingsTogether() {
        List<String> aList = List.of("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
        List<Integer> result = aList.stream()
                .filter(s -> s.startsWith("t"))
                .map(String::length)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
        assertEquals(List.of(5, 3), result);
    }

    @Test
    @DisplayName("intermediate operations are lazy, they are called only if needed")
    void intermediateOperationsAreLazyTheyAreCalledOnlyIfNeeded() {
        Stream<Supplier<String>> aStream = Stream.of(
                () -> "foo",
                () -> "bar",
                () -> "baz",
                () -> {
                    throw new IllegalStateException();
                }
        );
        List<String> result = aStream.map(Supplier::get)
                .filter(s -> s.startsWith("b"))
                .limit(2)
                .toList();
        assertEquals(List.of("bar", "baz"), result);
    }

}
