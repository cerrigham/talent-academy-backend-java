package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbstractFactoryTest {

    @Test
    @DisplayName("factory implementation can be changed")
    void factoryImplementationCanBeChanged() {
        GreeterFactory greeterFactory = new EnglishGreeterFactory();
        String aResult = greet(greeterFactory, "Alice");

        greeterFactory = new ItalianGreeterFactory();
        String anotherResult = greet(greeterFactory, "Alice");

        assertEquals("Hello, Alice", aResult);
        assertEquals("Ciao, Alice", anotherResult);
    }

    String greet(GreeterFactory greeterFactory, String who) {
        Greeter greeter = greeterFactory.create();
        return greeter.greet(who);
    }


}

@FunctionalInterface
interface Greeter {

    String greet(String who);

}

interface GreeterFactory {

    Greeter create();

}

class EnglishGreeterFactory implements GreeterFactory {

    @Override
    public Greeter create() {
        return who -> "Hello, " + who;
    }

}

class ItalianGreeterFactory implements GreeterFactory {

    @Override
    public Greeter create() {
        return who -> "Ciao, " + who;
    }

}
