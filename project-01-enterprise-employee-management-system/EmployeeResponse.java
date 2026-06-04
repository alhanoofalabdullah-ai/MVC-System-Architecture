package com.alhanoof.employee.dto;

import java.time.LocalDate;

public class EmployeeResponse {

    private Long id;

    private String fullName;

    private String email;

    private String department;

    private Double salary;

    private LocalDate hireDate;

    private String status;

    public EmployeeResponse() {
    }

    public EmployeeResponse(Long id, String fullName, String email, String department, Double salary, LocalDate hireDate, String status) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.department = department;
        this.salary = salary;
        this.hireDate = hireDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public String getStatus() {
        return status;
    }
}
