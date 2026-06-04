package com.alhanoof.inventory.validation;

import com.alhanoof.inventory.dto.ProductRequest;
import com.alhanoof.inventory.exception.ValidationException;
import com.alhanoof.inventory.util.Constants;

public class ProductValidator {

    private ProductValidator() {
    }

    public static void validateStatus(ProductRequest request) {
        String status = request.getStatus().toUpperCase();

        if (!status.equals(Constants.STATUS_AVAILABLE)
                && !status.equals(Constants.STATUS_LOW_STOCK)
                && !status.equals(Constants.STATUS_OUT_OF_STOCK)) {
            throw new ValidationException("Status must be AVAILABLE, LOW_STOCK, or OUT_OF_STOCK");
        }
    }

    public static void validateInventoryRules(ProductRequest request) {
        if (request.getQuantity() == 0
                && !request.getStatus().equalsIgnoreCase(Constants.STATUS_OUT_OF_STOCK)) {
            throw new ValidationException("Products with zero quantity must have OUT_OF_STOCK status");
        }

        if (request.getQuantity() > 0
                && request.getQuantity() <= 10
                && request.getStatus().equalsIgnoreCase(Constants.STATUS_AVAILABLE)) {
            throw new ValidationException("Products with quantity 10 or below should use LOW_STOCK status");
        }
    }
}
