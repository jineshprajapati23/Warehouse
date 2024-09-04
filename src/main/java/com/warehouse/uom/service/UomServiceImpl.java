package com.warehouse.uom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warehouse.uom.model.Uom;
import com.warehouse.uom.repo.UomRepository;

@Service
public class UomServiceImpl implements IUomService {
	
	@Autowired
	private UomRepository uomRepository;

	@Override
	public Integer saveUom(Uom uom) {
		Uom savedUom = uomRepository.save(uom);
		return savedUom.getId();
	}

}
