package com.alhanoof.insurance.repository;

import com.alhanoof.insurance.entity.InsurancePolicy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PolicyRepository extends JpaRepository<InsurancePolicy, Long> {

    Optional<InsurancePolicy> findByPolicyNumber(String policyNumber);

    List<InsurancePolicy> findByPolicyTypeIgnoreCase(String policyType);

    List<InsurancePolicy> findByStatusIgnoreCase(String status);
}
