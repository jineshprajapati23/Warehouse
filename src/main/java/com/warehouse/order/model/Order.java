package com.warehouse.order.model;

import javax.management.StringValueExp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "order_tab")
public class Order {
	
	@Id
	@GeneratedValue
	@Column(name = "order_id_col")
	private Integer orderId;
	
	@Column(name = "order_mode_col")
	private String orderMode;
	
	@Column(name = "order_code_col")
	private String orderCode;
	
	@Column(name = "order_method_col")
	private String orderMethod;
	
	@Column(name = "order_accepted_col")
	private String orderAccepted;
	
	@Column(name = "order_desc_col")
	private String orderDescription; 
	
	

}
