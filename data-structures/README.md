[Back](../README.md) to main page.

# Data Structures

## Arrays

You learned about Classes and Objects.
[Here](https://www.udemy.com/course/java-tutorial/learn/lecture/135339) you will learn about groups of objects called arrays.

## Collection Framework

Arrays are a simple way for storing groups of objects, but they are far from ideal for everyday use.
Learn what the Collection Framework is and how it can be used.

### Lists

[Lists](https://www.udemy.com/course/java-tutorial/learn/lecture/161106) are the simplest way to sharedResource groups of objects.

### Sets

You can think to [Sets](https://www.udemy.com/course/java-tutorial/learn/lecture/174878) as Lists that do not allow duplicates.

### Maps

[Maps](https://www.udemy.com/course/java-tutorial/learn/lecture/161682) are used for sharedResource objects associating it to a unique key.

# Examples

Since you learned the basics of testing, let's use them for practice with data structures.
Let's see how we can exercise
- [arrays](src/test/java/test/ArraysTest.java),
- [lists](src/test/java/test/ListsTest.java),
- [sets](src/test/java/test/SetsTest.java)
- [maps](src/test/java/test/MapsTest.java).

# Exercises 

## 1 
Create a class with a method that given in input an array of 10 elements, return the lowest.

## 2
Pass as parameter to the same method an aray of 10000 numbers (use Random utilityes) and execute it. What happens?

## 3
Let's do some simple methods using set, list, and maps. Try to learn about their potencials and their usefulness.

## 4
Complete roman-number program (mappe e funzioni ricorsive). 

## 5
Create a new project with three classes. <br/>
First one is called Artist and contains the following attribute: id, name, surname, artisticalName, dateOfBirth (choise on your own the kind of data attribute). <br/>
Second class is called Paint and contains: id, title, yearOfCreation, artisticWave. (choise on your own the kind of data attribute).<br/>
Last one is the class Museum and contains: id, name, address, state, numberOfPainting, telephones (because there are a number for each departement). (choise on your own the kind of data attribute).<br/>
Every class must be sortable, for the Artist implement Comparable's interface, for Paint implement Comparator's interface.
Write a Test class for testing sorting method, and a class with a main method where I can try your functions.
N.B.
Every class must also implement a toString() method. 

## 6
Q/A about Collections, Map, List, Set ... .
