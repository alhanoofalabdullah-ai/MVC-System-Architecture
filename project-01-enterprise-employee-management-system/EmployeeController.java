package com.alhanoof.employee.controller;

import com.alhanoof.employee.dto.EmployeeRequest;
import com.alhanoof.employee.dto.EmployeeResponse;
import com.alhanoof.employee.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping
    public EmployeeResponse createEmployee(@Valid @RequestBody EmployeeRequest request) {
        return service.createEmployee(request);
    }

    @GetMapping
    public List<EmployeeResponse> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeResponse getEmployeeById(@PathVariable Long id) {
        return service.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public EmployeeResponse updateEmployee(
            @PathVariable Long id,
            @Valid @RequestBody EmployeeRequest request
    ) {
        return service.updateEmployee(id, request);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        return service.deleteEmployee(id);
    }

    @GetMapping("/search/department")
    public List<EmployeeResponse> searchByDepartment(@RequestParam String department) {
        return service.searchByDepartment(department);
    }

    @GetMapping("/search/status")
    public List<EmployeeResponse> searchByStatus(@RequestParam String status) {
        return service.searchByStatus(status);
    }

    @GetMapping("/paged")
    public Page<EmployeeResponse> getEmployeesWithPagination(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        return service.getEmployeesWithPagination(page, size, sortBy);
    }
}
