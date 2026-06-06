# Hotel Reservation System

An enterprise-grade Hotel Reservation System built using Spring Boot, Spring MVC, Spring Data JPA, Hibernate, and MySQL.

---

## Overview

This project demonstrates a professional hotel reservation backend system designed to manage guest bookings, room types, stay duration, reservation cost, payment status, and booking status.

The system follows enterprise MVC architecture using Controller, Service, Repository, DTO, Mapper, Validation, and Exception Handling layers.

---

## Features

- Reservation Management
- Guest Booking Records
- Room Type Tracking
- Payment Status Management
- Booking Status Management
- Total Cost Calculation
- Search Reservations
- Pagination & Sorting
- DTO Architecture
- Validation Layer
- Global Exception Handling
- REST APIs
- Enterprise MVC Architecture

---

## API Endpoints

POST /api/reservations

GET /api/reservations

GET /api/reservations/{id}

PUT /api/reservations/{id}

DELETE /api/reservations/{id}

GET /api/reservations/search/status?bookingStatus=CONFIRMED

GET /api/reservations/search/guest?guestName=Ahmad

GET /api/reservations/paged?page=0&size=10&sortBy=totalAmount

---

## Example Request

```json
{
  "guestName": "Ahmad Mohammed",
  "roomType": "DELUXE",
  "numberOfNights": 3,
  "nightlyRate": 750,
  "paymentStatus": "PAID",
  "bookingStatus": "CONFIRMED"
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
