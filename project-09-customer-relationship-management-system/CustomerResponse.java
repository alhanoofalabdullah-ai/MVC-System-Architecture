package com.alhanoof.crm.dto;

import java.time.LocalDate;

public class CustomerResponse {

    private Long id;
    private String customerName;
    private String email;
    private String industry;
    private String contactPerson;
    private Double annualRevenue;
    private String status;
    private LocalDate registrationDate;

    public CustomerResponse(Long id,
                            String customerName,
                            String email,
                            String industry,
                            String contactPerson,
                            Double annualRevenue,
                            String status,
                            LocalDate registrationDate) {
        this.id = id;
        this.customerName = customerName;
        this.email = email;
        this.industry = industry;
        this.contactPerson = contactPerson;
        this.annualRevenue = annualRevenue;
        this.status = status;
        this.registrationDate = registrationDate;
    }

    public Long getId() {
        return id;
    }

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

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }
}
