package com.alhanoof.banking.validation;

import com.alhanoof.banking.dto.BankAccountRequest;
import com.alhanoof.banking.exception.ValidationException;
import com.alhanoof.banking.util.Constants;

public class BankAccountValidator {

    private BankAccountValidator() {
    }

    public static void validateAccountType(BankAccountRequest request) {
        String accountType = request.getAccountType().toUpperCase();

        if (!accountType.equals(Constants.TYPE_SAVINGS)
                && !accountType.equals(Constants.TYPE_CURRENT)
                && !accountType.equals(Constants.TYPE_BUSINESS)) {
            throw new ValidationException("Account type must be SAVINGS, CURRENT, or BUSINESS");
        }
    }

    public static void validateStatus(BankAccountRequest request) {
        String status = request.getStatus().toUpperCase();

        if (!status.equals(Constants.STATUS_ACTIVE)
                && !status.equals(Constants.STATUS_FROZEN)
                && !status.equals(Constants.STATUS_CLOSED)) {
            throw new ValidationException("Status must be ACTIVE, FROZEN, or CLOSED");
        }
    }

    public static void validateMinimumBalance(BankAccountRequest request) {
        if (request.getAccountType().equalsIgnoreCase(Constants.TYPE_BUSINESS)
                && request.getBalance() < 10000) {
            throw new ValidationException("Business accounts must have a minimum balance of 10000");
        }
    }
}
