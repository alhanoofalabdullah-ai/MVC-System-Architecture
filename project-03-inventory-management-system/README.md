# Inventory Management System

An enterprise-level Inventory Management System built using Spring Boot, Spring MVC, Spring Data JPA, and MySQL.

---

## Overview

This project demonstrates a professional MVC-based backend system designed to manage products, stock quantities, categories, suppliers, and inventory status.

The system follows clean enterprise architecture using Controller, Service, Repository, Entity, DTO, Mapper, Validation, and Exception Handling layers.

---

## Features

- Create product records
- View all products
- View product by ID
- Update product details
- Delete product records
- Search products by category
- Search products by status
- Pagination and sorting
- DTO-based request and response handling
- Validation layer
- Global exception handling
- REST API structure
- MySQL database integration

---

## API Endpoints

### Get All Products

```http
GET /api/products
```

### Get Product By ID

```http
GET /api/products/{id}
```

### Create Product

```http
POST /api/products
```

Example Request:

```json
{
  "productName": "Laptop",
  "sku": "LAP-1001",
  "category": "ELECTRONICS",
  "supplierName": "Tech Supplier",
  "quantity": 50,
  "unitPrice": 3500,
  "status": "AVAILABLE"
}
```

### Update Product

```http
PUT /api/products/{id}
```

### Delete Product

```http
DELETE /api/products/{id}
```

### Search By Category

```http
GET /api/products/search/category?category=ELECTRONICS
```

### Search By Status

```http
GET /api/products/search/status?status=AVAILABLE
```

### Pagination

```http
GET /api/products/paged?page=0&size=5&sortBy=productName
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
- Inventory System Design
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
