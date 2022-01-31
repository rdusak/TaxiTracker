package com.taxitracker.dao;

import org.springframework.data.repository.CrudRepository;

import com.taxitracker.dto.DriverDTO;

public interface DriverRepository extends CrudRepository<DriverDTO, Integer> {

}
