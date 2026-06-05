# Human Resources Management System (HRMS)

An enterprise-level Human Resources Management System built using Spring Boot, Spring MVC, Spring Data JPA, and MySQL.

---

## Overview

This project demonstrates a professional MVC-based backend system designed to manage employee records, departments, positions, salaries, employment status, and workforce information.

The system follows clean enterprise architecture using Controller, Service, Repository, Entity, DTO, Mapper, Validation, and Exception Handling layers.

---

## Features

- Employee Management
- Department Management
- Salary Tracking
- Employment Status Management
- Employee Search
- Pagination and Sorting
- DTO Architecture
- Validation Layer
- Exception Handling
- REST API Development
- Enterprise MVC Architecture

---

## API Endpoints

### Create Employee

```http
POST /api/employees
```

### Get All Employees

```http
GET /api/employees
```

### Get Employee By ID

```http
GET /api/employees/{id}
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
GET /api/employees/paged?page=0&size=10&sortBy=salary
```

---

## Example Request

```json
{
  "fullName": "Alhanoof Alabdullah",
  "email": "alhanoof@company.com",
  "department": "IT",
  "position": "Senior Systems Specialist",
  "salary": 25000,
  "status": "ACTIVE"
}
```

---

## Technologies

- Java 21
- Spring Boot
- Spring MVC
- Spring Data JPA
- MySQL
- Maven
- Hibernate
- REST APIs

---

## Skills Demonstrated

- Enterprise Application Development
- HR Management Systems
- MVC Architecture
- REST APIs
- DTO Design Pattern
- Repository Pattern
- Service Layer Pattern
- Validation
- Exception Handling
- Database Design

---

## Author

Alhanoof Alabdullah
