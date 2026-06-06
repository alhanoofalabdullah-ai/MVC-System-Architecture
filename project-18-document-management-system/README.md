# Document Management System (DMS)

Enterprise-grade Document Management System built using Spring Boot, Spring MVC, Spring Data JPA, Hibernate, and MySQL.

---

## Overview

This project demonstrates a professional Document Management System used for managing engineering documents, project documents, quality documents, workflows, transmittals, revisions, approvals, and document control operations.

The system follows enterprise architecture principles using Controller, Service, Repository, DTO, Validation, Mapper, and Exception Handling layers.

---

## Business Scenario

Large organizations manage thousands of documents daily.

Examples:

- Engineering Drawings
- Contracts
- Quality Documents
- Technical Submittals
- Method Statements
- Inspection Reports
- Project Correspondence

Without proper controls, organizations face:

- Lost documents
- Revision conflicts
- Approval delays
- Compliance issues

This system provides complete document lifecycle management.

---

## Features

### Document Control

- Create Documents
- Update Revisions
- Document Status Tracking
- Search Documents
- Approval Workflows

### Quality Management

- Quality Documents
- Audit Documents
- Compliance Tracking

### Engineering Management

- Drawings
- Specifications
- Technical Submittals

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

POST /api/documents

GET /api/documents

GET /api/documents/{id}

PUT /api/documents/{id}

DELETE /api/documents/{id}

GET /api/documents/search/status?status=APPROVED

GET /api/documents/search/type?type=DRAWING

GET /api/documents/paged?page=0&size=10&sortBy=id

---

## Example Request

{
  "documentNumber":"DOC-1001",
  "documentTitle":"Wadi Safar IFC Drawing",
  "documentType":"DRAWING",
  "revision":"A",
  "status":"UNDER_REVIEW"
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

- Document Control
- EDMS
- Aconex Concepts
- PMIS
- Quality Management
- Enterprise Architecture
- MVC Architecture
- DTO Pattern
- Validation
- REST API Development

---

## Author

Alhanoof Alabdullah
