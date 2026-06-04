package com.alhanoof.employee.service;

import com.alhanoof.employee.dto.EmployeeRequest;
import com.alhanoof.employee.dto.EmployeeResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    EmployeeResponse createEmployee(EmployeeRequest request);

    List<EmployeeResponse> getAllEmployees();

    EmployeeResponse getEmployeeById(Long id);

    EmployeeResponse updateEmployee(Long id, EmployeeRequest request);

    String deleteEmployee(Long id);

    List<EmployeeResponse> searchByDepartment(String department);

    List<EmployeeResponse> searchByStatus(String status);

    Page<EmployeeResponse> getEmployeesWithPagination(int page, int size, String sortBy);
}
