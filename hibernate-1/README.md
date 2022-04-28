[Back](../README.md) to main page.

# Hibernate Part 1

## Entity

In order to define an entity, you must create a class that is annotated with the @Entity annotation.<br/>
The @Entity annotation is a marker annotation, which is used to discover persistent entities.<br/>
Entity is the equivalent of table in RDBMS.<br/>
[Here](https://www.javatpoint.com/hibernate-with-annotation) some examples of entity. 

## Relationship

Once you get a set of entities, it is possible define a relationship between them.<br/>
JPA defines four annotations for defining entities:
 - @OneToOne
 - @OneToMany
 - @ManyToOne
 - @ManyToMany
Learn [here](https://stackabuse.com/a-guide-to-jpa-with-hibernate-relationship-mapping/) Hibernate relationship mapping. 

## Entity Manager

JPA Entity Manager is the core of JPA, Hibernate implements two JPA interfaces: EntityManagerFactory and EntityManager.
Learn [here](https://www.journaldev.com/17379/jpa-entitymanager-hibernate) about entity manager functions.

# Examples

TODO
Let's see some examples:

- [Lambda Expressions](src/test/java/test/LambdaExpressionsTest.java),
- [Stream API](src/test/java/test/StreamsTest.java),
- [Optional](src/test/java/test/OptionalTest.java).

