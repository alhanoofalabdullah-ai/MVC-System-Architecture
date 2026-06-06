package com.alhanoof.dms.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "documents")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String documentNumber;

    private String documentTitle;

    private String documentType;

    private String revision;

    private String status;

    private LocalDate createdDate;

    public Document() {
    }

    public Document(String documentNumber,
                    String documentTitle,
                    String documentType,
                    String revision,
                    String status,
                    LocalDate createdDate) {
        this.documentNumber = documentNumber;
        this.documentTitle = documentTitle;
        this.documentType = documentType;
        this.revision = revision;
        this.status = status;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getDocumentTitle() {
        return documentTitle;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getRevision() {
        return revision;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setDocumentTitle(String documentTitle) {
        this.documentTitle = documentTitle;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}
