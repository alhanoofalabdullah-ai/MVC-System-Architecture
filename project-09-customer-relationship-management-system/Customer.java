package com.alhanoof.crm.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    @Column(unique = true)
    private String email;

    private String industry;

    private String contactPerson;

    private Double annualRevenue;

    private String status;

    private LocalDate registrationDate;

    public Customer() {
    }

    public Customer(String customerName,
                    String email,
                    String industry,
                    String contactPerson,
                    Double annualRevenue,
                    String status,
                    LocalDate registrationDate) {
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

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
