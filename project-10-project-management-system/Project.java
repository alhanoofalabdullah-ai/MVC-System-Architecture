package com.alhanoof.pms.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectName;

    private String projectManager;

    private Double budget;

    private Integer durationMonths;

    private String riskLevel;

    private String status;

    private LocalDate startDate;

    public Project() {
    }

    public Project(String projectName,
                   String projectManager,
                   Double budget,
                   Integer durationMonths,
                   String riskLevel,
                   String status,
                   LocalDate startDate) {
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

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
