[Back](../README.md) to main page.

# Object-Oriented Programming

## Classes and Objects

It's time to earn the basics of Object-Oriented Programming (OOP) in Java.

Take some time to learn what [classes](https://www.udemy.com/course/java-tutorial/learn/lecture/137826) are.
Objects are created from classes that acts as a template for those objects.
Classes contain data, [methods](https://www.udemy.com/course/java-tutorial/learn/lecture/139565), [constructors](https://www.udemy.com/course/java-tutorial/learn/lecture/13976).

It's a complex topic, consider also [this](https://www.codecademy.com/learn/learn-java/modules/learn-java-object-oriented-java-u) as a reference.

## Access, Encapsulation, and Static Methods

Each element (classes, methods, constructors, etc.) explained before can be accessed from every part of the software, or it can have some restrictions.
Learn [here](https://www.codecademy.com/learn/learn-java/modules/java-access-encapsulation-and-static-methods) how to use effectively access modifiers.

## Inheritance and Polymorphism

Classes can be related with other classes with a inheritance relationship.
Learn [here](https://www.udemy.com/course/java-tutorial/learn/lecture/147402) how inheritance works.
After you understand how inheritance works, you can learn [polymorphism](https://www.udemy.com/course/java-tutorial/learn/lecture/149501), one of the three concepts of OOP..

Again, it's a complex topic. Consider [this](https://www.codecademy.com/learn/learn-java/modules/learn-java-inheritance-and-polymorphism) as a reference.

## Generics   

The last topic of this part, and a prerequisite for understanding the Collection Framework, is the Generics concept.
Learn [here](https://www.udemy.com/course/java-tutorial/learn/lecture/152306) how to use this powerful feature.

## Examples

[Here](src/main/java/it/bitrock/academy/Classes.java) you can find examples for classes, and [here](src/main/java/it/bitrock/academy/Generics.java) for generics.

# Excercises

## 1 
Write some functions to test if Java pass variables and objects by value or by reference.

## 2
Write a class called Car with a method called run. These method print the statement "My car is running". <br/>
Write a class called F1Car that extends Car and write a method called run. The ouput will be "My car is running faster". <br/>
Create some instances of Car and F1Car and see what happens when you call run method.

## 3
Complete Car class with some overloaded method (for example a method called refuel, one with string parameter and the oter with Integer one).

## 4
Create all the classes, abstract classes, intefaces with methods useful to design chess game

## 5
We are into the Ferrari factory. We have to design the stearing wheels for every car tipology:
- Supercar 
- GT Car
- F1 Car
<br/>
Basic functions are:
- increase decrease gear
- insert retro gear
- insert null gear
- show velocity
- show rpm
<br/>
GT car:
- contact team Radio
- balancing brake (front)
<br/>
F1 car:
- balacing brake (front and rear)
- drink button
- indicator for correct gear change
