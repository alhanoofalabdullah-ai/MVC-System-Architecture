package com.alhanoof.crm.mapper;

import com.alhanoof.crm.dto.CustomerRequest;
import com.alhanoof.crm.dto.CustomerResponse;
import com.alhanoof.crm.entity.Customer;

import java.time.LocalDate;

public class CustomerMapper {

    private CustomerMapper() {
    }

    public static Customer toEntity(CustomerRequest request) {
        return new Customer(
                request.getFullName(),
                request.getEmail(),
                request.getPhoneNumber(),
                request.getSegment().toUpperCase(),
                LocalDate.now(),
                request.getStatus().toUpperCase()
        );
    }

    public static CustomerResponse toResponse(Customer customer) {
        return new CustomerResponse(
                customer.getId(),
                customer.getFullName(),
                customer.getEmail(),
                customer.getPhoneNumber(),
                customer.getSegment(),
                customer.getRegistrationDate(),
                customer.getStatus()
        );
    }

    public static void updateEntity(Customer customer, CustomerRequest request) {
        customer.setFullName(request.getFullName());
        customer.setEmail(request.getEmail());
        customer.setPhoneNumber(request.getPhoneNumber());
        customer.setSegment(request.getSegment().toUpperCase());
        customer.setStatus(request.getStatus().toUpperCase());
    }
}
