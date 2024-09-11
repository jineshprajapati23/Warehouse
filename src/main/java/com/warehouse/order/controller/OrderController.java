package com.warehouse.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.warehouse.order.model.Order;
import com.warehouse.order.service.IOrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private IOrderService orderService;
	
	/**
	 * This method is used for creating order
	 * @return OrderRegister page
	 */
	@GetMapping("/register")
	public String register() {
		return "OrderRegister";
	}
	
	
	/**
	 * 
	 * @param uom - It is used to take Order data from UI to Controller
	 * @param model - It is used to store data from controller and return back it UI component
	 * @return It return the saved Order object with ID
	 */
	@PostMapping("/save")
	public String saveOrder(@ModelAttribute Order order, Model model) {

	Integer orderId = 	orderService.saveOrder(order);
	
	String orderMessage = new StringBuilder().append("Order '").append(orderId).append("' saved!!!").toString();
	
	model.addAttribute("orderMessage",orderMessage);
	
	return "OrderRegister";
	}

}
