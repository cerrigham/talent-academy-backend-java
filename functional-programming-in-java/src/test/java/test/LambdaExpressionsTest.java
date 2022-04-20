package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LambdaExpressionsTest {

    static String sayHello(Supplier<String> who) {
        return "Hello, " + who.get() + "!";
    }

    static void save(String s, Consumer<String> save) {
        save.accept(s);
    }

    @Test
    @DisplayName("Supplier is used when you need to return a value")
    void supplierIsUsedWhenYouNeedToReturnAValue() {
        Supplier<String> world = () -> "World";
        String result = sayHello(world);
        assertEquals("Hello, World!", result);
    }

    @Test
    @DisplayName("function is used when you need to return something given an input value")
    void functionIsUsedWhenYouNeedToReturnSomethingGivenAnInputValue() {
        Function<String, String> helloWorld = who -> "Hello, " + who + "!";
        String result = helloWorld.apply("World");
        assertEquals("Hello, World!", result);
    }

    @Test
    @DisplayName("functions can be composed")
    void functionsCanBeComposed() {
        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String> helloWorld = who -> "Hello, " + who + "!";
        String result = toUpperCase.compose(helloWorld).apply("World");
        assertEquals("HELLO, WORLD!", result);
    }

    @Test
    @DisplayName("consumer is used when you need a side effect")
    void consumerIsUsedWhenYouNeedASideEffect() {
        Store<String> store = new Store<>();
        Consumer<String> saveInStore = store::save;
        save("Hello, World!", saveInStore);
        assertEquals("Hello, World!", store.read());
    }

}

class Store<T> {
    private T value;

    public T read() {
        return value;
    }

    public void save(T value) {
        this.value = value;
    }
}
