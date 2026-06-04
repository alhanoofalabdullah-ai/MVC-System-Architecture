package com.alhanoof.crm.service;

import com.alhanoof.crm.dto.CustomerRequest;
import com.alhanoof.crm.dto.CustomerResponse;
import com.alhanoof.crm.entity.Customer;
import com.alhanoof.crm.exception.ResourceNotFoundException;
import com.alhanoof.crm.exception.ValidationException;
import com.alhanoof.crm.mapper.CustomerMapper;
import com.alhanoof.crm.repository.CustomerRepository;
import com.alhanoof.crm.validation.CustomerValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public CustomerResponse createCustomer(CustomerRequest request) {
        CustomerValidator.validateStatus(request);
        CustomerValidator.validateSegment(request);
        CustomerValidator.validatePhoneNumber(request);

        repository.findByEmail(request.getEmail()).ifPresent(customer -> {
            throw new ValidationException("Customer email already exists");
        });

        Customer customer = CustomerMapper.toEntity(request);
        Customer savedCustomer = repository.save(customer);

        return CustomerMapper.toResponse(savedCustomer);
    }

    @Override
    public List<CustomerResponse> getAllCustomers() {
        return repository.findAll()
                .stream()
                .map(CustomerMapper::toResponse)
                .toList();
    }

    @Override
    public CustomerResponse getCustomerById(Long id) {
        Customer customer = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + id));

        return CustomerMapper.toResponse(customer);
    }

    @Override
    public CustomerResponse updateCustomer(Long id, CustomerRequest request) {
        CustomerValidator.validateStatus(request);
        CustomerValidator.validateSegment(request);
        CustomerValidator.validatePhoneNumber(request);

        Customer customer = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + id));

        repository.findByEmail(request.getEmail()).ifPresent(existingCustomer -> {
            if (!existingCustomer.getId().equals(id)) {
                throw new ValidationException("Customer email already exists");
            }
        });

        CustomerMapper.updateEntity(customer, request);
        Customer updatedCustomer = repository.save(customer);

        return CustomerMapper.toResponse(updatedCustomer);
    }

    @Override
    public String deleteCustomer(Long id) {
        Customer customer = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + id));

        repository.delete(customer);

        return "Customer deleted successfully";
    }

    @Override
    public List<CustomerResponse> searchBySegment(String segment) {
        return repository.findBySegmentIgnoreCase(segment)
                .stream()
                .map(CustomerMapper::toResponse)
                .toList();
    }

    @Override
    public List<CustomerResponse> searchByStatus(String status) {
        return repository.findByStatusIgnoreCase(status)
                .stream()
                .map(CustomerMapper::toResponse)
                .toList();
    }

    @Override
    public Page<CustomerResponse> getCustomersWithPagination(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());

        return repository.findAll(pageable)
                .map(CustomerMapper::toResponse);
    }
}
