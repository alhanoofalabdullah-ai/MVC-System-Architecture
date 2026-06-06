package com.alhanoof.audit.dto;

import jakarta.validation.constraints.NotBlank;

public class AuditRequest {

    @NotBlank
    private String auditTitle;

    @NotBlank
    private String auditCategory;

    @NotBlank
    private String auditorName;

    @NotBlank
    private String finding;

    @NotBlank
    private String status;

    public String getAuditTitle() {
        return auditTitle;
    }

    public String getAuditCategory() {
        return auditCategory;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public String getFinding() {
        return finding;
    }

    public String getStatus() {
        return status;
    }

    public void setAuditTitle(String auditTitle) {
        this.auditTitle = auditTitle;
    }

    public void setAuditCategory(String auditCategory) {
        this.auditCategory = auditCategory;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName;
    }

    public void setFinding(String finding) {
        this.finding = finding;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
