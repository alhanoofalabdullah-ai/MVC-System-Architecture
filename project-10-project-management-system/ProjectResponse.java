package com.alhanoof.pms.dto;

import java.time.LocalDate;

public class ProjectResponse {

    private Long id;
    private String projectName;
    private String projectManager;
    private Double budget;
    private Integer durationMonths;
    private String riskLevel;
    private String status;
    private LocalDate startDate;

    public ProjectResponse(Long id,
                           String projectName,
                           String projectManager,
                           Double budget,
                           Integer durationMonths,
                           String riskLevel,
                           String status,
                           LocalDate startDate) {
        this.id = id;
        this.projectName = projectName;
        this.projectManager = projectManager;
        this.budget = budget;
        this.durationMonths = durationMonths;
        this.riskLevel = riskLevel;
        this.status = status;
        this.startDate = startDate;
    }

    public Long getId() {
        return id;
    }

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

    public LocalDate getStartDate() {
        return startDate;
    }
}
