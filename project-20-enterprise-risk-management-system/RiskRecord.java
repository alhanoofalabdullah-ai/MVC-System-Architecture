package com.alhanoof.erm.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "risk_records")
public class RiskRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String riskTitle;

    private String riskCategory;

    private String riskOwner;

    private Integer riskScore;

    @Column(length = 2000)
    private String mitigationPlan;

    private String status;

    private LocalDate identifiedDate;

    public RiskRecord() {
    }

    public RiskRecord(String riskTitle,
                      String riskCategory,
                      String riskOwner,
                      Integer riskScore,
                      String mitigationPlan,
                      String status,
                      LocalDate identifiedDate) {
        this.riskTitle = riskTitle;
        this.riskCategory = riskCategory;
        this.riskOwner = riskOwner;
        this.riskScore = riskScore;
        this.mitigationPlan = mitigationPlan;
        this.status = status;
        this.identifiedDate = identifiedDate;
    }

    public Long getId() { return id; }
    public String getRiskTitle() { return riskTitle; }
    public String getRiskCategory() { return riskCategory; }
    public String getRiskOwner() { return riskOwner; }
    public Integer getRiskScore() { return riskScore; }
    public String getMitigationPlan() { return mitigationPlan; }
    public String getStatus() { return status; }
    public LocalDate getIdentifiedDate() { return identifiedDate; }

    public void setRiskTitle(String riskTitle) { this.riskTitle = riskTitle; }
    public void setRiskCategory(String riskCategory) { this.riskCategory = riskCategory; }
    public void setRiskOwner(String riskOwner) { this.riskOwner = riskOwner; }
    public void setRiskScore(Integer riskScore) { this.riskScore = riskScore; }
    public void setMitigationPlan(String mitigationPlan) { this.mitigationPlan = mitigationPlan; }
    public void setStatus(String status) { this.status = status; }
    public void setIdentifiedDate(LocalDate identifiedDate) { this.identifiedDate = identifiedDate; }
}
