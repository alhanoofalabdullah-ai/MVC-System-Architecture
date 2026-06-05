package com.alhanoof.procurement.controller;

import com.alhanoof.procurement.dto.ProcurementRequest;
import com.alhanoof.procurement.dto.ProcurementResponse;
import com.alhanoof.procurement.service.ProcurementService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/procurements")
public class ProcurementController {

    private final ProcurementService service;

    public ProcurementController(ProcurementService service) {
        this.service = service;
    }

    @PostMapping
    public ProcurementResponse createProcurement(@Valid @RequestBody ProcurementRequest request) {
        return service.createProcurement(request);
    }

    @GetMapping
    public List<ProcurementResponse> getAllProcurements() {
        return service.getAllProcurements();
    }

    @GetMapping("/{id}")
    public ProcurementResponse getProcurementById(@PathVariable Long id) {
        return service.getProcurementById(id);
    }

    @PutMapping("/{id}")
    public ProcurementResponse updateProcurement(
            @PathVariable Long id,
            @Valid @RequestBody ProcurementRequest request
    ) {
        return service.updateProcurement(id, request);
    }

    @DeleteMapping("/{id}")
    public String deleteProcurement(@PathVariable Long id) {
        return service.deleteProcurement(id);
    }

    @GetMapping("/search/supplier")
    public List<ProcurementResponse> searchBySupplierName(@RequestParam String supplierName) {
        return service.searchBySupplierName(supplierName);
    }

    @GetMapping("/search/status")
    public List<ProcurementResponse> searchByStatus(@RequestParam String status) {
        return service.searchByStatus(status);
    }

    @GetMapping("/paged")
    public Page<ProcurementResponse> getProcurementsWithPagination(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        return service.getProcurementsWithPagination(page, size, sortBy);
    }
}
