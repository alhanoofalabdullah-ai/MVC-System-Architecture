package com.alhanoof.logistics.validation;

import com.alhanoof.logistics.dto.ShipmentRequest;
import com.alhanoof.logistics.exception.ValidationException;
import com.alhanoof.logistics.util.Constants;

public class ShipmentValidator {

    private ShipmentValidator() {
    }

    public static void validateDeliveryStatus(ShipmentRequest request) {
        String status = request.getDeliveryStatus().toUpperCase();

        if (!status.equals(Constants.PENDING)
                && !status.equals(Constants.IN_TRANSIT)
                && !status.equals(Constants.DELIVERED)
                && !status.equals(Constants.CANCELLED)) {
            throw new ValidationException("Delivery status must be PENDING, IN_TRANSIT, DELIVERED, or CANCELLED");
        }
    }

    public static void validateRoute(ShipmentRequest request) {
        if (request.getOrigin().equalsIgnoreCase(request.getDestination())) {
            throw new ValidationException("Origin and destination cannot be the same");
        }
    }
}
