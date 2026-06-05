package com.alhanoof.healthcare.dto;

import java.time.LocalDate;

public class PatientResponse {

    private Long id;

    private String fullName;

    private String email;

    private String phoneNumber;

    private String department;

    private String diagnosis;

    private LocalDate registrationDate;

    private String status;

    public PatientResponse() {
    }

    public PatientResponse(Long id,
                           String fullName,
                           String email,
                           String phoneNumber,
                           String department,
                           String diagnosis,
                           LocalDate registrationDate,
                           String status) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.diagnosis = diagnosis;
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

    public String getDepartment() {
        return department;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public String getStatus() {
        return status;
    }
}
