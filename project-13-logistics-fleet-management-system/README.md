# Logistics & Fleet Management System

An enterprise-grade Logistics and Fleet Management System built using Spring Boot, Spring MVC, Spring Data JPA, Hibernate, and MySQL.

---

## Overview

This project demonstrates a professional logistics backend system designed to manage shipments, fleet vehicles, drivers, routes, delivery status, and transportation operations.

The system follows enterprise MVC architecture using Controller, Service, Repository, DTO, Mapper, Validation, and Exception Handling layers.

---

## Features

- Shipment Management
- Fleet Vehicle Tracking
- Driver Assignment
- Delivery Status Management
- Route Management
- Shipment Cost Tracking
- Search Shipments
- Pagination & Sorting
- DTO Architecture
- Validation Layer
- Global Exception Handling
- REST APIs
- Enterprise MVC Architecture

---

## API Endpoints

POST /api/shipments

GET /api/shipments

GET /api/shipments/{id}

PUT /api/shipments/{id}

DELETE /api/shipments/{id}

GET /api/shipments/search/status?deliveryStatus=IN_TRANSIT

GET /api/shipments/search/driver?driverName=Ahmad

GET /api/shipments/paged?page=0&size=10&sortBy=shipmentCost

---

## Example Request

```json
{
  "shipmentNumber": "SHP-1001",
  "origin": "Riyadh",
  "destination": "Jeddah",
  "driverName": "Ahmad Mohammed",
  "vehicleNumber": "TRK-5001",
  "shipmentCost": 4500,
  "deliveryStatus": "IN_TRANSIT"
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

- Logistics System Design
- Fleet Management
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
