package com.alhanoof.logistics.repository;

import com.alhanoof.logistics.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

    Optional<Shipment> findByShipmentNumber(String shipmentNumber);

    List<Shipment> findByDeliveryStatusIgnoreCase(String deliveryStatus);

    List<Shipment> findByDriverNameContainingIgnoreCase(String driverName);
}
