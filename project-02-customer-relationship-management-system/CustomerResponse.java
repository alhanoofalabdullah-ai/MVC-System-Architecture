package com.alhanoof.crm.dto;

import java.time.LocalDate;

public class CustomerResponse {

    private Long id;

    private String fullName;

    private String email;

    private String phoneNumber;

    private String segment;

    private LocalDate registrationDate;

    private String status;

    public CustomerResponse() {
    }

    public CustomerResponse(Long id,
                            String fullName,
                            String email,
                            String phoneNumber,
                            String segment,
                            LocalDate registrationDate,
                            String status) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.segment = segment;
        this.registrationDate = registrationDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSegment() {
        return segment;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public String getStatus() {
        return status;
    }
}
