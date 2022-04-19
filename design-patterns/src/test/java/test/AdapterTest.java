package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdapterTest {

    @Test
    @DisplayName("call to third-party driver adapted")
    void callToThirdPartyDriverAdapted() {
        Client client = new Client();
        ThirdPartyDriver delegate = new ThirdPartyDriver();
        MyDriverAdapter myDriver = new MyDriverAdapter(delegate);
        String result = client.use(myDriver);

        assertEquals("something done", result);
    }

}

class Client {

    public String use(MyDriver myDriver) {
        return myDriver.doSomething();
    }

}

interface MyDriver {

    String doSomething();

}

class ThirdPartyDriver {

    public String doSomething() {
        return "something done";
    }

}

class MyDriverAdapter implements MyDriver {

    private final ThirdPartyDriver delegate;

    public MyDriverAdapter(ThirdPartyDriver delegate) {
        this.delegate = delegate;
    }

    @Override
    public String doSomething() {
        return delegate.doSomething();
    }

}
