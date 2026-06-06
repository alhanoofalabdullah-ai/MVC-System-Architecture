# Asset Management System

An enterprise-grade Asset Management System built using Spring Boot, Spring MVC, Spring Data JPA, Hibernate, and MySQL.

---

## Overview

This project demonstrates a professional backend system designed to manage enterprise assets, asset ownership, asset categories, asset value, physical location, and asset lifecycle status.

The system follows enterprise MVC architecture using Controller, Service, Repository, DTO, Mapper, Validation, and Exception Handling layers.

---

## Features

- Asset Registration
- Asset Category Tracking
- Asset Ownership Management
- Asset Value Tracking
- Asset Location Management
- Asset Status Management
- Search Assets
- Pagination & Sorting
- DTO Architecture
- Validation Layer
- Global Exception Handling
- REST APIs
- Enterprise MVC Architecture

---

## API Endpoints

POST /api/assets

GET /api/assets

GET /api/assets/{id}

PUT /api/assets/{id}

DELETE /api/assets/{id}

GET /api/assets/search/category?category=LAPTOP

GET /api/assets/search/status?status=ACTIVE

GET /api/assets/paged?page=0&size=10&sortBy=assetValue

---

## Example Request

```json
{
  "assetName": "MacBook Pro",
  "assetTag": "AST-1001",
  "category": "LAPTOP",
  "assignedTo": "Alhanoof Alabdullah",
  "location": "Riyadh Office",
  "assetValue": 9500,
  "status": "ACTIVE"
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

## Skills Demonstrated

- Asset Management Systems
- Enterprise Backend Development
- MVC Architecture
- REST API Development
- DTO Pattern
- Service Layer Pattern
- Repository Pattern
- Validation
- Exception Handling
- Database Design

---

## Author

Alhanoof Alabdullah
