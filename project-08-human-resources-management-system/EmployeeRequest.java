package com.alhanoof.hrms.dto;

import jakarta.validation.constraints.*;

public class EmployeeRequest {

    @NotBlank
    private String fullName;

    @Email
    private String email;

    @NotBlank
    private String department;

    @NotBlank
    private String position;

    @Positive
    private Double salary;

    @NotBlank
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
