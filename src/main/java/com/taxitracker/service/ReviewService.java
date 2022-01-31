package com.taxitracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.taxitracker.dao.IReviewDAO;
import com.taxitracker.dto.ReviewDTO;

@Component
public class ReviewService implements IReviewService {

	@Autowired
	IReviewDAO reviewDAO;
	
	@Override
	public void delete(ReviewDTO r) {
		reviewDAO.delete(r);
	}

	@Override
	public void save(ReviewDTO r) {
		if (reviewDAO.exists(r)) {
			reviewDAO.delete(r);
		}
		reviewDAO.save(r);
	}

	@Override
	public List<ReviewDTO> findAllWithDriverId(int driverId) {
		return reviewDAO.findAllWithDriverId(driverId);
	}

}
