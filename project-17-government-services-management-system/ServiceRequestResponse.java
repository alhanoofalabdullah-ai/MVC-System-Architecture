package com.alhanoof.govservices.dto;

import java.time.LocalDate;

public class ServiceRequestResponse {

    private Long id;
    private String citizenName;
    private String nationalId;
    private String serviceType;
    private String department;
    private String status;
    private LocalDate requestDate;

    public ServiceRequestResponse(Long id,
                                  String citizenName,
                                  String nationalId,
                                  String serviceType,
                                  String department,
                                  String status,
                                  LocalDate requestDate) {
        this.id = id;
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
}
