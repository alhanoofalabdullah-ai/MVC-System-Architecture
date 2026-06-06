package com.alhanoof.insurance.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class PolicyRequest {

    @NotBlank
    private String policyholderName;

    @NotBlank
    private String policyNumber;

    @NotBlank
    private String policyType;

    @Positive
    private Double premiumAmount;

    @Positive
    private Double coverageAmount;

    @NotBlank
    private String status;

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
}
