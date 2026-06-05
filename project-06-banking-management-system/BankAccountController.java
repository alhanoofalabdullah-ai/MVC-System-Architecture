package com.alhanoof.banking.controller;

import com.alhanoof.banking.dto.BankAccountRequest;
import com.alhanoof.banking.dto.BankAccountResponse;
import com.alhanoof.banking.service.BankAccountService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class BankAccountController {

    private final BankAccountService service;

    public BankAccountController(BankAccountService service) {
        this.service = service;
    }

    @PostMapping
    public BankAccountResponse createAccount(@Valid @RequestBody BankAccountRequest request) {
        return service.createAccount(request);
    }

    @GetMapping
    public List<BankAccountResponse> getAllAccounts() {
        return service.getAllAccounts();
    }

    @GetMapping("/{id}")
    public BankAccountResponse getAccountById(@PathVariable Long id) {
        return service.getAccountById(id);
    }

    @PutMapping("/{id}")
    public BankAccountResponse updateAccount(
            @PathVariable Long id,
            @Valid @RequestBody BankAccountRequest request
    ) {
        return service.updateAccount(id, request);
    }

    @DeleteMapping("/{id}")
    public String deleteAccount(@PathVariable Long id) {
        return service.deleteAccount(id);
    }

    @GetMapping("/search/type")
    public List<BankAccountResponse> searchByAccountType(@RequestParam String accountType) {
        return service.searchByAccountType(accountType);
    }

    @GetMapping("/search/status")
    public List<BankAccountResponse> searchByStatus(@RequestParam String status) {
        return service.searchByStatus(status);
    }

    @GetMapping("/paged")
    public Page<BankAccountResponse> getAccountsWithPagination(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        return service.getAccountsWithPagination(page, size, sortBy);
    }
}
