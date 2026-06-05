# Project Management System (PMS)

An enterprise-grade Project Management System built using Spring Boot, Spring MVC, Spring Data JPA, Hibernate, and MySQL.

---

## Overview

This project demonstrates a professional Project Management platform designed for managing projects, milestones, tasks, budgets, schedules, risks, and project resources.

The system follows enterprise architecture principles using Controller, Service, Repository, DTO, Validation, Mapper, and Exception Handling layers.

---

## Features

- Project Management
- Budget Tracking
- Project Schedule Tracking
- Project Risk Management
- Resource Management
- Project Status Management
- Search Projects
- Pagination & Sorting
- Validation Layer
- DTO Architecture
- REST APIs
- Enterprise MVC Architecture

---

## API Endpoints

### Create Project

POST /api/projects

### Get All Projects

GET /api/projects

### Get Project By ID

GET /api/projects/{id}

### Update Project

PUT /api/projects/{id}

### Delete Project

DELETE /api/projects/{id}

### Search By Status

GET /api/projects/search/status?status=IN_PROGRESS

### Search By Manager

GET /api/projects/search/manager?managerName=Ahmed

### Pagination

GET /api/projects/paged?page=0&size=10&sortBy=budget

---

## Example Request

{
  "projectName":"Wadi Safar Digital Transformation",
  "projectManager":"Alhanoof Alabdullah",
  "budget":2500000,
  "durationMonths":24,
  "riskLevel":"HIGH",
  "status":"IN_PROGRESS"
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

- PMIS Development
- Project Governance
- Project Controls
- Risk Management
- Enterprise Architecture
- MVC Architecture
- DTO Pattern
- Repository Pattern
- Validation
- Exception Handling
- Database Design

---

## Author

Alhanoof Alabdullah
