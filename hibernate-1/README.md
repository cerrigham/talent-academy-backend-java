[Back](../README.md) to main page.

# Hibernate Part 1

## Entity

In order to define an entity, you must create a class that is annotated with the @Entity annotation.<br/>
The @Entity annotation is a marker annotation, which is used to discover persistent entities.<br/>
Entity is the equivalent of table in RDBMS.

## Relationship

Once you get a set of entities, it is possible define a relationship between them.<br/>
JPA defines four annotations for defining entities:
 - @OneToOne
 - @OneToMany
 - @ManyToOne
 - @ManyToMany

## Entity Manager

Learn [here](https://www.baeldung.com/java-optional) how to get rid of _null_ using _Optional_ instead.

# Examples

Let's see some examples:

- [Lambda Expressions](src/test/java/test/LambdaExpressionsTest.java),
- [Stream API](src/test/java/test/StreamsTest.java),
- [Optional](src/test/java/test/OptionalTest.java).

