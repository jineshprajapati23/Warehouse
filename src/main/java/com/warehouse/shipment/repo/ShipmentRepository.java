package com.warehouse.shipment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warehouse.shipment.model.Shipment;

public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {

}
