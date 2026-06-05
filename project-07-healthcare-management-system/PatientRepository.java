package com.alhanoof.healthcare.repository;

import com.alhanoof.healthcare.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    Optional<Patient> findByEmail(String email);

    List<Patient> findByDepartmentIgnoreCase(String department);

    List<Patient> findByStatusIgnoreCase(String status);
}
