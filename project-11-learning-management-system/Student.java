package com.alhanoof.lms.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;

    @Column(unique = true)
    private String email;

    private String courseName;

    private String instructorName;

    private Integer progressPercentage;

    private String status;

    private LocalDate enrollmentDate;

    public Student() {
    }

    public Student(String studentName,
                   String email,
                   String courseName,
                   String instructorName,
                   Integer progressPercentage,
                   String status,
                   LocalDate enrollmentDate) {
        this.studentName = studentName;
        this.email = email;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.progressPercentage = progressPercentage;
        this.status = status;
        this.enrollmentDate = enrollmentDate;
    }

    public Long getId() {
        return id;
    }

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

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
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

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}
