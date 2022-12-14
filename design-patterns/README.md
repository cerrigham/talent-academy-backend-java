[Back](../README.md) to main page.

# Java Common OOP Patterns

Take a look at some design patterns frequently used in Java:

- [Singleton](https://www.udemy.com/course/java-design-patterns-tutorial/learn/lecture/244390)
- [Abstract Factory](https://www.udemy.com/course/java-design-patterns-tutorial/learn/lecture/318052)
- [Builder](https://www.udemy.com/course/learn-creational-design-patterns-in-java/learn/lecture/10268372)
- [Adapter](https://www.udemy.com/course/java-design-patterns-tutorial/learn/lecture/359623)
- [Decorator](https://www.baeldung.com/java-visitor-pattern)
- [Visitor](https://www.baeldung.com/java-visitor-pattern)
- [Strategy](https://www.baeldung.com/java-strategy-pattern)
- [MVC](https://www.udemy.com/course/java-design-patterns-tutorial/learn/lecture/227033#overview) e successivi capitoli (dal 4 al 9)

# Other links
- [General](https://refactoring.guru/design-patterns/classification)
- [Catalog](https://refactoring.guru/design-patterns/catalog)
- [Singleton](https://refactoring.guru/design-patterns/singleton) and[here](https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm)
- [Abstract Factory](https://refactoring.guru/design-patterns/abstract-factory) and [here](https://italiancoders.it/abstract-factory-design-pattern/) and - [here](https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm)
- [Builder](https://italiancoders.it/builder-pattern-un-ottima-alternativa-al-costruttore/)
- [Adapter](https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm)
- [Decorator](https://italiancoders.it/decorator-pattern/)
- [Visitor](https://italiancoders.it/visitor-pattern/)
- [Strategy](https://refactoring.guru/design-patterns/strategy) and [here](https://italiancoders.it/strategy-design-pattern/)

# Examples

Let's put all in practice

- [Singleton](src/test/java/test/SingletonTest.java),
- [Abstract Factory](src/test/java/test/AbstractFactoryTest.java),
- [Builder](src/test/java/test/BuilderTest.java),
- [Adapter](src/test/java/test/AdapterTest.java),
- [Decorator](src/test/java/test/DecoratorTest.java),
- [Visitor](src/test/java/test/VisitorTest.java),
- [Strategy](src/test/java/test/StrategyTest.java),

# Excercises

# 1 - Singleton
Create a singleton Servers of lazy type. This singleton stores the list of servers (as String). Implement the following functionalities:
- adding a server to the list
- a method adding the server to the list should return boolean (true if the server has been added to the list, false if it's otherwise)
- adding is possible, if its name starts from http or https
- adding a duplicated name is impossible.
- downloading a list of servers, that names start from http.
- downloading a list of servers, that names start from https

# 2 - Builder
Create a builder for a class, that hass the following fields:
```
public class Dog {
  private String name;
  private String type;
  private Integer age;
  private List<String> toys;
```  
Builder should be defined inside the class Dog and shound be the only of creating its instance.

# 3 ...
[Here](https://homeworks.java.en.sdacademy.pro/design_pattern_and_good_practices/exercises/#exercise-6-adapter) the others one
