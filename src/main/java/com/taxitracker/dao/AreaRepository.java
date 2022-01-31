package com.taxitracker.dao;

import org.springframework.data.repository.CrudRepository;

import com.taxitracker.dto.AreaDTO;

public interface AreaRepository extends CrudRepository<AreaDTO, Integer> {

}
