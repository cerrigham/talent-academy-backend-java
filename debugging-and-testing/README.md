[Back](../README.md) to main page.

# Debugging and Testing

## Testing with JUnit

JUnit is the most widely used testing framework for Java.
Learn [how to write tests](https://www.udemy.com/course/java-for-absolute-beginners-c/learn/lecture/9604940) for your Java code.

**Attention**
> The video talks about JUnit 4, now we are using JUnit 5.
> Learn the basic concepts because they are the same.
> 
> For more information about JUnit 5, please take a look at the [official guide](https://junit.org/junit5/docs/current/user-guide/).
> 
> Always remember that your **Mentor** will be ready for clarify tour doubts.

[Here](src/test/java/test/SimpleTest.java) you can find a simple test.
From now on we can expect to write tests instead on `main(...)`.

## Debugging

A debugger is a special tool that you can use to execute your code in a strictly controlled environment. It lets you review and analyze the inner state of your application and find and fix bugs that may be hidden deep within your code.

**Attention**
The following links talk about IntelliJ Idea debugging, so if you use or will use another IDE (Eclipse, Visual Studio Code, ...) some command may be different.
- [First steps](https://blog.jetbrains.com/idea/2020/05/debugger-basics-in-intellij-idea/)
- [First debug example](https://www.jetbrains.com/help/idea/debugging-your-first-java-application.html)
- [Remote debug](https://www.jetbrains.com/help/idea/tutorial-remote-debug.html) very useful in some contexts.

> Always remember that your **Mentor** will be ready for clarify tour doubts.

## Excercises

### 1
Create a class Calculator with simple methods sum, diff, mul and div (with Integer parameters). <br>
Then create all the test methods (positive case, negative case, exception case) and modify methods in Calculator class in order to avoid exceptions and errors (i.e. nullPointerException, divByZero, ...)

### 2
Modify Calculator class using Generics/Interface, so create ad hoc test case for each function.

### 3
Read Junit and Mockito documentations, write down any questions or doubt. We'll try to solve them tomorrow in the afternoon. 


