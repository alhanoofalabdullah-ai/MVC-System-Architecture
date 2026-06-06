package com.alhanoof.ecommerce.validation;

import com.alhanoof.ecommerce.dto.OrderRequest;
import com.alhanoof.ecommerce.exception.ValidationException;
import com.alhanoof.ecommerce.util.Constants;

public class OrderValidator {

    private OrderValidator() {
    }

    public static void validatePaymentStatus(OrderRequest request) {
        String status = request.getPaymentStatus().toUpperCase();

        if (!status.equals(Constants.PAID)
                && !status.equals(Constants.PENDING)
                && !status.equals(Constants.FAILED)) {
            throw new ValidationException("Payment status must be PAID, PENDING, or FAILED");
        }
    }

    public static void validateOrderStatus(OrderRequest request) {
        String status = request.getOrderStatus().toUpperCase();

        if (!status.equals(Constants.CONFIRMED)
                && !status.equals(Constants.SHIPPED)
                && !status.equals(Constants.DELIVERED)
                && !status.equals(Constants.CANCELLED)) {
            throw new ValidationException("Order status must be CONFIRMED, SHIPPED, DELIVERED, or CANCELLED");
        }
    }
}
