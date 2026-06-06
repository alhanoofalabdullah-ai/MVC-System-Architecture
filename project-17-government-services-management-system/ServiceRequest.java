package com.alhanoof.govservices.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "service_requests")
public class ServiceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String citizenName;

    @Column(unique = true)
    private String nationalId;

    private String serviceType;

    private String department;

    private String status;

    private LocalDate requestDate;

    public ServiceRequest() {
    }

    public ServiceRequest(String citizenName,
                          String nationalId,
                          String serviceType,
                          String department,
                          String status,
                          LocalDate requestDate) {
        this.citizenName = citizenName;
        this.nationalId = nationalId;
        this.serviceType = serviceType;
        this.department = department;
        this.status = status;
        this.requestDate = requestDate;
    }

    public Long getId() {
        return id;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public String getDepartment() {
        return department;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setCitizenName(String citizenName) {
        this.citizenName = citizenName;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }
}
