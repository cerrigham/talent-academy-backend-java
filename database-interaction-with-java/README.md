
[Back](../README.md) to main page.

# Database Interaction With Java

## JDBC

JDBC stands for Java Database Connectivity. JDBC is a Java API to connect and execute the query with the database. It is a part of JavaSE (Java Standard Edition). JDBC API uses JDBC drivers to connect with the database.
Look [here](https://www.javatpoint.com/java-jdbc) to learn about it.

## JPA

JPA is just a specification that facilitates object-relational mapping to manage relational data in Java applications. It provides a platform to work directly with objects instead of using SQL statements.
Look [here](https://www.javatpoint.com/jpa-tutorial) for an introduction.
JPA is a kind of interface, most common implementations are: Hibernate, EclipseLink and Apache Open JPA, in these academy we'll talk and learn about Hibernate. <br/>
[Here](https://www.objectdb.com/java/jpa/persistence/managed) and [here](https://jstobigdata.com/jpa/different-states-of-an-object-in-jpa/) Entity Object Life Cycle.<br/>

# Examples

Let's see some examples:

- [JDBC connection and query](src/main/java/TutorialJdbc.java),
- [JPA connections](src/test/java/test/StreamsTest.java)

# Exercises 

## 1 
Modify TutorialJdbc.java (and TutorialJdbcTest.java) in order to do the queries from the previous module.

# 2
Download and open TutorialJpa project, take a look of the difference between JDBC and JPA (we'll study in deep later).
