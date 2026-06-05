# Banking Management System

An enterprise-level Banking Management System built using Spring Boot, Spring MVC, Spring Data JPA, and MySQL.

---

## Overview

This project demonstrates a professional MVC-based backend system designed to manage bank accounts, account balances, customer banking information, account types, and account status.

The system follows clean enterprise architecture using Controller, Service, Repository, Entity, DTO, Mapper, Validation, and Exception Handling layers.

---

## Features

- Create bank accounts
- View all bank accounts
- View account by ID
- Update account details
- Delete account records
- Search accounts by account type
- Search accounts by status
- Pagination and sorting
- DTO-based request and response handling
- Validation layer
- Global exception handling
- REST API structure
- MySQL database integration

---

## API Endpoints

### Get All Accounts

```http
GET /api/accounts
```

### Get Account By ID

```http
GET /api/accounts/{id}
```

### Create Account

```http
POST /api/accounts
```

Example Request:

```json
{
  "customerName": "Ahmad Mohammed",
  "accountNumber": "ACC-1001",
  "accountType": "SAVINGS",
  "balance": 25000,
  "status": "ACTIVE"
}
```

### Update Account

```http
PUT /api/accounts/{id}
```

### Delete Account

```http
DELETE /api/accounts/{id}
```

### Search By Account Type

```http
GET /api/accounts/search/type?accountType=SAVINGS
```

### Search By Status

```http
GET /api/accounts/search/status?status=ACTIVE
```

### Pagination

```http
GET /api/accounts/paged?page=0&size=5&sortBy=balance
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
- Banking System Design
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
