package com.warehouse.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warehouse.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
