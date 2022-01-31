package com.taxitracker.dao;

import org.springframework.data.repository.CrudRepository;

import com.taxitracker.dto.CustomerDTO;

public interface CustomerRepository extends CrudRepository<CustomerDTO, Integer> {

}
