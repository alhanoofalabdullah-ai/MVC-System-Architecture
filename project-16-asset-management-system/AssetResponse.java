package com.alhanoof.asset.dto;

import java.time.LocalDate;

public class AssetResponse {

    private Long id;
    private String assetName;
    private String assetTag;
    private String category;
    private String assignedTo;
    private String location;
    private Double assetValue;
    private String status;
    private LocalDate purchaseDate;

    public AssetResponse(Long id,
                         String assetName,
                         String assetTag,
                         String category,
                         String assignedTo,
                         String location,
                         Double assetValue,
                         String status,
                         LocalDate purchaseDate) {
        this.id = id;
        this.assetName = assetName;
        this.assetTag = assetTag;
        this.category = category;
        this.assignedTo = assignedTo;
        this.location = location;
        this.assetValue = assetValue;
        this.status = status;
        this.purchaseDate = purchaseDate;
    }

    public Long getId() { return id; }

    public String getAssetName() { return assetName; }

    public String getAssetTag() { return assetTag; }

    public String getCategory() { return category; }

    public String getAssignedTo() { return assignedTo; }

    public String getLocation() { return location; }

    public Double getAssetValue() { return assetValue; }

    public String getStatus() { return status; }

    public LocalDate getPurchaseDate() { return purchaseDate; }
}
