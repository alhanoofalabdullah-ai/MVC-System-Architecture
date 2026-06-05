package com.alhanoof.banking.dto;

import java.time.LocalDate;

public class BankAccountResponse {

    private Long id;

    private String customerName;

    private String accountNumber;

    private String accountType;

    private Double balance;

    private LocalDate createdDate;

    private String status;

    public BankAccountResponse() {
    }

    public BankAccountResponse(Long id,
                               String customerName,
                               String accountNumber,
                               String accountType,
                               Double balance,
                               LocalDate createdDate,
                               String status) {
        this.id = id;
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.createdDate = createdDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public String getStatus() {
        return status;
    }
}
