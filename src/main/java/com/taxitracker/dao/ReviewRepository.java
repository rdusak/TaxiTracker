package com.taxitracker.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.taxitracker.dto.ReviewDTO;

public interface ReviewRepository extends CrudRepository<ReviewDTO, Integer> {
	
	List<ReviewDTO> findByDriverID(int driverID);
}
