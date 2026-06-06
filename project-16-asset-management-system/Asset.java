package com.alhanoof.asset.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "assets")
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String assetName;

    @Column(unique = true, nullable = false)
    private String assetTag;

    private String category;

    private String assignedTo;

    private String location;

    private Double assetValue;

    private String status;

    private LocalDate purchaseDate;

    public Asset() {
    }

    public Asset(String assetName,
                 String assetTag,
                 String category,
                 String assignedTo,
                 String location,
                 Double assetValue,
                 String status,
                 LocalDate purchaseDate) {
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

    public void setAssetName(String assetName) { this.assetName = assetName; }

    public void setAssetTag(String assetTag) { this.assetTag = assetTag; }

    public void setCategory(String category) { this.category = category; }

    public void setAssignedTo(String assignedTo) { this.assignedTo = assignedTo; }

    public void setLocation(String location) { this.location = location; }

    public void setAssetValue(Double assetValue) { this.assetValue = assetValue; }

    public void setStatus(String status) { this.status = status; }

    public void setPurchaseDate(LocalDate purchaseDate) { this.purchaseDate = purchaseDate; }
}
