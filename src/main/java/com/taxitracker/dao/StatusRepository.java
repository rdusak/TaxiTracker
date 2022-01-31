package com.taxitracker.dao;

import org.springframework.data.repository.CrudRepository;

import com.taxitracker.dto.StatusDTO;

public interface StatusRepository extends CrudRepository<StatusDTO, Integer> {

}
