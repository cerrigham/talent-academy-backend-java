package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ListsTest {

    @Test
    @DisplayName("can create a list and access its elements")
    void canCreateAListAndAccessItsElements() {
        List<Integer> list = List.of(40, 2);

        assertEquals(2, list.size());
        assertEquals(40, list.get(0));
    }

    @Test
    @DisplayName("List.of returns an immutable list")
    void listOfReturnsAnImmutableList() {
        List<Integer> list = List.of(40, 2);

        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    @DisplayName("can add elements to list")
    void canAddElementsToList() {
        List<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(2);

        assertEquals(2, list.size());
        assertEquals(List.of(40, 2), list);
    }

}
