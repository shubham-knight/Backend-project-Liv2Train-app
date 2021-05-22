Liv2Train Spring Boot REST API
===

This project is a basic Spring Boot project where I have made Basic API's which fulfill HTTP requests such as GET, POST, PUT, DELETE. Here I Simply add some training centers with details about them into the database.This project uses jdbc connection to connect to MySQL database to store the data.Also, this project uses Auditing with JPA,Hibernate and Spring Data JPA to create realtime Timestamp feature.

Input and Output
===

The input and output for the program is in JSON form and is directly given in the Postman Tool.

For input, External JSON file can be given.

Example:

```    
        "createdDate": "2021-05-				22T10:25:31.544+00:00",
        "lastModifiedDate": "2021-05-				22T10:25:31.544+00:00",
        "address": "BJS",
        "stuCapacity": 50,
        "email": "xyz@gmail.com",
        "state": "Rajasthan",
        "centerCode": "ABCDEFGHI102",
        "centerName": "Center 1",
        "city": "Jodhpur",
        "phone": "9874563215",
        "pincode": "342045",
        "courses": "Java,Kotlin"
    
```



Database
==

MySQL version 8.0 is used in this project.


Technology Used
==
Dependencies:Spring Web, MySQL Driver, Spring Data JPA

Java version 11

Spring Tools 4.10.0.RELEASE

Eclipse IDE

Postman tool

How to run it
==

Simply extract the ZIP file and import the project in the eclipse IDE. Then simply run the project as Spring Boot App in "Run as" Dropdown.

It will be better if you use POSTMAN tool which is an interactive and automatic tool for verifying the APIs of the project.

Note
===
It might be possible that while running the project , it may fail to connect to MySQL server. This may be version issue and can be simply rectified by adding the port number on which the MySQL server is running into the url for database which is present in application.properties file.

For Example:

```
spring.datasource.url=jdbc:mysql://localhost:3306/assignmentSenpiper
```

Also, in the same application.properties file, you have to change the username and password for your MySQL server.

As MySQL works on a server so its impossible to create its executable file. Thus to run this project, the person has to make a database manually in MySQL.

Created By
===

Shubham Nimesh |
BTech(CSE) |
IIT Indore
