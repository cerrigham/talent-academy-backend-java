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

At last, some examples again [here](src/main/java/it/bitrock/academy/Loops.java).
