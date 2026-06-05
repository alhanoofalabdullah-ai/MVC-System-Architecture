package com.alhanoof.healthcare.mapper;

import com.alhanoof.healthcare.dto.PatientRequest;
import com.alhanoof.healthcare.dto.PatientResponse;
import com.alhanoof.healthcare.entity.Patient;

import java.time.LocalDate;

public class PatientMapper {

    private PatientMapper() {
    }

    public static Patient toEntity(PatientRequest request) {
        return new Patient(
                request.getFullName(),
                request.getEmail(),
                request.getPhoneNumber(),
                request.getDepartment().toUpperCase(),
                request.getDiagnosis(),
                LocalDate.now(),
                request.getStatus().toUpperCase()
        );
    }

    public static PatientResponse toResponse(Patient patient) {
        return new PatientResponse(
                patient.getId(),
                patient.getFullName(),
                patient.getEmail(),
                patient.getPhoneNumber(),
                patient.getDepartment(),
                patient.getDiagnosis(),
                patient.getRegistrationDate(),
                patient.getStatus()
        );
    }

    public static void updateEntity(Patient patient, PatientRequest request) {
        patient.setFullName(request.getFullName());
        patient.setEmail(request.getEmail());
        patient.setPhoneNumber(request.getPhoneNumber());
        patient.setDepartment(request.getDepartment().toUpperCase());
        patient.setDiagnosis(request.getDiagnosis());
        patient.setStatus(request.getStatus().toUpperCase());
    }
}
