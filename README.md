# Proyecto para la segunda semana de la formación "Master Java".

<h3>Author: Ismael Maldonado<h3>
<h3>Teacher: Carlos Arranz</h3>
<h4>Company: Sinensia</h4>

# Project Description

This project is a simple CRUD (Create, Read, Update, Delete) application developed using Spring Boot and relies on a local MySQL database.

## Features

The main features of this application include:

- **Add**: You can add new clients to the database.
- **Read**: You can retrieve client information from the database.
- **Update**: You can update client information in the database.
- **Delete**: You can remove clients from the database.

## Automatic Data Initialization

To ensure that the application starts with some initial data in the database, I have implemented the `CommandLineRunner` interface in the main application class. This automatically adds two records to the database upon application startup.

## Database Configuration

By default, the application is configured to create and drop the database schema each time it starts. If you want to validate the persistence of data without altering the database schema, you can change the following property in the `application.properties` file:

```properties
spring.jpa.hibernate.ddl-auto=create-drop
```

to:

```properties
spring.jpa.hibernate.ddl-auto=validate
```

This will ensure that the database schema is not modified, and you can verify the correct persistence of data.

Feel free to customize and extend this project to meet your specific requirements.

## Getting Started

To get started with this project, follow these steps:

1. Clone the repository.
2. Configure your MySQL database connection in the `application.properties` file.
3. Build and run the application.

Ismael Maldonado - 22/09/2023
