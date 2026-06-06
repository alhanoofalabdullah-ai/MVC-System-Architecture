# Audit & Compliance Management System

Enterprise-grade Audit & Compliance Management System built using Spring Boot, Spring MVC, Spring Data JPA, Hibernate, and MySQL.

---

## Overview

This project demonstrates a professional Audit and Compliance platform designed to manage audit findings, compliance assessments, observations, corrective actions, governance controls, and audit reporting.

The system follows enterprise architecture principles using Controller, Service, Repository, DTO, Validation, Mapper, and Exception Handling layers.

---

## Business Scenario

Organizations perform internal audits and compliance reviews to ensure operational excellence and regulatory compliance.

The system helps manage:

- Internal Audits
- Compliance Reviews
- Governance Controls
- Audit Findings
- Corrective Actions
- Risk Observations
- Audit Reports
- Regulatory Compliance

---

## Features

### Audit Management

- Create Audit Records
- Manage Findings
- Track Corrective Actions
- Assign Auditors

### Compliance Management

- Compliance Reviews
- Regulatory Assessments
- Governance Monitoring
- Control Effectiveness

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

POST /api/audits

GET /api/audits

GET /api/audits/{id}

PUT /api/audits/{id}

DELETE /api/audits/{id}

GET /api/audits/search/status?status=OPEN

GET /api/audits/search/category?category=COMPLIANCE

GET /api/audits/paged?page=0&size=10&sortBy=id

---

## Example Request

{
  "auditTitle":"Quality Management Audit",
  "auditCategory":"COMPLIANCE",
  "auditorName":"Alhanoof Alabdullah",
  "finding":"Missing approval workflow",
  "status":"OPEN"
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

- Internal Audit
- Governance
- Compliance Management
- Risk Management
- Enterprise Architecture
- MVC Architecture
- DTO Pattern
- Validation
- REST API Development

---

## Author

Alhanoof Alabdullah
