package com.alhanoof.govservices.dto;

import jakarta.validation.constraints.NotBlank;

public class ServiceRequestRequest {

    @NotBlank
    private String citizenName;

    @NotBlank
    private String nationalId;

    @NotBlank
    private String serviceType;

    @NotBlank
    private String department;

    @NotBlank
    private String status;

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
}
