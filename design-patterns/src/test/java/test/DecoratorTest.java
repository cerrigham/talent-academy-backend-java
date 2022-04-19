package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoratorTest {

    @Test
    @DisplayName("can decorate a sandwich")
    void canDecorateASandwich() {
        Sandwich sandwich = () -> "A simple sandwich";
        assertEquals("A simple sandwich", sandwich.create());

        HamDecorator sandwichWithHam = new HamDecorator(sandwich);
        assertEquals("A simple sandwich with ham", sandwichWithHam.create());

        CheeseDecorator sandwichWithCheese = new CheeseDecorator(sandwichWithHam);
        assertEquals("A simple sandwich with ham with cheese", sandwichWithCheese.create());
    }

}

interface Sandwich {

    String create();

}

abstract class SandwichDecorator implements Sandwich {

    private final Sandwich delegate;

    protected SandwichDecorator(Sandwich delegate) {
        this.delegate = delegate;
    }

    protected Sandwich delegate() {
        return delegate;
    }

}

class HamDecorator extends SandwichDecorator {

    protected HamDecorator(Sandwich delegate) {
        super(delegate);
    }

    @Override
    public String create() {
        return delegate().create() + " with ham";
    }

}

class CheeseDecorator extends SandwichDecorator {

    protected CheeseDecorator(Sandwich delegate) {
        super(delegate);
    }

    @Override
    public String create() {
        return delegate().create() + " with cheese";
    }

}
