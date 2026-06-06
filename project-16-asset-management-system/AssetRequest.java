package com.alhanoof.asset.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class AssetRequest {

    @NotBlank
    private String assetName;

    @NotBlank
    private String assetTag;

    @NotBlank
    private String category;

    @NotBlank
    private String assignedTo;

    @NotBlank
    private String location;

    @Positive
    private Double assetValue;

    @NotBlank
    private String status;

    public String getAssetName() { return assetName; }

    public String getAssetTag() { return assetTag; }

    public String getCategory() { return category; }

    public String getAssignedTo() { return assignedTo; }

    public String getLocation() { return location; }

    public Double getAssetValue() { return assetValue; }

    public String getStatus() { return status; }

    public void setAssetName(String assetName) { this.assetName = assetName; }

    public void setAssetTag(String assetTag) { this.assetTag = assetTag; }

    public void setCategory(String category) { this.category = category; }

    public void setAssignedTo(String assignedTo) { this.assignedTo = assignedTo; }

    public void setLocation(String location) { this.location = location; }

    public void setAssetValue(Double assetValue) { this.assetValue = assetValue; }

    public void setStatus(String status) { this.status = status; }
}
