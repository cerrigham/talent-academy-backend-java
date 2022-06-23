[Back](../README.md) to main page.

# Hibernate Part 2

## HQL, Criteria

### HQL
Hibernate Query Language (HQL) is same as SQL (Structured Query Language) but it doesn't depends on the table of the database. Instead of table name, we use class name in HQL. So it is database independent query language. <br/>
Look [here](https://www.javatpoint.com/hql) to learn about them.

### Criteria
The Criteria API allows us to build up a criteria query object programmatically, where we can apply different kinds of filtration rules and logical conditions.<br/>
Look [here](https://www.baeldung.com/hibernate-criteria-queries) to learn about them in a modern way. <br/>
[Here](https://www.tutorialspoint.com/hibernate/hibernate_criteria_queries.htm) the previous version. <br/>
An helpful [video](https://www.youtube.com/watch?v=Id_5VCGX5to). <br/>
Advanced case [here](https://thorben-janssen.com/hibernate-tip-left-join-fetch-join-criteriaquery/). <br/><br/>
Metamodel [here](https://www.baeldung.com/hibernate-criteria-queries-metamodel) <br/>
Example join with Criteria and Metamodel [here](https://vladmihalcea.com/jpa-criteria-metamodel/).


## Fetch type

The FetchType defines when Hibernate gets the related entities from the database, and it is one of the crucial elements for a fast persistence tier. In general, you want to fetch the entities you use in your business tier as efficiently as possible. <br/>
There are two different fetch type:
 - Eager Loading is a design pattern in which data initialization occurs on the spot.
 - Lazy Loading is a design pattern that we use to defer initialization of an object as long as it's possible.
Look [here](https://www.baeldung.com/hibernate-lazy-eager-loading) to learn about difference.

## Persistence context

An EntityManager instance is associated with a persistence context. <br/>
A persistence context is a set of entity instances in which for any persistent entity identity there is a unique entity instance. <br/>
Within the persistence context, the entity instances and their lifecycle are managed. <br/>
The EntityManager API is used to create and remove persistent entity instances, to find entities by their primary key, and to query over entities.
Learn more [here](https://www.baeldung.com/jpa-hibernate-persistence-context).

# Examples

Download the project into the .zip file, it's a very simple one.
Let's make some tests and some useful classes and methods.


