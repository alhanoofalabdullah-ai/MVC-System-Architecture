package com.alhanoof.healthcare.validation;

import com.alhanoof.healthcare.dto.PatientRequest;
import com.alhanoof.healthcare.exception.ValidationException;
import com.alhanoof.healthcare.util.Constants;

public class PatientValidator {

    private PatientValidator() {
    }

    public static void validateStatus(PatientRequest request) {
        String status = request.getStatus().toUpperCase();

        if (!status.equals(Constants.STATUS_ACTIVE)
                && !status.equals(Constants.STATUS_DISCHARGED)
                && !status.equals(Constants.STATUS_UNDER_TREATMENT)) {
            throw new ValidationException("Status must be ACTIVE, DISCHARGED, or UNDER_TREATMENT");
        }
    }

    public static void validateDepartment(PatientRequest request) {
        String department = request.getDepartment().toUpperCase();

        if (!department.equals(Constants.DEPARTMENT_CARDIOLOGY)
                && !department.equals(Constants.DEPARTMENT_INTERNAL_MEDICINE)
                && !department.equals(Constants.DEPARTMENT_DERMATOLOGY)
                && !department.equals(Constants.DEPARTMENT_PEDIATRICS)) {
            throw new ValidationException("Department must be CARDIOLOGY, INTERNAL_MEDICINE, DERMATOLOGY, or PEDIATRICS");
        }
    }

    public static void validatePhoneNumber(PatientRequest request) {
        if (request.getPhoneNumber().length() < 8) {
            throw new ValidationException("Phone number must be at least 8 digits");
        }
    }
}
