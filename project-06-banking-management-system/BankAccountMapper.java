package com.alhanoof.banking.mapper;

import com.alhanoof.banking.dto.BankAccountRequest;
import com.alhanoof.banking.dto.BankAccountResponse;
import com.alhanoof.banking.entity.BankAccount;

import java.time.LocalDate;

public class BankAccountMapper {

    private BankAccountMapper() {
    }

    public static BankAccount toEntity(BankAccountRequest request) {
        return new BankAccount(
                request.getCustomerName(),
                request.getAccountNumber().toUpperCase(),
                request.getAccountType().toUpperCase(),
                request.getBalance(),
                LocalDate.now(),
                request.getStatus().toUpperCase()
        );
    }

    public static BankAccountResponse toResponse(BankAccount account) {
        return new BankAccountResponse(
                account.getId(),
                account.getCustomerName(),
                account.getAccountNumber(),
                account.getAccountType(),
                account.getBalance(),
                account.getCreatedDate(),
                account.getStatus()
        );
    }

    public static void updateEntity(BankAccount account, BankAccountRequest request) {
        account.setCustomerName(request.getCustomerName());
        account.setAccountNumber(request.getAccountNumber().toUpperCase());
        account.setAccountType(request.getAccountType().toUpperCase());
        account.setBalance(request.getBalance());
        account.setStatus(request.getStatus().toUpperCase());
    }
}
