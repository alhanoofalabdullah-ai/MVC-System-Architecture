package com.alhanoof.ecommerce.dto;

import jakarta.validation.constraints.*;

public class OrderRequest {

    @NotBlank
    private String customerName;

    @NotBlank
    private String productName;

    @NotBlank
    private String category;

    @Positive
    private Integer quantity;

    @Positive
    private Double unitPrice;

    @NotBlank
    private String paymentStatus;

    @NotBlank
    private String orderStatus;

    public String getCustomerName() { return customerName; }
    public String getProductName() { return productName; }
    public String getCategory() { return category; }
    public Integer getQuantity() { return quantity; }
    public Double getUnitPrice() { return unitPrice; }
    public String getPaymentStatus() { return paymentStatus; }
    public String getOrderStatus() { return orderStatus; }

    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setProductName(String productName) { this.productName = productName; }
    public void setCategory(String category) { this.category = category; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    public void setUnitPrice(Double unitPrice) { this.unitPrice = unitPrice; }
    public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }
    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }
}
