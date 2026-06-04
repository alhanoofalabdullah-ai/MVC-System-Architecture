package com.alhanoof.sales.mapper;

import com.alhanoof.sales.dto.SalesRequest;
import com.alhanoof.sales.dto.SalesResponse;
import com.alhanoof.sales.entity.Sale;

import java.time.LocalDate;

public class SalesMapper {

    private SalesMapper() {
    }

    public static Sale toEntity(SalesRequest request) {
        Double totalAmount = request.getQuantity() * request.getUnitPrice();

        return new Sale(
                request.getCustomerName(),
                request.getProductName(),
                request.getQuantity(),
                request.getUnitPrice(),
                totalAmount,
                LocalDate.now(),
                request.getPaymentStatus().toUpperCase()
        );
    }

    public static SalesResponse toResponse(Sale sale) {
        return new SalesResponse(
                sale.getId(),
                sale.getCustomerName(),
                sale.getProductName(),
                sale.getQuantity(),
                sale.getUnitPrice(),
                sale.getTotalAmount(),
                sale.getSaleDate(),
                sale.getPaymentStatus()
        );
    }

    public static void updateEntity(Sale sale, SalesRequest request) {
        Double totalAmount = request.getQuantity() * request.getUnitPrice();

        sale.setCustomerName(request.getCustomerName());
        sale.setProductName(request.getProductName());
        sale.setQuantity(request.getQuantity());
        sale.setUnitPrice(request.getUnitPrice());
        sale.setTotalAmount(totalAmount);
        sale.setPaymentStatus(request.getPaymentStatus().toUpperCase());
    }
}
