package com.taxitracker.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.taxitracker.dto.ReviewDTO;

@Component
public class ReviewDAO implements IReviewDAO {
	
	@Autowired
	private ReviewRepository repo;
	
	
	/* (non-Javadoc)
	 * @see com.taxitracker.dao.IReviewDAO#delete(com.taxitracker.dto.ReviewDTO)
	 */
	@Override
	public void delete(ReviewDTO r) {
		List<ReviewDTO> toDelete = new ArrayList<>();
		for (ReviewDTO tmp : repo.findAll()) {
			if (tmp.equals(r)) toDelete.add(tmp);
		}
		toDelete.add(r);
		repo.deleteAll(toDelete);
	}


	@Override
	public void save(ReviewDTO r) {
		repo.save(r);		
	}


	@Override
	public boolean exists(ReviewDTO r) {
		boolean result = false;
		for (ReviewDTO tmp : repo.findAll()) {
			if (tmp.equals(r)) 
				result = true;
		}
		
		return result;
	}


	@Override
	public List<ReviewDTO> findAllWithDriverId(int driverId) {
		return repo.findByDriverID(driverId);
	}
	


}
