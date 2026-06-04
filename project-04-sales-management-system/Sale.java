package com.alhanoof.sales.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String productName;

    private Integer quantity;

    private Double unitPrice;

    private Double totalAmount;

    private LocalDate saleDate;

    private String paymentStatus;

    public Sale() {
    }

    public Sale(String customerName,
                String productName,
                Integer quantity,
                Double unitPrice,
                Double totalAmount,
                LocalDate saleDate,
                String paymentStatus) {
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalAmount = totalAmount;
        this.saleDate = saleDate;
        this.paymentStatus = paymentStatus;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProductName() {
        return productName;
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

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
