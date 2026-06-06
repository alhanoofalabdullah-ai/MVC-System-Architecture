package com.alhanoof.ecommerce.mapper;

import com.alhanoof.ecommerce.dto.OrderRequest;
import com.alhanoof.ecommerce.dto.OrderResponse;
import com.alhanoof.ecommerce.entity.Order;

import java.time.LocalDate;

public class OrderMapper {

    private OrderMapper() {
    }

    public static Order toEntity(OrderRequest request) {
        Double totalAmount = request.getQuantity() * request.getUnitPrice();

        return new Order(
                request.getCustomerName(),
                request.getProductName(),
                request.getCategory().toUpperCase(),
                request.getQuantity(),
                request.getUnitPrice(),
                totalAmount,
                request.getPaymentStatus().toUpperCase(),
                request.getOrderStatus().toUpperCase(),
                LocalDate.now()
        );
    }

    public static OrderResponse toResponse(Order order) {
        return new OrderResponse(
                order.getId(),
                order.getCustomerName(),
                order.getProductName(),
                order.getCategory(),
                order.getQuantity(),
                order.getUnitPrice(),
                order.getTotalAmount(),
                order.getPaymentStatus(),
                order.getOrderStatus(),
                order.getOrderDate()
        );
    }

    public static void updateEntity(Order order, OrderRequest request) {
        Double totalAmount = request.getQuantity() * request.getUnitPrice();

        order.setCustomerName(request.getCustomerName());
        order.setProductName(request.getProductName());
        order.setCategory(request.getCategory().toUpperCase());
        order.setQuantity(request.getQuantity());
        order.setUnitPrice(request.getUnitPrice());
        order.setTotalAmount(totalAmount);
        order.setPaymentStatus(request.getPaymentStatus().toUpperCase());
        order.setOrderStatus(request.getOrderStatus().toUpperCase());
    }
}
