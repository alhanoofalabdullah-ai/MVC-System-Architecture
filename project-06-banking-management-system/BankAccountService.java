package com.alhanoof.banking.service;

import com.alhanoof.banking.dto.BankAccountRequest;
import com.alhanoof.banking.dto.BankAccountResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BankAccountService {

    BankAccountResponse createAccount(BankAccountRequest request);

    List<BankAccountResponse> getAllAccounts();

    BankAccountResponse getAccountById(Long id);

    BankAccountResponse updateAccount(Long id, BankAccountRequest request);

    String deleteAccount(Long id);

    List<BankAccountResponse> searchByAccountType(String accountType);

    List<BankAccountResponse> searchByStatus(String status);

    Page<BankAccountResponse> getAccountsWithPagination(int page, int size, String sortBy);
}
