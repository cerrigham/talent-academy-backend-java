[Back](../README.md) to main page.

# Hibernate Part 2

## HQL, Criteria

Hibernate Query Language (HQL) is same as SQL (Structured Query Language) but it doesn't depends on the table of the database. Instead of table name, we use class name in HQL. So it is database independent query language. <br/>
Look [here](https://www.javatpoint.com/hql) to learn about them.
<br/>
The Criteria API allows us to build up a criteria query object programmatically, where we can apply different kinds of filtration rules and logical conditions.<br/>
Look [here](https://www.baeldung.com/hibernate-criteria-queries)to learn about them.

## Fetch type

Again, Java 8 introduces also the powerful Stream API.
Look [here](https://www.udemy.com/course/stream-api-in-java-8/) how those APIs can help you to write better code.

## Persistence context

An EntityManager instance is associated with a persistence context. <br/>
A persistence context is a set of entity instances in which for any persistent entity identity there is a unique entity instance. <br/>
Within the persistence context, the entity instances and their lifecycle are managed. <br/>
The EntityManager API is used to create and remove persistent entity instances, to find entities by their primary key, and to query over entities.
Learn more [here](https://www.baeldung.com/jpa-hibernate-persistence-context).

# Examples

TODO
Let's see some examples:

- [Lambda Expressions](src/test/java/test/LambdaExpressionsTest.java),
- [Stream API](src/test/java/test/StreamsTest.java),
- [Optional](src/test/java/test/OptionalTest.java).


