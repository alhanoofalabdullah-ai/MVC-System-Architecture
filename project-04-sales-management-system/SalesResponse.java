package com.alhanoof.sales.dto;

import java.time.LocalDate;

public class SalesResponse {

    private Long id;

    private String customerName;

    private String productName;

    private Integer quantity;

    private Double unitPrice;

    private Double totalAmount;

    private LocalDate saleDate;

    private String paymentStatus;

    public SalesResponse() {
    }

    public SalesResponse(Long id,
                         String customerName,
                         String productName,
                         Integer quantity,
                         Double unitPrice,
                         Double totalAmount,
                         LocalDate saleDate,
                         String paymentStatus) {
        this.id = id;
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
}
