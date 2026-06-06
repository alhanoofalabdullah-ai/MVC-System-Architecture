package com.alhanoof.insurance.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "insurance_policies")
public class InsurancePolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String policyholderName;

    @Column(unique = true, nullable = false)
    private String policyNumber;

    private String policyType;

    private Double premiumAmount;

    private Double coverageAmount;

    private String status;

    private LocalDate issueDate;

    public InsurancePolicy() {
    }

    public InsurancePolicy(String policyholderName,
                           String policyNumber,
                           String policyType,
                           Double premiumAmount,
                           Double coverageAmount,
                           String status,
                           LocalDate issueDate) {
        this.policyholderName = policyholderName;
        this.policyNumber = policyNumber;
        this.policyType = policyType;
        this.premiumAmount = premiumAmount;
        this.coverageAmount = coverageAmount;
        this.status = status;
        this.issueDate = issueDate;
    }

    public Long getId() {
        return id;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyType() {
        return policyType;
    }

    public Double getPremiumAmount() {
        return premiumAmount;
    }

    public Double getCoverageAmount() {
        return coverageAmount;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setPolicyholderName(String policyholderName) {
        this.policyholderName = policyholderName;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public void setPremiumAmount(Double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public void setCoverageAmount(Double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }
}
