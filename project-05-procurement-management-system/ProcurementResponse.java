package com.alhanoof.procurement.dto;

import java.time.LocalDate;

public class ProcurementResponse {

    private Long id;

    private String requesterName;

    private String supplierName;

    private String itemName;

    private Integer quantity;

    private Double unitPrice;

    private Double totalAmount;

    private LocalDate requestDate;

    private String status;

    public ProcurementResponse() {
    }

    public ProcurementResponse(Long id,
                               String requesterName,
                               String supplierName,
                               String itemName,
                               Integer quantity,
                               Double unitPrice,
                               Double totalAmount,
                               LocalDate requestDate,
                               String status) {
        this.id = id;
        this.requesterName = requesterName;
        this.supplierName = supplierName;
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalAmount = totalAmount;
        this.requestDate = requestDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

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

    public Double getTotalAmount() {
        return totalAmount;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public String getStatus() {
        return status;
    }
}
