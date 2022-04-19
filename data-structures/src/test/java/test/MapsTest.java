package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapsTest {

    @Test
    @DisplayName("can create a map filling it with key-value pairs")
    void canCreateAMapFillingItWithKeyValuePairs() {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(42, "the answer");

        assertEquals(3, map.size());
    }

    @Test
    @DisplayName("can access values given the key")
    void canAccessValuesGivenTheKey() {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(42, "the answer");

        assertEquals("the answer", map.get(42));
    }

    @Test
    @DisplayName("can create a map using factory method")
    void canCreateAMapUsingFactoryMethod() {
        Map<Integer, String> map = Map.of(
                1, "I",
                2, "II",
                3, "III",
                4, "IV"
                // ...
        );

        assertEquals(4, map.size());
        assertEquals("IV", map.get(4));
    }

}
