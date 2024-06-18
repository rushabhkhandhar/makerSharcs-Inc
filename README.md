# User Registration and Fetch API

This is a RESTful API built with Spring Boot that allows users to register and fetch user details. The API also includes security measures to prevent users from registering with an existing username.

## Prerequisites
1) Java Development Kit (JDK) installed on your system.

2) Maven installed on your system.

3) Git installed on your system.

## Getting Started

## Tech Stack

**Server:** Java,Spring Boot,Spring Data JPA,H2 Database,MySQL

**Tool:** Postman


### Installation

1. Clone the repository:git@github.com:rushabhkhandhar/makerSharcs-Inc.git
2.  Build the application:mvn clean install

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

### Register User

- **URL**: /api/user/fetch
- **Method**: GET
- **Query Parameter**: username


## Feedback

If you have any feedback, please reach out to me at rushabhkhandhar38@gmail.com

