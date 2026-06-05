# Healthcare Management System

An enterprise-level Healthcare Management System built using Spring Boot, Spring MVC, Spring Data JPA, and MySQL.

---

## Overview

This project demonstrates a professional MVC-based backend system designed to manage patient records, medical departments, appointment status, and healthcare service information.

The system follows clean enterprise architecture using Controller, Service, Repository, Entity, DTO, Mapper, Validation, and Exception Handling layers.

---

## Features

- Create patient records
- View all patients
- View patient by ID
- Update patient details
- Delete patient records
- Search patients by department
- Search patients by status
- Pagination and sorting
- DTO-based request and response handling
- Validation layer
- Global exception handling
- REST API structure
- MySQL database integration

---

## API Endpoints

```http
GET /api/patients
GET /api/patients/{id}
POST /api/patients
PUT /api/patients/{id}
DELETE /api/patients/{id}
GET /api/patients/search/department?department=CARDIOLOGY
GET /api/patients/search/status?status=ACTIVE
GET /api/patients/paged?page=0&size=5&sortBy=fullName
```

---

## Example Request

```json
{
  "fullName": "Ahmad Mohammed",
  "email": "ahmad.health@example.com",
  "phoneNumber": "0550000001",
  "department": "CARDIOLOGY",
  "diagnosis": "Hypertension",
  "status": "ACTIVE"
}
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
- Healthcare System Design
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
