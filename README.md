# Marvellous Portal API

REST API for managing batch entries, built with Spring Boot and MongoDB.

## Features

- CRUD endpoints for batch entries under `/batches`
- Layered architecture: controller, service, repository
- Bean Validation on input (`@NotBlank`, `@Positive`)
- Global exception handling with `@ControllerAdvice` and a consistent error response
- MongoDB persistence with Spring Data

## Tech stack

Java, Spring Boot, Spring Data MongoDB, Jakarta Bean Validation, Lombok, Maven

## Project structure

```
src/main/java/com/marvellous/MarvellousPortal
├── controller   # REST endpoints
├── service      # business logic
├── repository   # MongoDB repository
├── entity       # BatchEntry document
└── exception    # custom exception and global handler
```

## API endpoints

Base path: `/batches`

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/batches` | Get all batch entries |
| POST | `/batches` | Create a batch entry |
| GET | `/batches/id/{id}` | Get a batch entry by id |
| PUT | `/batches/id/{id}` | Update name and fees of a batch entry |
| DELETE | `/batches/id/{id}` | Delete a batch entry |

### Example request body

```json
{
  "name": "Java Batch",
  "fees": 5000
}
```

### Validation and errors

- `name` must not be blank and `fees` must be greater than zero. Invalid input returns `400 Bad Request`.
- A missing id returns `404 Not Found`.
- Errors are returned in a consistent `ErrorResponse` format by the global exception handler.

## Getting started

**Prerequisites:** JDK (see `pom.xml` for the version), Maven, and MongoDB running locally on port 27017.

```bash
git clone https://github.com/Snehuu305/marvellous-portal-api.git
cd marvellous-portal-api
mvn spring-boot:run
```

The app starts on `http://localhost:8080` and uses the `MarvellousFullStack` database on `localhost:27017`. You can change this in `src/main/resources/application.properties`.

## Author

Sneha Borgaon
