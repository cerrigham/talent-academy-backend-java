[Back](../README.md) to main page.

# Spring Part 1

## Introduction

Ok, [let's go](https://www.youtube.com/watch?v=gq4S-ovWVlM). <br/>
Spring makes it easy to create Java enterprise applications. It provides everything you need to embrace the Java language in an enterprise environment. <br/>
Spring is open source. It has a large and active community that provides continuous feedback based on a diverse range of real-world use cases. <br/>
The Spring Framework is divided into modules. Applications can choose which modules they need. At the heart are the modules of the core container, including a configuration model and a dependency injection mechanism. Beyond that, the Spring Framework provides foundational support for different application architectures, including messaging, transactional data and persistence, and web. It also includes the Servlet-based Spring MVC web framework and, in parallel, the Spring WebFlux reactive web framework.<br/>
Learn [here](https://docs.spring.io/spring-framework/docs/current/reference/html/index.html) about this framework. <br/>

## Spring Ecosystem 
![image](https://user-images.githubusercontent.com/6083938/175878268-a84caa3f-c4ff-42ec-82f1-62a95c64ce5f.png)

## Configuration

Take a look [here](https://www.udemy.com/course/spring-framework-video-tutorial/) for get all the information about Spring configuration. 

## Beans definition

[Here](https://www.baeldung.com/spring-bean) a definition of Spring Bean. <br/>
Learn [here](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-definition) about Bean. <br/>
A Beans must have a scope:
- Singleton (the container creates a single instance of that bean)
- Prototype (a bean with the prototype scope will return a different instance every time it is requested from the container)
- Request
- Session
- Application (when beans are application scoped, the same instance of the bean is shared across multiple servlet-based applications running in the same ServletContext, while singleton scoped beans are scoped to a single application context only.

## Basic course
[Here](https://www.youtube.com/playlist?list=PLCbSCJEIR6CqgCLyVzqp49xOm8A5YDTKA) a playlist about Spring. <br/>

## Examples

Let's make something together.
