package com.alhanoof.ecommerce.dto;

import java.time.LocalDate;

public class OrderResponse {

    private Long id;
    private String customerName;
    private String productName;
    private String category;
    private Integer quantity;
    private Double unitPrice;
    private Double totalAmount;
    private String paymentStatus;
    private String orderStatus;
    private LocalDate orderDate;

    public OrderResponse(Long id, String customerName, String productName, String category,
                         Integer quantity, Double unitPrice, Double totalAmount,
                         String paymentStatus, String orderStatus, LocalDate orderDate) {
        this.id = id;
        this.customerName = customerName;
        this.productName = productName;
        this.category = category;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalAmount = totalAmount;
        this.paymentStatus = paymentStatus;
        this.orderStatus = orderStatus;
        this.orderDate = orderDate;
    }

    public Long getId() { return id; }
    public String getCustomerName() { return customerName; }
    public String getProductName() { return productName; }
    public String getCategory() { return category; }
    public Integer getQuantity() { return quantity; }
    public Double getUnitPrice() { return unitPrice; }
    public Double getTotalAmount() { return totalAmount; }
    public String getPaymentStatus() { return paymentStatus; }
    public String getOrderStatus() { return orderStatus; }
    public LocalDate getOrderDate() { return orderDate; }
}
