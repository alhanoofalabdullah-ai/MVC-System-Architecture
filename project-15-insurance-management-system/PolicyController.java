package com.alhanoof.insurance.controller;

import com.alhanoof.insurance.dto.PolicyRequest;
import com.alhanoof.insurance.dto.PolicyResponse;
import com.alhanoof.insurance.service.PolicyService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/policies")
public class PolicyController {

    private final PolicyService service;

    public PolicyController(PolicyService service) {
        this.service = service;
    }

    @PostMapping
    public PolicyResponse createPolicy(@Valid @RequestBody PolicyRequest request) {
        return service.createPolicy(request);
    }

    @GetMapping
    public List<PolicyResponse> getAllPolicies() {
        return service.getAllPolicies();
    }

    @GetMapping("/{id}")
    public PolicyResponse getPolicyById(@PathVariable Long id) {
        return service.getPolicyById(id);
    }

    @PutMapping("/{id}")
    public PolicyResponse updatePolicy(
            @PathVariable Long id,
            @Valid @RequestBody PolicyRequest request
    ) {
        return service.updatePolicy(id, request);
    }

    @DeleteMapping("/{id}")
    public String deletePolicy(@PathVariable Long id) {
        return service.deletePolicy(id);
    }

    @GetMapping("/search/type")
    public List<PolicyResponse> searchByPolicyType(@RequestParam String policyType) {
        return service.searchByPolicyType(policyType);
    }

    @GetMapping("/search/status")
    public List<PolicyResponse> searchByStatus(@RequestParam String status) {
        return service.searchByStatus(status);
    }

    @GetMapping("/paged")
    public Page<PolicyResponse> getPoliciesWithPagination(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        return service.getPoliciesWithPagination(page, size, sortBy);
    }
}
