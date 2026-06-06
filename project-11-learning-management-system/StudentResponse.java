package com.alhanoof.lms.dto;

import java.time.LocalDate;

public class StudentResponse {

    private Long id;
    private String studentName;
    private String email;
    private String courseName;
    private String instructorName;
    private Integer progressPercentage;
    private String status;
    private LocalDate enrollmentDate;

    public StudentResponse(Long id,
                           String studentName,
                           String email,
                           String courseName,
                           String instructorName,
                           Integer progressPercentage,
                           String status,
                           LocalDate enrollmentDate) {
        this.id = id;
        this.studentName = studentName;
        this.email = email;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.progressPercentage = progressPercentage;
        this.status = status;
        this.enrollmentDate = enrollmentDate;
    }

    public Long getId() { return id; }
    public String getStudentName() { return studentName; }
    public String getEmail() { return email; }
    public String getCourseName() { return courseName; }
    public String getInstructorName() { return instructorName; }
    public Integer getProgressPercentage() { return progressPercentage; }
    public String getStatus() { return status; }
    public LocalDate getEnrollmentDate() { return enrollmentDate; }
}
