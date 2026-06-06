package com.alhanoof.dms.dto;

import jakarta.validation.constraints.NotBlank;

public class DocumentRequest {

    @NotBlank
    private String documentNumber;

    @NotBlank
    private String documentTitle;

    @NotBlank
    private String documentType;

    @NotBlank
    private String revision;

    @NotBlank
    private String status;

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
}
