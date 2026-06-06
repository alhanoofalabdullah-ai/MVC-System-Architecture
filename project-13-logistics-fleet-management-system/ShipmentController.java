package com.alhanoof.logistics.controller;

import com.alhanoof.logistics.dto.ShipmentRequest;
import com.alhanoof.logistics.dto.ShipmentResponse;
import com.alhanoof.logistics.service.ShipmentService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentController {

    private final ShipmentService service;

    public ShipmentController(ShipmentService service) {
        this.service = service;
    }

    @PostMapping
    public ShipmentResponse createShipment(@Valid @RequestBody ShipmentRequest request) {
        return service.createShipment(request);
    }

    @GetMapping
    public List<ShipmentResponse> getAllShipments() {
        return service.getAllShipments();
    }

    @GetMapping("/{id}")
    public ShipmentResponse getShipmentById(@PathVariable Long id) {
        return service.getShipmentById(id);
    }

    @PutMapping("/{id}")
    public ShipmentResponse updateShipment(@PathVariable Long id, @Valid @RequestBody ShipmentRequest request) {
        return service.updateShipment(id, request);
    }

    @DeleteMapping("/{id}")
    public String deleteShipment(@PathVariable Long id) {
        return service.deleteShipment(id);
    }

    @GetMapping("/search/status")
    public List<ShipmentResponse> searchByDeliveryStatus(@RequestParam String deliveryStatus) {
        return service.searchByDeliveryStatus(deliveryStatus);
    }

    @GetMapping("/search/driver")
    public List<ShipmentResponse> searchByDriverName(@RequestParam String driverName) {
        return service.searchByDriverName(driverName);
    }

    @GetMapping("/paged")
    public Page<ShipmentResponse> getShipmentsWithPagination(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        return service.getShipmentsWithPagination(page, size, sortBy);
    }
}
