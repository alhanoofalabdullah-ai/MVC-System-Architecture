package com.alhanoof.banking.service;

import com.alhanoof.banking.dto.BankAccountRequest;
import com.alhanoof.banking.dto.BankAccountResponse;
import com.alhanoof.banking.entity.BankAccount;
import com.alhanoof.banking.exception.ResourceNotFoundException;
import com.alhanoof.banking.exception.ValidationException;
import com.alhanoof.banking.mapper.BankAccountMapper;
import com.alhanoof.banking.repository.BankAccountRepository;
import com.alhanoof.banking.validation.BankAccountValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountServiceImpl implements BankAccountService {

    private final BankAccountRepository repository;

    public BankAccountServiceImpl(BankAccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public BankAccountResponse createAccount(BankAccountRequest request) {
        BankAccountValidator.validateAccountType(request);
        BankAccountValidator.validateStatus(request);
        BankAccountValidator.validateMinimumBalance(request);

        repository.findByAccountNumber(request.getAccountNumber().toUpperCase()).ifPresent(account -> {
            throw new ValidationException("Account number already exists");
        });

        BankAccount account = BankAccountMapper.toEntity(request);
        BankAccount savedAccount = repository.save(account);

        return BankAccountMapper.toResponse(savedAccount);
    }

    @Override
    public List<BankAccountResponse> getAllAccounts() {
        return repository.findAll()
                .stream()
                .map(BankAccountMapper::toResponse)
                .toList();
    }

    @Override
    public BankAccountResponse getAccountById(Long id) {
        BankAccount account = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bank account not found with id: " + id));

        return BankAccountMapper.toResponse(account);
    }

    @Override
    public BankAccountResponse updateAccount(Long id, BankAccountRequest request) {
        BankAccountValidator.validateAccountType(request);
        BankAccountValidator.validateStatus(request);
        BankAccountValidator.validateMinimumBalance(request);

        BankAccount account = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bank account not found with id: " + id));

        repository.findByAccountNumber(request.getAccountNumber().toUpperCase()).ifPresent(existingAccount -> {
            if (!existingAccount.getId().equals(id)) {
                throw new ValidationException("Account number already exists");
            }
        });

        BankAccountMapper.updateEntity(account, request);
        BankAccount updatedAccount = repository.save(account);

        return BankAccountMapper.toResponse(updatedAccount);
    }

    @Override
    public String deleteAccount(Long id) {
        BankAccount account = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bank account not found with id: " + id));

        repository.delete(account);

        return "Bank account deleted successfully";
    }

    @Override
    public List<BankAccountResponse> searchByAccountType(String accountType) {
        return repository.findByAccountTypeIgnoreCase(accountType)
                .stream()
                .map(BankAccountMapper::toResponse)
                .toList();
    }

    @Override
    public List<BankAccountResponse> searchByStatus(String status) {
        return repository.findByStatusIgnoreCase(status)
                .stream()
                .map(BankAccountMapper::toResponse)
                .toList();
    }

    @Override
    public Page<BankAccountResponse> getAccountsWithPagination(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());

        return repository.findAll(pageable)
                .map(BankAccountMapper::toResponse);
    }
}
