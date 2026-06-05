package com.alhanoof.healthcare.controller;

import com.alhanoof.healthcare.dto.PatientRequest;
import com.alhanoof.healthcare.dto.PatientResponse;
import com.alhanoof.healthcare.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private final PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    @PostMapping
    public PatientResponse createPatient(@Valid @RequestBody PatientRequest request) {
        return service.createPatient(request);
    }

    @GetMapping
    public List<PatientResponse> getAllPatients() {
        return service.getAllPatients();
    }

    @GetMapping("/{id}")
    public PatientResponse getPatientById(@PathVariable Long id) {
        return service.getPatientById(id);
    }

    @PutMapping("/{id}")
    public PatientResponse updatePatient(
            @PathVariable Long id,
            @Valid @RequestBody PatientRequest request
    ) {
        return service.updatePatient(id, request);
    }

    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable Long id) {
        return service.deletePatient(id);
    }

    @GetMapping("/search/department")
    public List<PatientResponse> searchByDepartment(@RequestParam String department) {
        return service.searchByDepartment(department);
    }

    @GetMapping("/search/status")
    public List<PatientResponse> searchByStatus(@RequestParam String status) {
        return service.searchByStatus(status);
    }

    @GetMapping("/paged")
    public Page<PatientResponse> getPatientsWithPagination(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        return service.getPatientsWithPagination(page, size, sortBy);
    }
}
