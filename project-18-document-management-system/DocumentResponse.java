package com.alhanoof.dms.dto;

import java.time.LocalDate;

public class DocumentResponse {

    private Long id;
    private String documentNumber;
    private String documentTitle;
    private String documentType;
    private String revision;
    private String status;
    private LocalDate createdDate;

    public DocumentResponse(Long id,
                            String documentNumber,
                            String documentTitle,
                            String documentType,
                            String revision,
                            String status,
                            LocalDate createdDate) {
        this.id = id;
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
}
