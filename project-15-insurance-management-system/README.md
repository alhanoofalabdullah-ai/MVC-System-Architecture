# Insurance Management System

An enterprise-grade Insurance Management System built using Spring Boot, Spring MVC, Spring Data JPA, Hibernate, and MySQL.

---

## Overview

This project demonstrates a professional insurance backend system designed to manage policyholders, insurance policies, insurance types, premium amounts, coverage values, and policy status.

The system follows enterprise MVC architecture using Controller, Service, Repository, DTO, Mapper, Validation, and Exception Handling layers.

---

## Features

- Insurance Policy Management
- Policyholder Records
- Insurance Type Tracking
- Premium Calculation
- Coverage Amount Management
- Policy Status Management
- Search Policies
- Pagination & Sorting
- DTO Architecture
- Validation Layer
- Global Exception Handling
- REST APIs
- Enterprise MVC Architecture

---

## API Endpoints

POST /api/policies

GET /api/policies

GET /api/policies/{id}

PUT /api/policies/{id}

DELETE /api/policies/{id}

GET /api/policies/search/type?policyType=HEALTH

GET /api/policies/search/status?status=ACTIVE

GET /api/policies/paged?page=0&size=10&sortBy=coverageAmount

---

## Example Request

```json
{
  "policyholderName": "Ahmad Mohammed",
  "policyNumber": "POL-1001",
  "policyType": "HEALTH",
  "premiumAmount": 2500,
  "coverageAmount": 100000,
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

- Insurance System Design
- Policy Management
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
