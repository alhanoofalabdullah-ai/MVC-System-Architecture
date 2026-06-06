package com.alhanoof.insurance.mapper;

import com.alhanoof.insurance.dto.PolicyRequest;
import com.alhanoof.insurance.dto.PolicyResponse;
import com.alhanoof.insurance.entity.InsurancePolicy;

import java.time.LocalDate;

public class PolicyMapper {

    private PolicyMapper() {
    }

    public static InsurancePolicy toEntity(PolicyRequest request) {
        return new InsurancePolicy(
                request.getPolicyholderName(),
                request.getPolicyNumber().toUpperCase(),
                request.getPolicyType().toUpperCase(),
                request.getPremiumAmount(),
                request.getCoverageAmount(),
                request.getStatus().toUpperCase(),
                LocalDate.now()
        );
    }

    public static PolicyResponse toResponse(InsurancePolicy policy) {
        return new PolicyResponse(
                policy.getId(),
                policy.getPolicyholderName(),
                policy.getPolicyNumber(),
                policy.getPolicyType(),
                policy.getPremiumAmount(),
                policy.getCoverageAmount(),
                policy.getStatus(),
                policy.getIssueDate()
        );
    }

    public static void updateEntity(InsurancePolicy policy, PolicyRequest request) {
        policy.setPolicyholderName(request.getPolicyholderName());
        policy.setPolicyNumber(request.getPolicyNumber().toUpperCase());
        policy.setPolicyType(request.getPolicyType().toUpperCase());
        policy.setPremiumAmount(request.getPremiumAmount());
        policy.setCoverageAmount(request.getCoverageAmount());
        policy.setStatus(request.getStatus().toUpperCase());
    }
}
