package com.alhanoof.inventory.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    @Column(unique = true, nullable = false)
    private String sku;

    private String category;

    private String supplierName;

    private Integer quantity;

    private Double unitPrice;

    private Double inventoryValue;

    private LocalDate createdDate;

    private String status;

    public Product() {
    }

    public Product(String productName,
                   String sku,
                   String category,
                   String supplierName,
                   Integer quantity,
                   Double unitPrice,
                   Double inventoryValue,
                   LocalDate createdDate,
                   String status) {
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

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setInventoryValue(Double inventoryValue) {
        this.inventoryValue = inventoryValue;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
