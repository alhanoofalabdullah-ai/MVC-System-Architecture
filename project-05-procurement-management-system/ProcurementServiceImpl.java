package com.alhanoof.procurement.service;

import com.alhanoof.procurement.dto.ProcurementRequest;
import com.alhanoof.procurement.dto.ProcurementResponse;
import com.alhanoof.procurement.entity.Procurement;
import com.alhanoof.procurement.exception.ResourceNotFoundException;
import com.alhanoof.procurement.mapper.ProcurementMapper;
import com.alhanoof.procurement.repository.ProcurementRepository;
import com.alhanoof.procurement.validation.ProcurementValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcurementServiceImpl implements ProcurementService {

    private final ProcurementRepository repository;

    public ProcurementServiceImpl(ProcurementRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProcurementResponse createProcurement(ProcurementRequest request) {
        ProcurementValidator.validateStatus(request);
        ProcurementValidator.validateProcurementAmount(request);

        Procurement procurement = ProcurementMapper.toEntity(request);
        Procurement savedProcurement = repository.save(procurement);

        return ProcurementMapper.toResponse(savedProcurement);
    }

    @Override
    public List<ProcurementResponse> getAllProcurements() {
        return repository.findAll()
                .stream()
                .map(ProcurementMapper::toResponse)
                .toList();
    }

    @Override
    public ProcurementResponse getProcurementById(Long id) {
        Procurement procurement = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Procurement not found with id: " + id));

        return ProcurementMapper.toResponse(procurement);
    }

    @Override
    public ProcurementResponse updateProcurement(Long id, ProcurementRequest request) {
        ProcurementValidator.validateStatus(request);
        ProcurementValidator.validateProcurementAmount(request);

        Procurement procurement = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Procurement not found with id: " + id));

        ProcurementMapper.updateEntity(procurement, request);
        Procurement updatedProcurement = repository.save(procurement);

        return ProcurementMapper.toResponse(updatedProcurement);
    }

    @Override
    public String deleteProcurement(Long id) {
        Procurement procurement = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Procurement not found with id: " + id));

        repository.delete(procurement);

        return "Procurement deleted successfully";
    }

    @Override
    public List<ProcurementResponse> searchBySupplierName(String supplierName) {
        return repository.findBySupplierNameContainingIgnoreCase(supplierName)
                .stream()
                .map(ProcurementMapper::toResponse)
                .toList();
    }

    @Override
    public List<ProcurementResponse> searchByStatus(String status) {
        return repository.findByStatusIgnoreCase(status)
                .stream()
                .map(ProcurementMapper::toResponse)
                .toList();
    }

    @Override
    public Page<ProcurementResponse> getProcurementsWithPagination(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());

        return repository.findAll(pageable)
                .map(ProcurementMapper::toResponse);
    }
}
