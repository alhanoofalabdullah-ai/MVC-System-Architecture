# Customer Relationship Management System (CRM)

An enterprise-grade Customer Relationship Management System built using Spring Boot, Spring MVC, Spring Data JPA, Hibernate, and MySQL.

---

## Overview

This project demonstrates a professional CRM platform designed to manage customer relationships, sales opportunities, customer lifecycle management, lead tracking, and customer engagement activities.

The system follows enterprise software architecture principles using Controller, Service, Repository, DTO, Validation, Mapper, and Exception Handling layers.

---

## Features

- Customer Management
- Lead Management
- Customer Lifecycle Tracking
- Customer Segmentation
- Customer Status Management
- Sales Opportunity Tracking
- Search Customers
- Pagination and Sorting
- DTO Architecture
- Validation Layer
- Global Exception Handling
- REST APIs
- Enterprise MVC Architecture

---

## API Endpoints

### Create Customer

POST /api/customers

### Get All Customers

GET /api/customers

### Get Customer By ID

GET /api/customers/{id}

### Update Customer

PUT /api/customers/{id}

### Delete Customer

DELETE /api/customers/{id}

### Search By Industry

GET /api/customers/search/industry?industry=BANKING

### Search By Status

GET /api/customers/search/status?status=ACTIVE

### Pagination

GET /api/customers/paged?page=0&size=10&sortBy=customerName

---

## Example Request

{
  "customerName":"Saudi National Bank",
  "email":"contact@snb.com",
  "industry":"BANKING",
  "contactPerson":"Ahmed Al-Qahtani",
  "annualRevenue":50000000,
  "status":"ACTIVE"
}

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

- CRM Systems
- Enterprise Architecture
- MVC Design Pattern
- REST API Development
- Service Layer Pattern
- Repository Pattern
- DTO Pattern
- Validation
- Exception Handling
- Database Design
- Customer Lifecycle Management

---

## Author

Alhanoof Alabdullah
