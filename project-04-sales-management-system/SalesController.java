package com.alhanoof.sales.controller;

import com.alhanoof.sales.dto.SalesRequest;
import com.alhanoof.sales.dto.SalesResponse;
import com.alhanoof.sales.service.SalesService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sales")
public class SalesController {

    private final SalesService service;

    public SalesController(SalesService service) {
        this.service = service;
    }

    @PostMapping
    public SalesResponse createSale(@Valid @RequestBody SalesRequest request) {
        return service.createSale(request);
    }

    @GetMapping
    public List<SalesResponse> getAllSales() {
        return service.getAllSales();
    }

    @GetMapping("/{id}")
    public SalesResponse getSaleById(@PathVariable Long id) {
        return service.getSaleById(id);
    }

    @PutMapping("/{id}")
    public SalesResponse updateSale(
            @PathVariable Long id,
            @Valid @RequestBody SalesRequest request
    ) {
        return service.updateSale(id, request);
    }

    @DeleteMapping("/{id}")
    public String deleteSale(@PathVariable Long id) {
        return service.deleteSale(id);
    }

    @GetMapping("/search/customer")
    public List<SalesResponse> searchByCustomerName(@RequestParam String customerName) {
        return service.searchByCustomerName(customerName);
    }

    @GetMapping("/search/status")
    public List<SalesResponse> searchByPaymentStatus(@RequestParam String paymentStatus) {
        return service.searchByPaymentStatus(paymentStatus);
    }

    @GetMapping("/paged")
    public Page<SalesResponse> getSalesWithPagination(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        return service.getSalesWithPagination(page, size, sortBy);
    }
}
