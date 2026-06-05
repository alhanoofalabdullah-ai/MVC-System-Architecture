package com.alhanoof.procurement.mapper;

import com.alhanoof.procurement.dto.ProcurementRequest;
import com.alhanoof.procurement.dto.ProcurementResponse;
import com.alhanoof.procurement.entity.Procurement;

import java.time.LocalDate;

public class ProcurementMapper {

    private ProcurementMapper() {
    }

    public static Procurement toEntity(ProcurementRequest request) {
        Double totalAmount = request.getQuantity() * request.getUnitPrice();

        return new Procurement(
                request.getRequesterName(),
                request.getSupplierName(),
                request.getItemName(),
                request.getQuantity(),
                request.getUnitPrice(),
                totalAmount,
                LocalDate.now(),
                request.getStatus().toUpperCase()
        );
    }

    public static ProcurementResponse toResponse(Procurement procurement) {
        return new ProcurementResponse(
                procurement.getId(),
                procurement.getRequesterName(),
                procurement.getSupplierName(),
                procurement.getItemName(),
                procurement.getQuantity(),
                procurement.getUnitPrice(),
                procurement.getTotalAmount(),
                procurement.getRequestDate(),
                procurement.getStatus()
        );
    }

    public static void updateEntity(Procurement procurement, ProcurementRequest request) {
        Double totalAmount = request.getQuantity() * request.getUnitPrice();

        procurement.setRequesterName(request.getRequesterName());
        procurement.setSupplierName(request.getSupplierName());
        procurement.setItemName(request.getItemName());
        procurement.setQuantity(request.getQuantity());
        procurement.setUnitPrice(request.getUnitPrice());
        procurement.setTotalAmount(totalAmount);
        procurement.setStatus(request.getStatus().toUpperCase());
    }
}
