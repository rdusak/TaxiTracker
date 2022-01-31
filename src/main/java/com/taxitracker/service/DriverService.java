package com.taxitracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.taxitracker.dao.IDriverDAO;
import com.taxitracker.dto.DriverDTO;

@Component
public class DriverService implements IDriverService {
	
	@Autowired
	IDriverDAO driverDAO;
	
	/* (non-Javadoc)
	 * @see com.taxitracker.service.IDriverService#fetchByID(int)
	 */
	@Override
	public DriverDTO fetchByID(int id) {
		return driverDAO.getById(id);
	}
	
	/* (non-Javadoc)
	 * @see com.taxitracker.service.IDriverService#save(com.taxitracker.dto.DriverDTO)
	 */
	@Override
	public void save(DriverDTO driver) {
		
	}

	@Override
	public List<DriverDTO> getAllDrivers() {
		return driverDAO.getAll();
	}
	
}
