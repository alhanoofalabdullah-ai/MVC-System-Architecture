package com.alhanoof.employee.mapper;

import com.alhanoof.employee.dto.EmployeeRequest;
import com.alhanoof.employee.dto.EmployeeResponse;
import com.alhanoof.employee.entity.Employee;

import java.time.LocalDate;

public class EmployeeMapper {

    private EmployeeMapper() {
    }

    public static Employee toEntity(EmployeeRequest request) {
        return new Employee(
                request.getFullName(),
                request.getEmail(),
                request.getDepartment(),
                request.getSalary(),
                LocalDate.now(),
                request.getStatus().toUpperCase()
        );
    }

    public static EmployeeResponse toResponse(Employee employee) {
        return new EmployeeResponse(
                employee.getId(),
                employee.getFullName(),
                employee.getEmail(),
                employee.getDepartment(),
                employee.getSalary(),
                employee.getHireDate(),
                employee.getStatus()
        );
    }

    public static void updateEntity(Employee employee, EmployeeRequest request) {
        employee.setFullName(request.getFullName());
        employee.setEmail(request.getEmail());
        employee.setDepartment(request.getDepartment());
        employee.setSalary(request.getSalary());
        employee.setStatus(request.getStatus().toUpperCase());
    }
}
