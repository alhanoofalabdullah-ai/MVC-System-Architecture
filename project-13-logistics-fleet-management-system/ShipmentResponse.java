package com.alhanoof.logistics.dto;

import java.time.LocalDate;

public class ShipmentResponse {

    private Long id;
    private String shipmentNumber;
    private String origin;
    private String destination;
    private String driverName;
    private String vehicleNumber;
    private Double shipmentCost;
    private String deliveryStatus;
    private LocalDate shipmentDate;

    public ShipmentResponse(Long id,
                            String shipmentNumber,
                            String origin,
                            String destination,
                            String driverName,
                            String vehicleNumber,
                            Double shipmentCost,
                            String deliveryStatus,
                            LocalDate shipmentDate) {
        this.id = id;
        this.shipmentNumber = shipmentNumber;
        this.origin = origin;
        this.destination = destination;
        this.driverName = driverName;
        this.vehicleNumber = vehicleNumber;
        this.shipmentCost = shipmentCost;
        this.deliveryStatus = deliveryStatus;
        this.shipmentDate = shipmentDate;
    }

    public Long getId() {
        return id;
    }

    public String getShipmentNumber() {
        return shipmentNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public Double getShipmentCost() {
        return shipmentCost;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public LocalDate getShipmentDate() {
        return shipmentDate;
    }
}
