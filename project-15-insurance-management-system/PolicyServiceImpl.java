package com.alhanoof.insurance.service;

import com.alhanoof.insurance.dto.PolicyRequest;
import com.alhanoof.insurance.dto.PolicyResponse;
import com.alhanoof.insurance.entity.InsurancePolicy;
import com.alhanoof.insurance.exception.ResourceNotFoundException;
import com.alhanoof.insurance.exception.ValidationException;
import com.alhanoof.insurance.mapper.PolicyMapper;
import com.alhanoof.insurance.repository.PolicyRepository;
import com.alhanoof.insurance.validation.PolicyValidator;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyServiceImpl implements PolicyService {

    private final PolicyRepository repository;

    public PolicyServiceImpl(PolicyRepository repository) {
        this.repository = repository;
    }

    @Override
    public PolicyResponse createPolicy(PolicyRequest request) {
        PolicyValidator.validatePolicyType(request);
        PolicyValidator.validateStatus(request);
        PolicyValidator.validateCoverage(request);

        repository.findByPolicyNumber(request.getPolicyNumber().toUpperCase()).ifPresent(policy -> {
            throw new ValidationException("Policy number already exists");
        });

        InsurancePolicy policy = PolicyMapper.toEntity(request);
        return PolicyMapper.toResponse(repository.save(policy));
    }

    @Override
    public List<PolicyResponse> getAllPolicies() {
        return repository.findAll()
                .stream()
                .map(PolicyMapper::toResponse)
                .toList();
    }

    @Override
    public PolicyResponse getPolicyById(Long id) {
        InsurancePolicy policy = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Policy not found with id: " + id));

        return PolicyMapper.toResponse(policy);
    }

    @Override
    public PolicyResponse updatePolicy(Long id, PolicyRequest request) {
        PolicyValidator.validatePolicyType(request);
        PolicyValidator.validateStatus(request);
        PolicyValidator.validateCoverage(request);

        InsurancePolicy policy = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Policy not found with id: " + id));

        repository.findByPolicyNumber(request.getPolicyNumber().toUpperCase()).ifPresent(existingPolicy -> {
            if (!existingPolicy.getId().equals(id)) {
                throw new ValidationException("Policy number already exists");
            }
        });

        PolicyMapper.updateEntity(policy, request);
        return PolicyMapper.toResponse(repository.save(policy));
    }

    @Override
    public String deletePolicy(Long id) {
        InsurancePolicy policy = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Policy not found with id: " + id));

        repository.delete(policy);
        return "Policy deleted successfully";
    }

    @Override
    public List<PolicyResponse> searchByPolicyType(String policyType) {
        return repository.findByPolicyTypeIgnoreCase(policyType)
                .stream()
                .map(PolicyMapper::toResponse)
                .toList();
    }

    @Override
    public List<PolicyResponse> searchByStatus(String status) {
        return repository.findByStatusIgnoreCase(status)
                .stream()
                .map(PolicyMapper::toResponse)
                .toList();
    }

    @Override
    public Page<PolicyResponse> getPoliciesWithPagination(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());

        return repository.findAll(pageable)
                .map(PolicyMapper::toResponse);
    }
}
