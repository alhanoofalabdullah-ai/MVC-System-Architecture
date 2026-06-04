package com.alhanoof.sales.validation;

import com.alhanoof.sales.dto.SalesRequest;
import com.alhanoof.sales.exception.ValidationException;
import com.alhanoof.sales.util.Constants;

public class SalesValidator {

    private SalesValidator() {
    }

    public static void validatePaymentStatus(SalesRequest request) {
        String status = request.getPaymentStatus().toUpperCase();

        if (!status.equals(Constants.STATUS_PAID)
                && !status.equals(Constants.STATUS_PENDING)
                && !status.equals(Constants.STATUS_CANCELLED)) {
            throw new ValidationException("Payment status must be PAID, PENDING, or CANCELLED");
        }
    }

    public static void validateSalesAmount(SalesRequest request) {
        Double totalAmount = request.getQuantity() * request.getUnitPrice();

        if (totalAmount <= 0) {
            throw new ValidationException("Total sales amount must be greater than zero");
        }

        if (totalAmount > 1000000) {
            throw new ValidationException("Sales amount exceeds allowed transaction limit");
        }
    }
}
