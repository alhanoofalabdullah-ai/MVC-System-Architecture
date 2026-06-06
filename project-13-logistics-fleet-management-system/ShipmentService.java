package com.alhanoof.logistics.service;

import com.alhanoof.logistics.dto.ShipmentRequest;
import com.alhanoof.logistics.dto.ShipmentResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ShipmentService {

    ShipmentResponse createShipment(ShipmentRequest request);

    List<ShipmentResponse> getAllShipments();

    ShipmentResponse getShipmentById(Long id);

    ShipmentResponse updateShipment(Long id, ShipmentRequest request);

    String deleteShipment(Long id);

    List<ShipmentResponse> searchByDeliveryStatus(String deliveryStatus);

    List<ShipmentResponse> searchByDriverName(String driverName);

    Page<ShipmentResponse> getShipmentsWithPagination(int page, int size, String sortBy);
}
