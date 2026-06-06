package com.alhanoof.erm.dto;

import jakarta.validation.constraints.*;

public class RiskRequest {

    @NotBlank
    private String riskTitle;

    @NotBlank
    private String riskCategory;

    @NotBlank
    private String riskOwner;

    @Min(1)
    @Max(100)
    private Integer riskScore;

    @NotBlank
    private String mitigationPlan;

    @NotBlank
    private String status;

    public String getRiskTitle() { return riskTitle; }
    public String getRiskCategory() { return riskCategory; }
    public String getRiskOwner() { return riskOwner; }
    public Integer getRiskScore() { return riskScore; }
    public String getMitigationPlan() { return mitigationPlan; }
    public String getStatus() { return status; }

    public void setRiskTitle(String riskTitle) { this.riskTitle = riskTitle; }
    public void setRiskCategory(String riskCategory) { this.riskCategory = riskCategory; }
    public void setRiskOwner(String riskOwner) { this.riskOwner = riskOwner; }
    public void setRiskScore(Integer riskScore) { this.riskScore = riskScore; }
    public void setMitigationPlan(String mitigationPlan) { this.mitigationPlan = mitigationPlan; }
    public void setStatus(String status) { this.status = status; }
}
