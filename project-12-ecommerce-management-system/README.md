# E-Commerce Management System

An enterprise-grade E-Commerce Management System built using Spring Boot, Spring MVC, Spring Data JPA, Hibernate, and MySQL.

---

## Overview

This project demonstrates a professional e-commerce backend system designed to manage customer orders, products, categories, payment status, order status, and revenue tracking.

The system follows enterprise MVC architecture using Controller, Service, Repository, DTO, Mapper, Validation, and Exception Handling layers.

---

## Features

- Order Management
- Product Tracking
- Customer Order Processing
- Payment Status Management
- Order Status Management
- Revenue Calculation
- Search Orders
- Pagination & Sorting
- DTO Architecture
- Validation Layer
- Global Exception Handling
- REST APIs
- Enterprise MVC Architecture

---

## API Endpoints

POST /api/orders

GET /api/orders

GET /api/orders/{id}

PUT /api/orders/{id}

DELETE /api/orders/{id}

GET /api/orders/search/customer?customerName=Ahmad

GET /api/orders/search/status?orderStatus=CONFIRMED

GET /api/orders/paged?page=0&size=10&sortBy=totalAmount

---

## Example Request

```json
{
  "customerName": "Ahmad Mohammed",
  "productName": "Laptop",
  "category": "ELECTRONICS",
  "quantity": 2,
  "unitPrice": 3500,
  "paymentStatus": "PAID",
  "orderStatus": "CONFIRMED"
}
```

---

## Technologies

- Java 21
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST APIs

---

## Author

Alhanoof Alabdullah
