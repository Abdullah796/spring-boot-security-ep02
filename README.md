# spring-boot-security-ep02

## Motivation

The motivation behind these episodes is to explore spring security in spring boot.

## Project Description

This project is an example of **JDBC Authentication** and **Authorization** using spring security.
In this version of spring security, **WebSecurityConfigurerAdapter** is deprecated.
Authorization is done by **Form Login**.

I have made 2 users:

```
# : Username : Password : Role

1 : user     : user     : USER
2 : admin    : admin    : ADMIN
```

I have made 3 routes:

```
# : Route  : Description 

1 : /      : This is a home route and accessible by everyone.
2 : /admin : This is an admin route and accessible by ROLE_ADMIN.
3 : /user  : This is a user route and accessible by ROLE_USER. 
```

## Tools

* Spring boot 3.1.3
* Java 17
* Maven

## Setup application using terminal

First, install the dependencies

```sh
mvn install
```

To run the application, you can use:

```sh
mvn clean spring-boot:run
```

Application will be running on port 8080.

## Setup application using IntelliJ IDEA

- Open a project in IntelliJ IDEA.
- It will auto-build the project; if not, open pom.xml, right-click, and press maven->reload project.
- Then run the application.
- Application will be running on port 8080.