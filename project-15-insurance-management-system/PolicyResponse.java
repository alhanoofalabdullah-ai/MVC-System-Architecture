package com.alhanoof.insurance.dto;

import java.time.LocalDate;

public class PolicyResponse {

    private Long id;

    private String policyholderName;

    private String policyNumber;

    private String policyType;

    private Double premiumAmount;

    private Double coverageAmount;

    private String status;

    private LocalDate issueDate;

    public PolicyResponse(Long id,
                          String policyholderName,
                          String policyNumber,
                          String policyType,
                          Double premiumAmount,
                          Double coverageAmount,
                          String status,
                          LocalDate issueDate) {
        this.id = id;
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
}
