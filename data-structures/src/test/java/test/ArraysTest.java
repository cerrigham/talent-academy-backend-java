package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ArraysTest {

    @Test
    @DisplayName("arrays can be created with specific size")
    void arraysCanBeCreatedWithSpecificSize() {
        Integer[] ints = new Integer[2];

        assertEquals(2, ints.length);
        assertNull(ints[0]);
        assertNull(ints[1]);
    }

    @Test
    @DisplayName("arrays can be created and filled")
    void arraysCanBeCreatedAndFilled() {
        Integer[] ints = new Integer[2];
        ints[0] = 40;
        ints[1] = 2;

        assertEquals(2, ints.length);
        assertEquals(40, ints[0]);
        assertEquals(2, ints[1]);
    }

    @Test
    @DisplayName("arrays can be created filled")
    void arraysCanBeCreatedFilled() {
        Integer[] ints = new Integer[]{40, 2};

        assertEquals(2, ints.length);
        assertEquals(40, ints[0]);
        assertEquals(2, ints[1]);
    }

}
