package com.alhanoof.insurance.validation;

import com.alhanoof.insurance.dto.PolicyRequest;
import com.alhanoof.insurance.exception.ValidationException;
import com.alhanoof.insurance.util.Constants;

public class PolicyValidator {

    private PolicyValidator() {
    }

    public static void validatePolicyType(PolicyRequest request) {
        String type = request.getPolicyType().toUpperCase();

        if (!type.equals(Constants.HEALTH)
                && !type.equals(Constants.VEHICLE)
                && !type.equals(Constants.PROPERTY)
                && !type.equals(Constants.LIFE)) {
            throw new ValidationException("Policy type must be HEALTH, VEHICLE, PROPERTY, or LIFE");
        }
    }

    public static void validateStatus(PolicyRequest request) {
        String status = request.getStatus().toUpperCase();

        if (!status.equals(Constants.ACTIVE)
                && !status.equals(Constants.EXPIRED)
                && !status.equals(Constants.CANCELLED)
                && !status.equals(Constants.PENDING)) {
            throw new ValidationException("Status must be ACTIVE, EXPIRED, CANCELLED, or PENDING");
        }
    }

    public static void validateCoverage(PolicyRequest request) {
        if (request.getCoverageAmount() < request.getPremiumAmount()) {
            throw new ValidationException("Coverage amount must be greater than premium amount");
        }
    }
}
