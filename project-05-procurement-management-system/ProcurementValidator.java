package com.alhanoof.procurement.validation;

import com.alhanoof.procurement.dto.ProcurementRequest;
import com.alhanoof.procurement.exception.ValidationException;
import com.alhanoof.procurement.util.Constants;

public class ProcurementValidator {

    private ProcurementValidator() {
    }

    public static void validateStatus(ProcurementRequest request) {
        String status = request.getStatus().toUpperCase();

        if (!status.equals(Constants.STATUS_APPROVED)
                && !status.equals(Constants.STATUS_PENDING)
                && !status.equals(Constants.STATUS_REJECTED)
                && !status.equals(Constants.STATUS_REVIEW_REQUIRED)) {
            throw new ValidationException("Status must be APPROVED, PENDING, REJECTED, or REVIEW_REQUIRED");
        }
    }

    public static void validateProcurementAmount(ProcurementRequest request) {
        Double totalAmount = request.getQuantity() * request.getUnitPrice();

        if (totalAmount <= 0) {
            throw new ValidationException("Total procurement amount must be greater than zero");
        }

        if (totalAmount > 1000000) {
            throw new ValidationException("Procurement amount exceeds allowed transaction limit");
        }
    }
}
