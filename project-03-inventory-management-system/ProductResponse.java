package com.alhanoof.inventory.dto;

import java.time.LocalDate;

public class ProductResponse {

    private Long id;

    private String productName;

    private String sku;

    private String category;

    private String supplierName;

    private Integer quantity;

    private Double unitPrice;

    private Double inventoryValue;

    private LocalDate createdDate;

    private String status;

    public ProductResponse() {
    }

    public ProductResponse(Long id,
                           String productName,
                           String sku,
                           String category,
                           String supplierName,
                           Integer quantity,
                           Double unitPrice,
                           Double inventoryValue,
                           LocalDate createdDate,
                           String status) {
        this.id = id;
        this.productName = productName;
        this.sku = sku;
        this.category = category;
        this.supplierName = supplierName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.inventoryValue = inventoryValue;
        this.createdDate = createdDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getSku() {
        return sku;
    }

    public String getCategory() {
        return category;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public Double getInventoryValue() {
        return inventoryValue;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public String getStatus() {
        return status;
    }
}
