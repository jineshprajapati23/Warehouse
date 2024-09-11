package com.warehouse.shipment.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "shipment_tab")
public class Shipment {
	
	@Id
	@GeneratedValue
	@Column(name = "shipment_id_col")
	private Integer shipmentId;
	
	@Column(name = "shipment_mode_col")
	private String shipmentMode;
	
	@Column(name = "shipment_code_col")
	private String shipmentCode;
	
	@Column(name = "shipment_enable_col")
	private String enableShipment;
	
	@Column(name = "shipment_grade_col")
	private String shipmentGrade;
	
	@Column(name = "shipment_desc_col")
	private String shipmentDescription;
	
	
}
