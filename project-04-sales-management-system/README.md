# Sales Management System

An enterprise-level Sales Management System built using Spring Boot, Spring MVC, Spring Data JPA, and MySQL.

---

## Overview

This project demonstrates a professional MVC-based backend system designed to manage sales transactions, customer purchases, products, revenue, payment status, and sales reporting.

The system follows clean enterprise architecture using Controller, Service, Repository, Entity, DTO, Mapper, Validation, and Exception Handling layers.

---

## Features

- Create sales transactions
- View all sales
- View sale by ID
- Update sales records
- Delete sales records
- Search sales by customer name
- Search sales by payment status
- Pagination and sorting
- DTO-based request and response handling
- Validation layer
- Global exception handling
- REST API structure
- MySQL database integration

---

## API Endpoints

### Get All Sales

```http
GET /api/sales
```

### Get Sale By ID

```http
GET /api/sales/{id}
```

### Create Sale

```http
POST /api/sales
```

Example Request:

```json
{
  "customerName": "Ahmad Mohammed",
  "productName": "Laptop",
  "quantity": 2,
  "unitPrice": 3500,
  "paymentStatus": "PAID"
}
```

### Update Sale

```http
PUT /api/sales/{id}
```

### Delete Sale

```http
DELETE /api/sales/{id}
```

### Search By Customer

```http
GET /api/sales/search/customer?customerName=Ahmad
```

### Search By Payment Status

```http
GET /api/sales/search/status?paymentStatus=PAID
```

### Pagination

```http
GET /api/sales/paged?page=0&size=5&sortBy=totalAmount
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
- Sales System Design
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
