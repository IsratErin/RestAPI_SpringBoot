# User Management REST API

A RESTful web service built with **Java Spring Boot** for managing users and their posts. This API demonstrates modern backend development practices including JPA persistence, input validation, global exception handling, and HATEOAS-compliant responses.

## Tech Stack

- **Java 17**
- **Spring Boot 4.0**
- **Spring Data JPA**
- **MySQL** (H2 supported for development)
- **Maven**
- **Hibernate Validator**
- **Spring HATEOAS**

## Features

- Full CRUD operations for User management
- One-to-Many relationship between Users and Posts
- Input validation with meaningful error messages
- Global exception handling with custom error responses
- HATEOAS hypermedia links for API discoverability
- RESTful URI design following best practices

## API Endpoints

### Users

| Method   | Endpoint          | Description              |
| -------- | ----------------- | ------------------------ |
| `GET`    | `/jpa/users`      | Retrieve all users       |
| `GET`    | `/jpa/users/{id}` | Retrieve a specific user |
| `POST`   | `/jpa/users`      | Create a new user        |
| `DELETE` | `/jpa/users/{id}` | Delete a user            |

### Posts

| Method | Endpoint                         | Description              |
| ------ | -------------------------------- | ------------------------ |
| `GET`  | `/jpa/users/{id}/posts`          | Get all posts for a user |
| `GET`  | `/jpa/users/{id}/posts/{postId}` | Get a specific post      |
| `POST` | `/jpa/users/{id}/posts`          | Create a post for a user |

## Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+
- MySQL 8.0+ (or use H2 for testing)

### Installation

1. **Clone the repository**

   ```bash
   git clone https://github.com/yourusername/RestAPI_SpringBoot.git
   cd RestAPI_SpringBoot/rest-web-services
   ```

2. **Configure the database**

   Update `src/main/resources/application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/social-media-database
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   ```

3. **Build and run**

   ```bash
   ./mvnw spring-boot:run
   ```

4. **Access the API**
   ```
   http://localhost:8080/jpa/users
   ```

```

```
