# Procurement Management System

An enterprise-level Procurement Management System built using Spring Boot, Spring MVC, Spring Data JPA, and MySQL.

---

## Overview

This project demonstrates a professional MVC-based backend system designed to manage procurement requests, suppliers, items, approval status, and purchase values.

The system follows clean enterprise architecture using Controller, Service, Repository, Entity, DTO, Mapper, Validation, and Exception Handling layers.

---

## Features

- Create procurement requests
- View all procurement records
- View procurement by ID
- Update procurement records
- Delete procurement records
- Search procurement by supplier
- Search procurement by status
- Pagination and sorting
- DTO-based request and response handling
- Validation layer
- Global exception handling
- REST API structure
- MySQL database integration

---

## API Endpoints

### Get All Procurements

```http
GET /api/procurements
```

### Get Procurement By ID

```http
GET /api/procurements/{id}
```

### Create Procurement

```http
POST /api/procurements
```

Example Request:

```json
{
  "requesterName": "Ahmad Mohammed",
  "supplierName": "Tech Supplier Co.",
  "itemName": "Laptop",
  "quantity": 5,
  "unitPrice": 3500,
  "status": "APPROVED"
}
```

### Update Procurement

```http
PUT /api/procurements/{id}
```

### Delete Procurement

```http
DELETE /api/procurements/{id}
```

### Search By Supplier

```http
GET /api/procurements/search/supplier?supplierName=Tech
```

### Search By Status

```http
GET /api/procurements/search/status?status=APPROVED
```

### Pagination

```http
GET /api/procurements/paged?page=0&size=5&sortBy=totalAmount
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
- Procurement System Design
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
