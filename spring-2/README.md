
[Back](../README.md) to main page.

# Spring Part 2

## Annotation-based Dependency Injection

Start from [here](https://www.vogella.com/tutorials/DependencyInjection/article.html#:~:text=Dependency%20injection%20(DI)%20is%20the,an%20instance%20of%20this%20class.).<br/>
In Spring Framework annotations related to dependency injection are, namely 
 - @Resource
 - @Inject
 - @Autowired

Look [here](https://www.baeldung.com/spring-annotations-resource-inject-autowire) and [here](https://www.baeldung.com/spring-autowire) to learn about them.
Autowired best practices [here](https://springframework.guru/best-practices-for-dependency-injection-with-spring/).

## Spring Boot

Look [here](https://spring.io/projects/spring-boot) to learn about.
<br/>
Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run". <br/>
We take an opinionated view of the Spring platform and third-party libraries so you can get started with minimum fuss. Most Spring Boot applications need minimal Spring configuration. <br/><br/>
Features:
 - create stand-alone Spring applications
 - embed Tomcat, Jetty or Undertow directly (no need to deploy WAR files)
 - provide opinionated 'starter' dependencies to simplify your build configuration
 - automatically configure Spring and 3rd party libraries whenever possible
 - provide production-ready features such as metrics, health checks, and externalized configuration
 - absolutely no code generation and no requirement for XML configuration

# Examples

Download springboot-demo.zip, uncompress and open it with IntelliJ. <br/>
Go to SpringbootDemoApplication.java and start the application (press on the green arrow): <br/>
<img width="1018" alt="Screenshot 2022-05-05 at 14 27 51" src="https://user-images.githubusercontent.com/6083938/166922844-4ad3932e-0d07-4c4d-ab09-2fb0d52b501e.png">
<br/>
Once you see these in your console:<br/>
<img width="1241" alt="Screenshot 2022-05-05 at 14 28 53" src="https://user-images.githubusercontent.com/6083938/166922967-b554709a-9a68-4e1d-8d04-4d993192abee.png">
<br/>
open your browser and write this url http://localhost:8080, if it's all fine you'll read "Hello my Friend".

# Exercises

## 1
Create others endpoint into SprinbootDemoController class.


