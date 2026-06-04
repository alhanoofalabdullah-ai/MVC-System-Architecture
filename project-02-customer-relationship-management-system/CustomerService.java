package com.alhanoof.crm.service;

import com.alhanoof.crm.dto.CustomerRequest;
import com.alhanoof.crm.dto.CustomerResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CustomerService {

    CustomerResponse createCustomer(CustomerRequest request);

    List<CustomerResponse> getAllCustomers();

    CustomerResponse getCustomerById(Long id);

    CustomerResponse updateCustomer(Long id, CustomerRequest request);

    String deleteCustomer(Long id);

    List<CustomerResponse> searchBySegment(String segment);

    List<CustomerResponse> searchByStatus(String status);

    Page<CustomerResponse> getCustomersWithPagination(int page, int size, String sortBy);
}
