package com.alhanoof.healthcare.service;

import com.alhanoof.healthcare.dto.PatientRequest;
import com.alhanoof.healthcare.dto.PatientResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PatientService {

    PatientResponse createPatient(PatientRequest request);

    List<PatientResponse> getAllPatients();

    PatientResponse getPatientById(Long id);

    PatientResponse updatePatient(Long id, PatientRequest request);

    String deletePatient(Long id);

    List<PatientResponse> searchByDepartment(String department);

    List<PatientResponse> searchByStatus(String status);

    Page<PatientResponse> getPatientsWithPagination(int page, int size, String sortBy);
}
