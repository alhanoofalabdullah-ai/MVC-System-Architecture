package com.alhanoof.logistics.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class ShipmentRequest {

    @NotBlank
    private String shipmentNumber;

    @NotBlank
    private String origin;

    @NotBlank
    private String destination;

    @NotBlank
    private String driverName;

    @NotBlank
    private String vehicleNumber;

    @Positive
    private Double shipmentCost;

    @NotBlank
    private String deliveryStatus;

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

    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setShipmentCost(Double shipmentCost) {
        this.shipmentCost = shipmentCost;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
