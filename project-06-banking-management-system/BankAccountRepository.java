package com.alhanoof.banking.repository;

import com.alhanoof.banking.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

    Optional<BankAccount> findByAccountNumber(String accountNumber);

    List<BankAccount> findByAccountTypeIgnoreCase(String accountType);

    List<BankAccount> findByStatusIgnoreCase(String status);
}
