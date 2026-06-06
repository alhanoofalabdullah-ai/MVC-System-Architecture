package com.alhanoof.erm.dto;

import java.time.LocalDate;

public class RiskResponse {

    private Long id;
    private String riskTitle;
    private String riskCategory;
    private String riskOwner;
    private Integer riskScore;
    private String mitigationPlan;
    private String status;
    private LocalDate identifiedDate;

    public RiskResponse(Long id, String riskTitle, String riskCategory,
                        String riskOwner, Integer riskScore,
                        String mitigationPlan, String status,
                        LocalDate identifiedDate) {
        this.id = id;
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
}
