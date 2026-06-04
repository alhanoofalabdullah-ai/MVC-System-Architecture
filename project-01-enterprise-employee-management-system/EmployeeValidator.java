package com.alhanoof.employee.validation;

import com.alhanoof.employee.dto.EmployeeRequest;
import com.alhanoof.employee.exception.ValidationException;
import com.alhanoof.employee.util.Constants;

public class EmployeeValidator {

    private EmployeeValidator() {
    }

    public static void validateStatus(EmployeeRequest request) {
        String status = request.getStatus().toUpperCase();

        if (!status.equals(Constants.STATUS_ACTIVE) && !status.equals(Constants.STATUS_INACTIVE)) {
            throw new ValidationException("Status must be ACTIVE or INACTIVE");
        }
    }

    public static void validateSalary(EmployeeRequest request) {
        if (request.getSalary() < 3000) {
            throw new ValidationException("Salary must be at least 3000");
        }
    }
}
