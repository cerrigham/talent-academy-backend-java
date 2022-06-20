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
<br/>
[Here](https://www.baeldung.com/jpa-cascade-types) JPA Cascade types. <br/>

## Entity Manager

JPA Entity Manager is the core of JPA, Hibernate implements two JPA interfaces: EntityManagerFactory and EntityManager.
Learn [here](https://www.journaldev.com/17379/jpa-entitymanager-hibernate) about entity manager functions.

# Examples

Download tutorial-hibernate.zip and open the project with ItelliJ. 

# Exercices

Modify the tutorial-hibernate project creating the following query:
 - all the books in the library with title and condition
 - all the book of a given author
 - all the book currently in borrow (suppose that a date_end not valorized means that the borrow is in pending)
 - all the borrows of each customers
 - a count of the borrows of each customers
 - a list of all the books with the count of the borrows
Tips: create a function for each query with the needed parameters and the session one.

