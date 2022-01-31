package com.taxitracker.dao;

import org.springframework.data.repository.CrudRepository;

import com.taxitracker.dto.OrderDTO;

public interface OrderRepository extends CrudRepository<OrderDTO, Integer> {

}
