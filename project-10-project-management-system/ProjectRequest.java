package com.alhanoof.pms.dto;

import jakarta.validation.constraints.*;

public class ProjectRequest {

    @NotBlank
    private String projectName;

    @NotBlank
    private String projectManager;

    @Positive
    private Double budget;

    @Positive
    private Integer durationMonths;

    @NotBlank
    private String riskLevel;

    @NotBlank
    private String status;

    public String getProjectName() {
        return projectName;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public Double getBudget() {
        return budget;
    }

    public Integer getDurationMonths() {
        return durationMonths;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public String getStatus() {
        return status;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public void setDurationMonths(Integer durationMonths) {
        this.durationMonths = durationMonths;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
