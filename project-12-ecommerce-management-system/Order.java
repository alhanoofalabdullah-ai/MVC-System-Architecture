package com.alhanoof.ecommerce.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Order() {
    }

    public Order(String customerName, String productName, String category,
                 Integer quantity, Double unitPrice, Double totalAmount,
                 String paymentStatus, String orderStatus, LocalDate orderDate) {
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

    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setProductName(String productName) { this.productName = productName; }
    public void setCategory(String category) { this.category = category; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    public void setUnitPrice(Double unitPrice) { this.unitPrice = unitPrice; }
    public void setTotalAmount(Double totalAmount) { this.totalAmount = totalAmount; }
    public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }
    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }
    public void setOrderDate(LocalDate orderDate) { this.orderDate = orderDate; }
}
