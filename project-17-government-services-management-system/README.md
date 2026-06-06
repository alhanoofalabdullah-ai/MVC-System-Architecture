# Government Services Management System

An enterprise-grade Government Services Management System built using Spring Boot, Spring MVC, Spring Data JPA, Hibernate, and MySQL.

---

## Overview

This project demonstrates a professional government digital services platform designed to manage citizen requests, service applications, approvals, status tracking, departments, and service delivery workflows.

The system follows enterprise software architecture principles using Controller, Service, Repository, DTO, Validation, Mapper, and Exception Handling layers.

---

## Business Scenario

Government agencies receive thousands of service requests daily. Managing applications manually creates delays, lack of visibility, and operational inefficiencies.

This system provides:

- Digital Service Requests
- Citizen Service Tracking
- Approval Workflows
- Department Management
- Request Status Monitoring
- SLA Tracking
- Government Service Reporting
- Audit Ready Architecture

---

## Features

### Citizen Services

- Submit Service Requests
- View Request Status
- Track Application Progress
- Search Requests

### Administration

- Approve Requests
- Reject Requests
- Assign Departments
- Manage Service Types

### Enterprise Features

- REST APIs
- DTO Architecture
- Validation Layer
- Exception Handling
- Pagination
- Sorting
- Search Functionality
- MVC Architecture

---

## API Endpoints

### Create Service Request

POST /api/service-requests

### Get All Requests

GET /api/service-requests

### Get Request By ID

GET /api/service-requests/{id}

### Update Request

PUT /api/service-requests/{id}

### Delete Request

DELETE /api/service-requests/{id}

### Search By Status

GET /api/service-requests/search/status?status=PENDING

### Search By Department

GET /api/service-requests/search/department?department=HR

### Pagination

GET /api/service-requests/paged?page=0&size=10&sortBy=id

---

## Example Request

{
  "citizenName":"Ahmed Mohammed",
  "nationalId":"1234567890",
  "serviceType":"LICENSE_RENEWAL",
  "department":"TRANSPORT",
  "status":"PENDING"
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

- Government Digital Services
- Enterprise Application Development
- Spring Boot Development
- MVC Architecture
- DTO Pattern
- Validation Framework
- Exception Handling
- Repository Pattern
- Database Design
- REST API Development

---

## Author

Alhanoof Alabdullah
