package com.alhanoof.healthcare.service;

import com.alhanoof.healthcare.dto.PatientRequest;
import com.alhanoof.healthcare.dto.PatientResponse;
import com.alhanoof.healthcare.entity.Patient;
import com.alhanoof.healthcare.exception.ResourceNotFoundException;
import com.alhanoof.healthcare.exception.ValidationException;
import com.alhanoof.healthcare.mapper.PatientMapper;
import com.alhanoof.healthcare.repository.PatientRepository;
import com.alhanoof.healthcare.validation.PatientValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository repository;

    public PatientServiceImpl(PatientRepository repository) {
        this.repository = repository;
    }

    @Override
    public PatientResponse createPatient(PatientRequest request) {
        PatientValidator.validateStatus(request);
        PatientValidator.validateDepartment(request);
        PatientValidator.validatePhoneNumber(request);

        repository.findByEmail(request.getEmail()).ifPresent(patient -> {
            throw new ValidationException("Patient email already exists");
        });

        Patient patient = PatientMapper.toEntity(request);
        Patient savedPatient = repository.save(patient);

        return PatientMapper.toResponse(savedPatient);
    }

    @Override
    public List<PatientResponse> getAllPatients() {
        return repository.findAll()
                .stream()
                .map(PatientMapper::toResponse)
                .toList();
    }

    @Override
    public PatientResponse getPatientById(Long id) {
        Patient patient = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found with id: " + id));

        return PatientMapper.toResponse(patient);
    }

    @Override
    public PatientResponse updatePatient(Long id, PatientRequest request) {
        PatientValidator.validateStatus(request);
        PatientValidator.validateDepartment(request);
        PatientValidator.validatePhoneNumber(request);

        Patient patient = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found with id: " + id));

        repository.findByEmail(request.getEmail()).ifPresent(existingPatient -> {
            if (!existingPatient.getId().equals(id)) {
                throw new ValidationException("Patient email already exists");
            }
        });

        PatientMapper.updateEntity(patient, request);
        Patient updatedPatient = repository.save(patient);

        return PatientMapper.toResponse(updatedPatient);
    }

    @Override
    public String deletePatient(Long id) {
        Patient patient = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found with id: " + id));

        repository.delete(patient);

        return "Patient deleted successfully";
    }

    @Override
    public List<PatientResponse> searchByDepartment(String department) {
        return repository.findByDepartmentIgnoreCase(department)
                .stream()
                .map(PatientMapper::toResponse)
                .toList();
    }

    @Override
    public List<PatientResponse> searchByStatus(String status) {
        return repository.findByStatusIgnoreCase(status)
                .stream()
                .map(PatientMapper::toResponse)
                .toList();
    }

    @Override
    public Page<PatientResponse> getPatientsWithPagination(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());

        return repository.findAll(pageable)
                .map(PatientMapper::toResponse);
    }
}
