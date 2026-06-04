package com.alhanoof.sales.service;

import com.alhanoof.sales.dto.SalesRequest;
import com.alhanoof.sales.dto.SalesResponse;
import com.alhanoof.sales.entity.Sale;
import com.alhanoof.sales.exception.ResourceNotFoundException;
import com.alhanoof.sales.mapper.SalesMapper;
import com.alhanoof.sales.repository.SalesRepository;
import com.alhanoof.sales.validation.SalesValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesServiceImpl implements SalesService {

    private final SalesRepository repository;

    public SalesServiceImpl(SalesRepository repository) {
        this.repository = repository;
    }

    @Override
    public SalesResponse createSale(SalesRequest request) {
        SalesValidator.validatePaymentStatus(request);
        SalesValidator.validateSalesAmount(request);

        Sale sale = SalesMapper.toEntity(request);
        Sale savedSale = repository.save(sale);

        return SalesMapper.toResponse(savedSale);
    }

    @Override
    public List<SalesResponse> getAllSales() {
        return repository.findAll()
                .stream()
                .map(SalesMapper::toResponse)
                .toList();
    }

    @Override
    public SalesResponse getSaleById(Long id) {
        Sale sale = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sale not found with id: " + id));

        return SalesMapper.toResponse(sale);
    }

    @Override
    public SalesResponse updateSale(Long id, SalesRequest request) {
        SalesValidator.validatePaymentStatus(request);
        SalesValidator.validateSalesAmount(request);

        Sale sale = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sale not found with id: " + id));

        SalesMapper.updateEntity(sale, request);
        Sale updatedSale = repository.save(sale);

        return SalesMapper.toResponse(updatedSale);
    }

    @Override
    public String deleteSale(Long id) {
        Sale sale = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sale not found with id: " + id));

        repository.delete(sale);

        return "Sale deleted successfully";
    }

    @Override
    public List<SalesResponse> searchByCustomerName(String customerName) {
        return repository.findByCustomerNameContainingIgnoreCase(customerName)
                .stream()
                .map(SalesMapper::toResponse)
                .toList();
    }

    @Override
    public List<SalesResponse> searchByPaymentStatus(String paymentStatus) {
        return repository.findByPaymentStatusIgnoreCase(paymentStatus)
                .stream()
                .map(SalesMapper::toResponse)
                .toList();
    }

    @Override
    public Page<SalesResponse> getSalesWithPagination(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());

        return repository.findAll(pageable)
                .map(SalesMapper::toResponse);
    }
}
