package com.alhanoof.audit.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "audit_records")
public class AuditRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String auditTitle;

    private String auditCategory;

    private String auditorName;

    @Column(length = 1000)
    private String finding;

    private String status;

    private LocalDate auditDate;

    public AuditRecord() {
    }

    public AuditRecord(String auditTitle,
                       String auditCategory,
                       String auditorName,
                       String finding,
                       String status,
                       LocalDate auditDate) {
        this.auditTitle = auditTitle;
        this.auditCategory = auditCategory;
        this.auditorName = auditorName;
        this.finding = finding;
        this.status = status;
        this.auditDate = auditDate;
    }

    public Long getId() {
        return id;
    }

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

    public LocalDate getAuditDate() {
        return auditDate;
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

    public void setAuditDate(LocalDate auditDate) {
        this.auditDate = auditDate;
    }
}
