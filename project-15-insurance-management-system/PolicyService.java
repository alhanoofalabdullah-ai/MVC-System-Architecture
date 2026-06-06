package com.alhanoof.insurance.service;

import com.alhanoof.insurance.dto.PolicyRequest;
import com.alhanoof.insurance.dto.PolicyResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PolicyService {

    PolicyResponse createPolicy(PolicyRequest request);

    List<PolicyResponse> getAllPolicies();

    PolicyResponse getPolicyById(Long id);

    PolicyResponse updatePolicy(Long id, PolicyRequest request);

    String deletePolicy(Long id);

    List<PolicyResponse> searchByPolicyType(String policyType);

    List<PolicyResponse> searchByStatus(String status);

    Page<PolicyResponse> getPoliciesWithPagination(int page, int size, String sortBy);
}
