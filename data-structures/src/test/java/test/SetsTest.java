package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SetsTest {

    @Test
    @DisplayName("cannot use factory method for creating a set with duplicates")
    void cannotUseFactoryMethodForCreatingASetWithDuplicates() {
        assertThrows(IllegalArgumentException.class, () -> Set.of(42, 42));
    }

    @Test
    @DisplayName("sets does not allow duplicates")
    void setsDoesNotAllowDuplicates() {
        Set<Integer> set = new HashSet<>();

        set.add(40);
        set.add(2);
        set.add(2);
        set.add(40);

        assertEquals(2, set.size());
    }

}
