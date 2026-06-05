package com.alhanoof.crm.dto;

import jakarta.validation.constraints.*;

public class CustomerRequest {

    @NotBlank
    private String customerName;

    @Email
    private String email;

    @NotBlank
    private String industry;

    @NotBlank
    private String contactPerson;

    @Positive
    private Double annualRevenue;

    @NotBlank
    private String status;

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getIndustry() {
        return industry;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public Double getAnnualRevenue() {
        return annualRevenue;
    }

    public String getStatus() {
        return status;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public void setAnnualRevenue(Double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
