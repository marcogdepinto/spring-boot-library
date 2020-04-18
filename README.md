# MyLibrary Spring Boot Server

A simple web application to manage your book library. It works with `curl` requests, no graphical interface.

# How it works

Run the .jar file by opening your command line and typing `java -jar %PATH_TO_JAR_FILE%`. This will start the Spring Boot server.

![](https://github.com/marcogdepinto/spring-boot-library/blob/master/pictures/SpringBoot.PNG)

Open another command line to use make requests to the server.

![](https://github.com/marcogdepinto/spring-boot-library/blob/master/pictures/Prompt.PNG)

Below a list of valid commands:

1) Create a new book: `$ curl localhost:8080/books/add -d bookTitle="PYTHON Guida Completa" -d author="test"`

2) Get the list of books available on the server: `$ curl localhost:8080/books/all`

3) Get books by id: `$ curl http://localhost:8080/books/get/1`

Mapped URLs:

1) Get the full list of books: `http://localhost:8080/books/all/`

2) Get books by ID: `http://localhost:8080/books/get/{id}`

# Example of output 

`[{"bookTitle":"SQL Cookbook","author":"test","id":1},{"bookTitle":"PYTHON Guida Completa","author":"test","id":2},{"bookTitle":"L'arte della guerra","author":"Sun Tzu","id":3}]`

# Stack

Java, Spring Boot, MySQL.

Main application in `src/main/java/com/mylib/library`
Tests in `src/test/java/com/mylib/library`

# DB structure

ID, bookTitle and author.

# Next steps

Simple graphical interface to get the list of books mapped at the `/` location.
