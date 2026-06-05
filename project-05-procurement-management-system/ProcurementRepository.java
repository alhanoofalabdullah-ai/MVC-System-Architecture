package com.alhanoof.procurement.repository;

import com.alhanoof.procurement.entity.Procurement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProcurementRepository extends JpaRepository<Procurement, Long> {

    List<Procurement> findBySupplierNameContainingIgnoreCase(String supplierName);

    List<Procurement> findByStatusIgnoreCase(String status);
}
