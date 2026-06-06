# Enterprise Risk Management System (ERM)

Enterprise-grade Enterprise Risk Management (ERM) System built using Spring Boot, Spring MVC, Spring Data JPA, Hibernate, and MySQL.

---

## Overview

This project demonstrates a professional Enterprise Risk Management platform designed to manage risks, controls, mitigation plans, risk owners, compliance requirements, and enterprise governance processes.

The system follows enterprise architecture principles using Controller, Service, Repository, DTO, Validation, Mapper, and Exception Handling layers.

---

## Business Scenario

Large organizations face operational, financial, cybersecurity, compliance, and strategic risks.

Without proper risk governance, organizations can experience:

- Regulatory penalties
- Financial losses
- Cybersecurity incidents
- Operational failures
- Compliance breaches

This platform provides a centralized Enterprise Risk Register and Risk Governance Framework.

---

## Features

### Risk Management

- Risk Register
- Risk Assessment
- Risk Classification
- Risk Scoring
- Risk Ownership

### Governance

- Control Management
- Governance Tracking
- Compliance Monitoring

### Mitigation

- Corrective Actions
- Mitigation Plans
- Target Dates
- Action Tracking

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

POST /api/risks

GET /api/risks

GET /api/risks/{id}

PUT /api/risks/{id}

DELETE /api/risks/{id}

GET /api/risks/search/status?status=OPEN

GET /api/risks/search/category?category=CYBERSECURITY

GET /api/risks/search/owner?owner=Alhanoof

GET /api/risks/paged?page=0&size=10&sortBy=riskScore

---

## Example Request

{
  "riskTitle":"Unauthorized System Access",
  "riskCategory":"CYBERSECURITY",
  "riskOwner":"Alhanoof Alabdullah",
  "riskScore":85,
  "mitigationPlan":"Implement MFA and access reviews",
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

- Enterprise Risk Management
- Governance
- Compliance
- Internal Controls
- Risk Register Design
- Risk Assessment
- Spring Boot Development
- MVC Architecture
- DTO Pattern
- REST API Development
- Enterprise Architecture

---

## Author

Alhanoof Alabdullah
