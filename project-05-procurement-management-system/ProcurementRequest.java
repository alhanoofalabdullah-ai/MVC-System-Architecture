package com.alhanoof.procurement.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class ProcurementRequest {

    @NotBlank(message = "Requester name is required")
    private String requesterName;

    @NotBlank(message = "Supplier name is required")
    private String supplierName;

    @NotBlank(message = "Item name is required")
    private String itemName;

    @NotNull(message = "Quantity is required")
    @Positive(message = "Quantity must be greater than zero")
    private Integer quantity;

    @NotNull(message = "Unit price is required")
    @Positive(message = "Unit price must be greater than zero")
    private Double unitPrice;

    @NotBlank(message = "Status is required")
    private String status;

    public String getRequesterName() {
        return requesterName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getItemName() {
        return itemName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setRequesterName(String requesterName) {
        this.requesterName = requesterName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
