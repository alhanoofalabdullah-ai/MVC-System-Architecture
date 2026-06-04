# Customer Relationship Management System

An enterprise-level Customer Relationship Management System built using Spring Boot, Spring MVC, Spring Data JPA, and MySQL.

---

## Overview

This project demonstrates a professional MVC-based CRM backend system designed to manage customer records, customer status, business segments, and contact information.

The system follows clean architecture principles using Controller, Service, Repository, Entity, DTO, Mapper, Validation, and Exception Handling layers.

---

## Features

- Create customer records
- View all customers
- View customer by ID
- Update customer details
- Delete customer records
- Search customers by segment
- Search customers by status
- Pagination and sorting
- DTO-based request and response handling
- Validation layer
- Global exception handling
- REST API structure
- MySQL database integration

---

## Architecture

This project follows the MVC architecture pattern:

### Model

Represents customer data and database entities.

### View

This backend project returns JSON responses through REST APIs.

### Controller

Handles HTTP requests and routes them to the service layer.

### Service

Contains business logic, validation rules, and customer processing workflows.

### Repository

Handles database operations using Spring Data JPA.

---

## API Endpoints

### Get All Customers

```http
GET /api/customers
```

### Get Customer By ID

```http
GET /api/customers/{id}
```

### Create Customer

```http
POST /api/customers
```

Example Request:

```json
{
  "fullName": "Ahmad Mohammed",
  "email": "ahmad@example.com",
  "phoneNumber": "0550000000",
  "segment": "VIP",
  "status": "ACTIVE"
}
```

### Update Customer

```http
PUT /api/customers/{id}
```

### Delete Customer

```http
DELETE /api/customers/{id}
```

### Search By Segment

```http
GET /api/customers/search/segment?segment=VIP
```

### Search By Status

```http
GET /api/customers/search/status?status=ACTIVE
```

### Pagination

```http
GET /api/customers/paged?page=0&size=5&sortBy=fullName
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
- CRM System Design
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
