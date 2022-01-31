package com.taxitracker.dao;

import java.util.List;

import com.taxitracker.dto.ReviewDTO;

public interface IReviewDAO {

	void delete(ReviewDTO r);
	
	void save(ReviewDTO r);

	boolean exists(ReviewDTO r);
	
	List<ReviewDTO> findAllWithDriverId(int driverId);
}