package com.alhanoof.logistics.mapper;

import com.alhanoof.logistics.dto.ShipmentRequest;
import com.alhanoof.logistics.dto.ShipmentResponse;
import com.alhanoof.logistics.entity.Shipment;

import java.time.LocalDate;

public class ShipmentMapper {

    private ShipmentMapper() {
    }

    public static Shipment toEntity(ShipmentRequest request) {
        return new Shipment(
                request.getShipmentNumber().toUpperCase(),
                request.getOrigin(),
                request.getDestination(),
                request.getDriverName(),
                request.getVehicleNumber().toUpperCase(),
                request.getShipmentCost(),
                request.getDeliveryStatus().toUpperCase(),
                LocalDate.now()
        );
    }

    public static ShipmentResponse toResponse(Shipment shipment) {
        return new ShipmentResponse(
                shipment.getId(),
                shipment.getShipmentNumber(),
                shipment.getOrigin(),
                shipment.getDestination(),
                shipment.getDriverName(),
                shipment.getVehicleNumber(),
                shipment.getShipmentCost(),
                shipment.getDeliveryStatus(),
                shipment.getShipmentDate()
        );
    }

    public static void updateEntity(Shipment shipment, ShipmentRequest request) {
        shipment.setShipmentNumber(request.getShipmentNumber().toUpperCase());
        shipment.setOrigin(request.getOrigin());
        shipment.setDestination(request.getDestination());
        shipment.setDriverName(request.getDriverName());
        shipment.setVehicleNumber(request.getVehicleNumber().toUpperCase());
        shipment.setShipmentCost(request.getShipmentCost());
        shipment.setDeliveryStatus(request.getDeliveryStatus().toUpperCase());
    }
}
