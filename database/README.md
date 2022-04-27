[Back](../README.md) to main page.

# Fundamentals

## Relational database intro

A relational database defines database relationships in the form of tables. 
The tables are related to each other based on data common to each.
In this tutorial our DBMS reference is postgreSQL.

## Table

A table is a collection of related data entries, and it consists of columns and rows.
A column holds specific information about every record in the table.
A record (or row) is each individual entry that exists in a table.

[Here](https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-create-table/) you can learn how to create a table.

## Query

A query is the way for request data or information from a database table or combination of tables. 
This data may be generated as results.
You use Structured Query Language (SQL) for write down query.

## insert/update/delete

For write data from a table you need to use INSERT statement.
For update a row into a table you need to user UPDATE statement.
For delete data from a table you need to use DELETE statement.
Learn [here](https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-insert/), [here](https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-update/) and [here](https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-delete/) the basics of these statements.

## select

For retrieve information from one or more table you need to use SELECT statement.
Sometimes you will need to do the same thing for multiple times.
Learn [here](https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-select/) how Java allows you to do that.

## join

A join clause is used to combine rows from two or more tables, based on a related column between them.
There are several kind of JOIN, take a look [here](https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-joins/) to familiarize with them.

## where

Sometimes you will need to do data skimming.
Learn [here](https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/) how SQL allows you to do that.

## order by

When you query data from a table, the SELECT statement returns rows in an unspecified order. To sort the rows of the result set, you use the ORDER BY clause in the SELECT statement.
Learn [here](https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-order-by/) how it works.

## group by

The GROUP BY clause divides the rows returned from the SELECT statement into groups. For each group, you can apply an aggregate function e.g. SUM() to calculate the sum of items or COUNT() to get the number of items in the groups.
Learn [here](https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-group-by/) how SQL allows you to do that.
Take a look also to the aggregate functions.

# Exercises

## 1 
Download and install postgreSQL on your machine.
Also download and istall Postico.
[Here](https://postgresapp.com/) all that you need :-)
Create a new database called "library". Create three tables: "Book", "Customer" and "Borrow".
The minimum set of informations are:
- book (id, title, author, conditions)
- customer (id, name, address, email, phone)
- borrow (id, book_id, customer_id, date_start, date_end)
Feel free to add other informations in each table. 
Populated these tables within some data.

## 2 
Create and test the following queries:
- all the books in the library with title and condition
- all the book of a given author
- all the book currently in borrow (suppose that a date_end not valorized means that the borrow is in pending)
- all the borrows of each customers
- a count of the borrows of each customers
- a list of all the books with the count of the borrows

## 3 
Delete some records from the tables, also try to create some inconsistency, let's do the same query above and check results. 
