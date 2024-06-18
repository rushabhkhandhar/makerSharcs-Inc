# User Registration and Fetch API

This is a RESTful API built with Spring Boot that allows users to register and fetch user details. The API also includes security measures to prevent users from registering with an existing username.

## Prerequisites

- Java 21
- Maven

## Getting Started

### Installation

1. Clone the repository:
2.  Navigate to the project directory:
3.  Build the application:mvn clean install

### Running the Application

1. Start the Spring Boot application:mvn spring-boot:run

The application will be accessible at `http://localhost:8080`.

## API Endpoints

### Register User

- **URL**: `/api/user/register`
- **Method**: `POST`
- **Request Body**:
```json
{
    "username": "rushabh_khandhar",
    "email": "rushabhkhandhar38@gmail.com",
    "password": "password123"
}

### Fetch User Details

- **URL**: /api/user/fetch
- **Method**: GET
- **Query Parameter**: username
