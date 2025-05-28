# API Gateway

A Spring Boot-based API Gateway that manages routing and configuration for microservices. It leverages environment variables for dynamic service discovery and configuration.

## Features

- Loads configuration from `.env` file using `io.github.cdimascio.dotenv.Dotenv`.
- Supports dynamic setting of Spring application properties like:
  - Application name
  - Consul host and port for service discovery
  - Server port
  - Service names for student and school microservices
- Boots up a Spring Cloud API Gateway application

## Prerequisites

- Java 17+ (or compatible with your Spring Boot version)
- Maven for building and running the project
- `.env` file with required environment variables

## Environment Variables

Your `.env` file should include:

```env
SPRING_APPLICATION_NAME=api-gateway
SPRING_CLOUD_CONSUL_HOST=localhost
SPRING_CLOUD_CONSUL_PORT=8500
SERVER_PORT=8080
STUDENT_SERVICE_NAME=student-service
SCHOOL_SERVICE_NAME=school-service
Adjust values to fit your environment.
```

## Build & Run
Build the project with Maven:

```bash
mvn clean install
```

Run the application:

```bash
mvn spring-boot:run
```

or

```bash
java -jar target/api-gateway-0.0.1-SNAPSHOT.jar
```


## Author
Sandrin Muramutsa
