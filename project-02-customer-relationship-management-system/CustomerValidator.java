package com.alhanoof.crm.validation;

import com.alhanoof.crm.dto.CustomerRequest;
import com.alhanoof.crm.exception.ValidationException;
import com.alhanoof.crm.util.Constants;

public class CustomerValidator {

    private CustomerValidator() {
    }

    public static void validateStatus(CustomerRequest request) {
        String status = request.getStatus().toUpperCase();

        if (!status.equals(Constants.STATUS_ACTIVE) && !status.equals(Constants.STATUS_INACTIVE)) {
            throw new ValidationException("Status must be ACTIVE or INACTIVE");
        }
    }

    public static void validateSegment(CustomerRequest request) {
        String segment = request.getSegment().toUpperCase();

        if (!segment.equals(Constants.SEGMENT_STANDARD)
                && !segment.equals(Constants.SEGMENT_VIP)
                && !segment.equals(Constants.SEGMENT_ENTERPRISE)) {
            throw new ValidationException("Segment must be STANDARD, VIP, or ENTERPRISE");
        }
    }

    public static void validatePhoneNumber(CustomerRequest request) {
        if (request.getPhoneNumber().length() < 8) {
            throw new ValidationException("Phone number must be at least 8 digits");
        }
    }
}
