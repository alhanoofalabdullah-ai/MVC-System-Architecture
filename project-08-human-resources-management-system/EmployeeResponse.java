package com.alhanoof.hrms.dto;

import java.time.LocalDate;

public class EmployeeResponse {

    private Long id;
    private String fullName;
    private String email;
    private String department;
    private String position;
    private Double salary;
    private LocalDate hireDate;
    private String status;

    public EmployeeResponse(Long id,
                            String fullName,
                            String email,
                            String department,
                            String position,
                            Double salary,
                            LocalDate hireDate,
                            String status) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.department = department;
        this.position = position;
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

    public String getPosition() {
        return position;
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
