package com.alhanoof.sales.repository;

import com.alhanoof.sales.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalesRepository extends JpaRepository<Sale, Long> {

    List<Sale> findByCustomerNameContainingIgnoreCase(String customerName);

    List<Sale> findByPaymentStatusIgnoreCase(String paymentStatus);
}
