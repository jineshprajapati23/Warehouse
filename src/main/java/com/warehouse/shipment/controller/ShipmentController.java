package com.warehouse.shipment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.warehouse.shipment.model.Shipment;
import com.warehouse.shipment.service.IShipmentService;

@Controller
@RequestMapping("/shipment")
public class ShipmentController {
	
	@Autowired
	private IShipmentService shipmentService;
	
	/**
	 * This method is used for creating shipment
	 * @return ShipmentRegister page
	 */
	@GetMapping("/register")
	public String register() {
		return "ShipmentRegister";
	}
	
	/**
	 * 
	 * @param uom - It is used to take Shipment data from UI to Controller
	 * @param model - It is used to store data from controller and return back it UI component
	 * @return It return the saved Shipment object with ID
	 */
	@PostMapping("/save")
	public String saveOrder(@ModelAttribute Shipment shipment, Model model) {
			
		Integer shipmentId = shipmentService.saveShipment(shipment);
		String shipmentMessageString = new StringBuilder().append("Shipment '").append(shipmentId).append("' saved!!!").toString();
		model.addAttribute("shipmentMessage", shipmentMessageString);	
		return "ShipmentRegister";
	}
	
	

}
