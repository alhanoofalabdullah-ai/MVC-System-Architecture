# Learning Management System (LMS)

An enterprise-grade Learning Management System built using Spring Boot, Spring MVC, Spring Data JPA, Hibernate, and MySQL.

---

## Overview

This project demonstrates a professional Learning Management platform designed to manage students, instructors, courses, enrollments, assignments, examinations, certifications, and learning progress.

The system follows enterprise software architecture principles using Controller, Service, Repository, DTO, Validation, Mapper, and Exception Handling layers.

---

## Features

- Student Management
- Course Enrollment
- Instructor Management
- Certification Tracking
- Assignment Tracking
- Exam Management
- Learning Progress Tracking
- Search Students
- Pagination & Sorting
- DTO Architecture
- Validation Layer
- Global Exception Handling
- REST APIs
- Enterprise MVC Architecture

---

## API Endpoints

### Create Student

POST /api/students

### Get All Students

GET /api/students

### Get Student By ID

GET /api/students/{id}

### Update Student

PUT /api/students/{id}

### Delete Student

DELETE /api/students/{id}

### Search By Course

GET /api/students/search/course?courseName=Java

### Search By Status

GET /api/students/search/status?status=ACTIVE

### Pagination

GET /api/students/paged?page=0&size=10&sortBy=studentName

---

## Example Request

{
  "studentName":"Alhanoof Alabdullah",
  "email":"alhanoof@lms.com",
  "courseName":"Enterprise Java Development",
  "instructorName":"Ahmed Hassan",
  "progressPercentage":75,
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

- LMS Development
- Educational Platforms
- Enterprise Architecture
- MVC Architecture
- DTO Pattern
- Repository Pattern
- Validation
- Exception Handling
- Database Design
- Learning Analytics

---

## Author

Alhanoof Alabdullah
