package com.alhanoof.crm.controller;

import com.alhanoof.crm.dto.CustomerRequest;
import com.alhanoof.crm.dto.CustomerResponse;
import com.alhanoof.crm.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @PostMapping
    public CustomerResponse createCustomer(@Valid @RequestBody CustomerRequest request) {
        return service.createCustomer(request);
    }

    @GetMapping
    public List<CustomerResponse> getAllCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping("/{id}")
    public CustomerResponse getCustomerById(@PathVariable Long id) {
        return service.getCustomerById(id);
    }

    @PutMapping("/{id}")
    public CustomerResponse updateCustomer(
            @PathVariable Long id,
            @Valid @RequestBody CustomerRequest request
    ) {
        return service.updateCustomer(id, request);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        return service.deleteCustomer(id);
    }

    @GetMapping("/search/segment")
    public List<CustomerResponse> searchBySegment(@RequestParam String segment) {
        return service.searchBySegment(segment);
    }

    @GetMapping("/search/status")
    public List<CustomerResponse> searchByStatus(@RequestParam String status) {
        return service.searchByStatus(status);
    }

    @GetMapping("/paged")
    public Page<CustomerResponse> getCustomersWithPagination(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        return service.getCustomersWithPagination(page, size, sortBy);
    }
}
