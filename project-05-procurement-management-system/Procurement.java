package com.alhanoof.procurement.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "procurements")
public class Procurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String requesterName;

    private String supplierName;

    private String itemName;

    private Integer quantity;

    private Double unitPrice;

    private Double totalAmount;

    private LocalDate requestDate;

    private String status;

    public Procurement() {
    }

    public Procurement(String requesterName,
                       String supplierName,
                       String itemName,
                       Integer quantity,
                       Double unitPrice,
                       Double totalAmount,
                       LocalDate requestDate,
                       String status) {
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

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
