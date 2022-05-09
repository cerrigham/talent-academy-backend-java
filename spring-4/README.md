[Back](../README.md) to main page.

# Spring Part 4

## REST with Spring MVC

A RESTful API is an architectural style for an application program interface (API) that uses HTTP requests to access and use data. <br/>
That data can be used to GET, PUT, POST and DELETE data types, which refers to the reading, updating, creating and deleting of operations concerning resources. 
[Here](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html) to learn about Spring MVC framework. <br/>
[Here](https://www.youtube.com/watch?v=Ku3gsv7_bCc) a video explanation of MVC and Spring MVC. <br/>
[Here](https://spring.io/guides/gs/rest-service/) a tutorial.
[Here](https://www.baeldung.com/java-dto-pattern) something about DTO design pattern.

### MVC Model View Controller
In the MVC pattern, features are divided into three components based on three separate concerns. Firstly, the view is responsible for rendering UI elements. Secondly, the controller responds to UI actions. And the model handles business behaviors and state management. <br/>
In most implementations, all three components can directly interact with each other. However, in some implementations, the controller is responsible for determining which view to display. <br/>
The diagram below shows the MVC flow of control: <br/>
![image](https://user-images.githubusercontent.com/6083938/167494057-d6ce557e-69f0-45cf-8f51-e866e415557c.png)
<br/>
The model represents the whole business logic layer. The view represents the data fetched from the model. In addition, it handles presentation logic. Lastly, the controller handles control flow logic and updates the model.<br/>

MVC doesn't specify how the view and the model should be structured internally. Usually, the view layer is implemented in a single class.

### Design Pattern in Spring
Read [Here](https://www.baeldung.com/spring-framework-design-patterns) about design pattern in Spring. 

# Examples

Download the project contained in the .zip file, is the same project used for Sprind Data module but take a look at che BookController class and the BookService one.

# Exercices

## 1
Create Controller and Service class for the Customer and Borrow entity.
Also create tesst for all the methods. 

