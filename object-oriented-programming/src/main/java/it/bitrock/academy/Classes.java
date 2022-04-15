package it.bitrock.academy;

// it's a class!
public class Classes {

    public static void main(String[] args) {
        // region basic classes
        // instead of...
        String username1 = "Alice";
        int age1 = 25;
        String username2 = "Bob";
        int age2 = 24;
        // etc

        Person alice = new Person("Alice", 25);
        // ...
        alice.celebrateBirthday();
        // System.out.println(alice.secret); // not accessible
        // endregion

        // region inheritance
        Animal aCat = new Cat();
        aCat.walk();
        Animal aDog = new Dog();
        aDog.walk();
        // endregion
    }

}

class Person {
    String username;
    int age;
    private String secret;

    public Person(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public void celebrateBirthday() {
        age++;
    }
}

abstract class Animal {
    abstract void walk();
}

class Cat extends Animal {
    @Override
    void walk() {
        System.out.println("I'm a Cat and I'm walking");
    }
}

class Dog extends Animal {
    @Override
    void walk() {
        System.out.println("I'm a Dog and I'm walking");
    }
}
