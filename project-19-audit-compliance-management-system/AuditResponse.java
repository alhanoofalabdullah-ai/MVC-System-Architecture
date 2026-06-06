package com.alhanoof.audit.dto;

import java.time.LocalDate;

public class AuditResponse {

    private Long id;
    private String auditTitle;
    private String auditCategory;
    private String auditorName;
    private String finding;
    private String status;
    private LocalDate auditDate;

    public AuditResponse(Long id,
                         String auditTitle,
                         String auditCategory,
                         String auditorName,
                         String finding,
                         String status,
                         LocalDate auditDate) {
        this.id = id;
        this.auditTitle = auditTitle;
        this.auditCategory = auditCategory;
        this.auditorName = auditorName;
        this.finding = finding;
        this.status = status;
        this.auditDate = auditDate;
    }

    public Long getId() { return id; }
    public String getAuditTitle() { return auditTitle; }
    public String getAuditCategory() { return auditCategory; }
    public String getAuditorName() { return auditorName; }
    public String getFinding() { return finding; }
    public String getStatus() { return status; }
    public LocalDate getAuditDate() { return auditDate; }
}
