### PLatform STEP-BY-STEP

```
0. Add .gitignore;
1. Initialize repository and add remote;
2. Create maven project and define api endpoints;
3. Add dependencies and plugins to pom.xml;
4. Thank the devil for XMHELL, configured web.xml and spring-config.xml. Remember web.xml profiles.
5. Create IndexController to test deploy;
6. Create TodoController;
7. Create interfaces for Service and Dao and implement CRUD methods;
8. Implement POST to /api/todo to create a Todo;
```

### WHAT COULD I DO NEXT?

```
0. DTO (Check ModelMapper);
1. Specific TODO API EXCEPTIONS!!!!;
2. @RestControllerAdvice;
3. Use JPA Associations to increase complexity, TODO Importance?;
4. GenericDAO
```

### ENDPOINTS

`/api`

```
GET - DONE!
```

`/api/todos`

```
GET - DONE!
POST - DONE!
PUT
DELETE
```

`/api/todos/{id}`

```
GET
POST
PUT
DELETE
```

### TOOLS && CONCEPTS

GIT

```
    -   Check gitflow;
    -   Remember .gitignore;
```

SPRING

```
    -   Spring Boot && Spring Initializer;
    -   spring-config.xml;
    -   Inversion of Control;
    -   Dependency Injection;
    -   Aspect Oriented Programming;
    -   @Transactional;

    -   MVC
        -   @RestController;
        -   @RequestMapping;
        -   ResponseEntity;
        -   @Component;
        -   @Service;
        -   @Repository;
        -   @RequestBody;
```

REST

```
    -   Design the most RESTful API and make me proud;
```

TOMCAT

```
    -   Applicational server;
    -   web.xml (deployment descriptor);
```

OBJECT RELATIONAL MAPPING

```
    -   Java Persistence API;
    -   Impedance Mismatch
    -   Inheritance Mapping
    -   Associations
    -   Id Generation
```

DATABASE

```
-   MYSQL
    -   Relational Database Management System;
-   H2
    -   In-Memory Database;
```

TESTS

```
    -   JUnit;
    -   Mockito;
```
