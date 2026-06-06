package com.alhanoof.logistics.service;

import com.alhanoof.logistics.dto.ShipmentRequest;
import com.alhanoof.logistics.dto.ShipmentResponse;
import com.alhanoof.logistics.entity.Shipment;
import com.alhanoof.logistics.exception.ResourceNotFoundException;
import com.alhanoof.logistics.exception.ValidationException;
import com.alhanoof.logistics.mapper.ShipmentMapper;
import com.alhanoof.logistics.repository.ShipmentRepository;
import com.alhanoof.logistics.validation.ShipmentValidator;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository repository;

    public ShipmentServiceImpl(ShipmentRepository repository) {
        this.repository = repository;
    }

    public ShipmentResponse createShipment(ShipmentRequest request) {
        ShipmentValidator.validateDeliveryStatus(request);
        ShipmentValidator.validateRoute(request);

        repository.findByShipmentNumber(request.getShipmentNumber().toUpperCase()).ifPresent(shipment -> {
            throw new ValidationException("Shipment number already exists");
        });

        Shipment shipment = ShipmentMapper.toEntity(request);
        return ShipmentMapper.toResponse(repository.save(shipment));
    }

    public List<ShipmentResponse> getAllShipments() {
        return repository.findAll().stream().map(ShipmentMapper::toResponse).toList();
    }

    public ShipmentResponse getShipmentById(Long id) {
        Shipment shipment = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Shipment not found with id: " + id));

        return ShipmentMapper.toResponse(shipment);
    }

    public ShipmentResponse updateShipment(Long id, ShipmentRequest request) {
        ShipmentValidator.validateDeliveryStatus(request);
        ShipmentValidator.validateRoute(request);

        Shipment shipment = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Shipment not found with id: " + id));

        repository.findByShipmentNumber(request.getShipmentNumber().toUpperCase()).ifPresent(existingShipment -> {
            if (!existingShipment.getId().equals(id)) {
                throw new ValidationException("Shipment number already exists");
            }
        });

        ShipmentMapper.updateEntity(shipment, request);
        return ShipmentMapper.toResponse(repository.save(shipment));
    }

    public String deleteShipment(Long id) {
        Shipment shipment = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Shipment not found with id: " + id));

        repository.delete(shipment);
        return "Shipment deleted successfully";
    }

    public List<ShipmentResponse> searchByDeliveryStatus(String deliveryStatus) {
        return repository.findByDeliveryStatusIgnoreCase(deliveryStatus)
                .stream().map(ShipmentMapper::toResponse).toList();
    }

    public List<ShipmentResponse> searchByDriverName(String driverName) {
        return repository.findByDriverNameContainingIgnoreCase(driverName)
                .stream().map(ShipmentMapper::toResponse).toList();
    }

    public Page<ShipmentResponse> getShipmentsWithPagination(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());
        return repository.findAll(pageable).map(ShipmentMapper::toResponse);
    }
}
