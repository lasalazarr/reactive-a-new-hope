# reactive-a-new-hope
Demonstration how to move an blocking module based on Springboot to reactive modules based on Spring Webflux.

This repository is used to explain the following talk:

## Reactive; A new hope !

It is a time of developers complain about performance. Rebel developers, striking from a hidden base, have won their first victory against the evil blocking applications. In this session, attendees will learn about a real-world evolution to reactive; we will be covering tips and tricks of an experience in evolve a Banking Application; Through the session you are going to get tips, tricks, pros, cons and the reasons for being involved on move forward to non-bloking application and present sample code and explain the security concerns on this evolution. We will be using snippets code based on JAVA, JWT, JWS, Auth0, Spring Boot, Reactor and Webflux deployed to Cloud.

# Requirements

- JDK 14 

# Projects

## 1) Spring MVC Rest API and Spring Data to connect to the database

At the repository you will find an Spring-MVC project using Springboot to launch our application as a fat or uber jar; go to the folder customers-api-traditional

### Compile

To compile you need gradle instaleed; and then, run on the console:

``
gradle bootRun
``

### Run

To run the application just go to the build/lib folder and execute on the console:

``
java -jar customers-api-traditional-0.0.1-SNAPSHOT.jar
``

## 4) Reactive API and non blocking R2DBC Connection to the database

An application is running with Webflux over Netty with R2DBC conection to a H2SQL database; go to the folder customers-api-reactive

### Compile

To compile you need gradle instaleed; and then, run on the console:

``
gradle bootRun
``

### Run

To run the application just go to the build/lib folder and execute on the console:

``
java -jar customers-api-reactive-0.0.1-SNAPSHOT.jar
``

## 4) Reactive API and non blocking R2DBC Connection to the database

An application with security using OAUTH2 and AUTH0 as autorization server; running with Webflux over Netty with R2DBC conection to a H2SQL database; go to the folder customers-api-reactive-full

### Compile

To compile you need gradle instaleed; and then, run on the console:

``
gradle bootRun
``

### Run

To run the application just go to the build/lib folder and execute on the console:

``
java -jar customers-api-reactive-full-0.0.1-SNAPSHOT.jar
``

