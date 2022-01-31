package com.taxitracker.service;

import java.util.List;

import com.taxitracker.dto.DriverDTO;

public interface IDriverService {

	DriverDTO fetchByID(int id);

	void save(DriverDTO driver);

	List<DriverDTO> getAllDrivers();

}