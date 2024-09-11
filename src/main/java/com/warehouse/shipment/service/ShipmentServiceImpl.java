package com.warehouse.shipment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warehouse.shipment.model.Shipment;
import com.warehouse.shipment.repo.ShipmentRepository;

@Service
public class ShipmentServiceImpl implements IShipmentService {
	
	@Autowired
	private ShipmentRepository shipmentRepository;

	@Override
	public Integer saveShipment(Shipment shipment) {
		
		Shipment savedShipment = shipmentRepository.save(shipment);
		
		return savedShipment.getShipmentId();
	}

}
