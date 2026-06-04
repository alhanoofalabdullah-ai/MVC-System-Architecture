# Enterprise Employee Management System

An enterprise-level Employee Management System built using Spring Boot, Spring MVC, Spring Data JPA, and MySQL.

---

## Overview

This project demonstrates a professional MVC-based backend application designed to manage employee records in an enterprise environment.

The system follows a clean layered architecture with Controller, Service, Repository, Entity, DTO, Mapper, Validation, and Exception Handling layers.

---

## Features

- Create employee records
- View all employees
- View employee by ID
- Update employee details
- Delete employee records
- Search employees by department
- Search employees by status
- Pagination and sorting
- DTO-based request and response handling
- Validation layer
- Global exception handling
- REST API structure
- MySQL database integration

---

## Architecture

The project follows the MVC architecture pattern:

### Model

Represents the database entity and business data.

### View

This backend project returns JSON responses through REST APIs.

### Controller

Handles HTTP requests and routes them to the service layer.

### Service

Contains business logic, validation, and processing rules.

### Repository

Handles database operations using Spring Data JPA.

---

## API Endpoints

### Get All Employees

```http
GET /api/employees
```

### Get Employee By ID

```http
GET /api/employees/{id}
```

### Create Employee

```http
POST /api/employees
```

Example Request:

```json
{
  "fullName": "Ahmad Mohammed",
  "email": "ahmad@example.com",
  "department": "IT",
  "salary": 15000,
  "status": "ACTIVE"
}
```

### Update Employee

```http
PUT /api/employees/{id}
```

### Delete Employee

```http
DELETE /api/employees/{id}
```

### Search By Department

```http
GET /api/employees/search/department?department=IT
```

### Search By Status

```http
GET /api/employees/search/status?status=ACTIVE
```

### Pagination

```http
GET /api/employees/paged?page=0&size=5&sortBy=salary
```

---

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST APIs

---

## Skills Demonstrated

- MVC Architecture
- REST API Development
- DTO Pattern
- Service Layer Pattern
- Repository Pattern
- Validation
- Exception Handling
- Pagination
- Sorting
- Database Integration
- Enterprise Backend Development

---

## Author

Alhanoof Alabdullah
