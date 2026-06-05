package com.alhanoof.procurement.service;

import com.alhanoof.procurement.dto.ProcurementRequest;
import com.alhanoof.procurement.dto.ProcurementResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProcurementService {

    ProcurementResponse createProcurement(ProcurementRequest request);

    List<ProcurementResponse> getAllProcurements();

    ProcurementResponse getProcurementById(Long id);

    ProcurementResponse updateProcurement(Long id, ProcurementRequest request);

    String deleteProcurement(Long id);

    List<ProcurementResponse> searchBySupplierName(String supplierName);

    List<ProcurementResponse> searchByStatus(String status);

    Page<ProcurementResponse> getProcurementsWithPagination(int page, int size, String sortBy);
}
