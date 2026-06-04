package com.alhanoof.employee.service;

import com.alhanoof.employee.dto.EmployeeRequest;
import com.alhanoof.employee.dto.EmployeeResponse;
import com.alhanoof.employee.entity.Employee;
import com.alhanoof.employee.exception.ResourceNotFoundException;
import com.alhanoof.employee.exception.ValidationException;
import com.alhanoof.employee.mapper.EmployeeMapper;
import com.alhanoof.employee.repository.EmployeeRepository;
import com.alhanoof.employee.validation.EmployeeValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public EmployeeResponse createEmployee(EmployeeRequest request) {
        EmployeeValidator.validateStatus(request);
        EmployeeValidator.validateSalary(request);

        repository.findByEmail(request.getEmail()).ifPresent(employee -> {
            throw new ValidationException("Employee email already exists");
        });

        Employee employee = EmployeeMapper.toEntity(request);
        Employee savedEmployee = repository.save(employee);

        return EmployeeMapper.toResponse(savedEmployee);
    }

    @Override
    public List<EmployeeResponse> getAllEmployees() {
        return repository.findAll()
                .stream()
                .map(EmployeeMapper::toResponse)
                .toList();
    }

    @Override
    public EmployeeResponse getEmployeeById(Long id) {
        Employee employee = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));

        return EmployeeMapper.toResponse(employee);
    }

    @Override
    public EmployeeResponse updateEmployee(Long id, EmployeeRequest request) {
        EmployeeValidator.validateStatus(request);
        EmployeeValidator.validateSalary(request);

        Employee employee = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));

        repository.findByEmail(request.getEmail()).ifPresent(existingEmployee -> {
            if (!existingEmployee.getId().equals(id)) {
                throw new ValidationException("Employee email already exists");
            }
        });

        EmployeeMapper.updateEntity(employee, request);
        Employee updatedEmployee = repository.save(employee);

        return EmployeeMapper.toResponse(updatedEmployee);
    }

    @Override
    public String deleteEmployee(Long id) {
        Employee employee = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));

        repository.delete(employee);

        return "Employee deleted successfully";
    }

    @Override
    public List<EmployeeResponse> searchByDepartment(String department) {
        return repository.findByDepartmentIgnoreCase(department)
                .stream()
                .map(EmployeeMapper::toResponse)
                .toList();
    }

    @Override
    public List<EmployeeResponse> searchByStatus(String status) {
        return repository.findByStatusIgnoreCase(status)
                .stream()
                .map(EmployeeMapper::toResponse)
                .toList();
    }

    @Override
    public Page<EmployeeResponse> getEmployeesWithPagination(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());

        return repository.findAll(pageable)
                .map(EmployeeMapper::toResponse);
    }
}
