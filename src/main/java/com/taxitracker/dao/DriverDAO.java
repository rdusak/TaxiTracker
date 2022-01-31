package com.taxitracker.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.taxitracker.dto.DriverDTO;

@Component
public class DriverDAO implements IDriverDAO {
	
	@Autowired
	DriverRepository driverRepo;

	@Override
	public List<DriverDTO> getAll() {
		return (List<DriverDTO>) driverRepo.findAll();
	}

	@Override
	public DriverDTO getById(int id) {
		if (driverRepo.existsById(id)) {
			return driverRepo.findById(id).get();
		} else {
			return new DriverDTO();
		}
	}
	
}
