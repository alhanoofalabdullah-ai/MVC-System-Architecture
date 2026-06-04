package com.alhanoof.sales.service;

import com.alhanoof.sales.dto.SalesRequest;
import com.alhanoof.sales.dto.SalesResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface SalesService {

    SalesResponse createSale(SalesRequest request);

    List<SalesResponse> getAllSales();

    SalesResponse getSaleById(Long id);

    SalesResponse updateSale(Long id, SalesRequest request);

    String deleteSale(Long id);

    List<SalesResponse> searchByCustomerName(String customerName);

    List<SalesResponse> searchByPaymentStatus(String paymentStatus);

    Page<SalesResponse> getSalesWithPagination(int page, int size, String sortBy);
}
