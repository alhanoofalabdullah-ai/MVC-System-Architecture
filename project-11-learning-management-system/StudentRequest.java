package com.alhanoof.lms.dto;

import jakarta.validation.constraints.*;

public class StudentRequest {

    @NotBlank
    private String studentName;

    @Email
    private String email;

    @NotBlank
    private String courseName;

    @NotBlank
    private String instructorName;

    @Min(0)
    @Max(100)
    private Integer progressPercentage;

    @NotBlank
    private String status;

    public String getStudentName() {
        return studentName;
    }

    public String getEmail() {
        return email;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public Integer getProgressPercentage() {
        return progressPercentage;
    }

    public String getStatus() {
        return status;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setProgressPercentage(Integer progressPercentage) {
        this.progressPercentage = progressPercentage;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
