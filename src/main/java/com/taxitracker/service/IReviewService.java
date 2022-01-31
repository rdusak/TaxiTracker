package com.taxitracker.service;

import java.util.List;

import com.taxitracker.dto.ReviewDTO;

public interface IReviewService {

	void delete(ReviewDTO r);
	
	void save(ReviewDTO r);
	
	List<ReviewDTO> findAllWithDriverId(int driverId);
}
