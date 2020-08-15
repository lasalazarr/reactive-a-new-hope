# reactive-a-new-hope
Demonstration how to move an blocking module based on Springboot to reactive modules based on Spring Webflux.

This repository is used to explain the following talk:

## Reactive; A new hope !

It is a time of developers complain about performance. Rebel developers, striking from a hidden base, have won their first victory against the evil blocking applications. In this session, attendees will learn about a real-world evolution to reactive; we will be covering tips and tricks of an experience in evolve a Banking Application; Through the session you are going to get tips, tricks, pros, cons and the reasons for being involved on move forward to non-bloking application and present sample code and explain the security concerns on this evolution. We will be using snippets code based on JAVA, JWT, JWS, Auth0, Spring Boot, Reactor and Webflux deployed to Cloud.

# Requirements

- JDK 14 
- [BlockHound](https://github.com/reactor/BlockHound)

# Steps

## 1) Spring MVC Rest API and Spring Data to connect to the database

At the repository you will find an Spring-MVC project using Springboot to launch our application as a fat or uber jar.

### Compile

To compile you need gradle instaleed; and then, run on the console:

``
gradle bootRun
``

### Run

To run the application just go to the build/lib folder and execute on the console:

``
java -jar monolith-migrate-to-reactive-modules-0.0.1-SNAPSHOT.jar
``

## 3) Reactive API and Blocked JDBC Connection

At the reactive-jbdc-blocked branch the application is running with Webflux over Netty but producing blocking threads to connect via JDBC to the Database. 

## 4) Reactive API and non blocking R2DBC Connection to the database

At the Master branch the application is running with Webflux over Netty with R2DBC conection to a H2SQL database.


