package com.alhanoof.crm.repository;

import com.alhanoof.crm.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByEmail(String email);

    List<Customer> findBySegmentIgnoreCase(String segment);

    List<Customer> findByStatusIgnoreCase(String status);
}
