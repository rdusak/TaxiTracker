package com.taxitracker.dao;

import java.util.List;

import com.taxitracker.dto.DriverDTO;

public interface IDriverDAO {

	List<DriverDTO> getAll();

	DriverDTO getById(int id);

}
