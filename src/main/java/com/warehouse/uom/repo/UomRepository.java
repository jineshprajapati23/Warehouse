package com.warehouse.uom.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warehouse.uom.model.Uom;

public interface UomRepository extends JpaRepository<Uom, Integer> {

}
