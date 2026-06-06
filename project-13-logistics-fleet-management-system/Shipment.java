package com.alhanoof.logistics.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "shipments")
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String shipmentNumber;

    private String origin;

    private String destination;

    private String driverName;

    private String vehicleNumber;

    private Double shipmentCost;

    private String deliveryStatus;

    private LocalDate shipmentDate;

    public Shipment() {
    }

    public Shipment(String shipmentNumber,
                    String origin,
                    String destination,
                    String driverName,
                    String vehicleNumber,
                    Double shipmentCost,
                    String deliveryStatus,
                    LocalDate shipmentDate) {
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

    public void setShipmentDate(LocalDate shipmentDate) {
        this.shipmentDate = shipmentDate;
    }
}
