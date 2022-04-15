package it.bitrock.academy;

public class Generics {

    public static void main(String[] args) {
        Store<String> aStore = new Store<>();
        Store<Integer> anotherStore = new Store<>();

        aStore.setValue("Hello, Java!");
        anotherStore.setValue(42);

        String stored = aStore.getValue();

        System.out.println(stored);
    }

}


class Store<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
