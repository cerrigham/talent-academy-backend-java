package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class SingletonTest {

    @Test
    @DisplayName("there is only one instance of singleton")
    void thereIsOnlyOneInstanceOfSingleton() {
        // TheSingleton anInstance = new TheSingleton(); // private access
        TheSingleton anInstance = TheSingleton.getInstance();
        TheSingleton anotherInstance = TheSingleton.getInstance();

        assertSame(anInstance, anotherInstance);
    }

}

class TheSingleton {

    private static final TheSingleton INSTANCE = new TheSingleton();

    private TheSingleton() {
        // cannot be instantiated from outside
    }

    public static TheSingleton getInstance() {
        return INSTANCE;
    }

    public String doSomething(String s, Integer i) {
        return s + " " + i;
    }

}
