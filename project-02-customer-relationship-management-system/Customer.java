package com.alhanoof.crm.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    @Column(unique = true, nullable = false)
    private String email;

    private String phoneNumber;

    private String segment;

    private LocalDate registrationDate;

    private String status;

    public Customer() {
    }

    public Customer(String fullName,
                    String email,
                    String phoneNumber,
                    String segment,
                    LocalDate registrationDate,
                    String status) {
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

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
