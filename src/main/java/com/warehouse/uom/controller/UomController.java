package com.warehouse.uom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.warehouse.uom.model.Uom;
import com.warehouse.uom.service.IUomService;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/uom")
public class UomController {
	
	@Autowired
	private IUomService uomService;
	
	/**
	 * This method is used for creating Uom
	 * @return UomRregister page 
	 */
	@GetMapping("/register")
	public String register() {
		return "UomRegister";
	}
	
	
	/**
	 * 
	 * @param uom - It is used to take Uom data from UI to Controller
	 * @param model - It is used to store data from controller and return back it UI component
	 * @return It return the saved Uom object with ID
	 */
	@PostMapping("/save")
	public String saveUom(@ModelAttribute Uom uom , org.springframework.ui.Model model) {
		Integer uomId = uomService.saveUom(uom);
		
		String uomMessage = new StringBuilder().append("UOM '").append(uomId).append("' saved!!!").toString();
		
		model.addAttribute("uomMessage",uomMessage);
		return "UomRegister";
				
	}

}
