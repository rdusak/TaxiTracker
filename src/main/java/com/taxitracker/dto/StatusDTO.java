package com.taxitracker.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StatusDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int statusID;
	private int driverID;
	private String shortName;
	private String description;
	private String duration;
	
	public StatusDTO () {}
	
	public StatusDTO(int driverID, String shortName, String description, String duration) {
		super();
		this.driverID = driverID;
		this.shortName = shortName;
		this.description = description;
		this.duration = duration;
	}
	public int getStatusID() {
		return statusID;
	}
	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}
	public int getDriverID() {
		return driverID;
	}

	public void setDriverID(int driverID) {
		this.driverID = driverID;
	}

	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "StatusDTO [statusID=" + statusID + ", driverID=" + driverID + ", shortName=" + shortName
				+ ", description=" + description + ", duration=" + duration + "]";
	}
	
	
	
}
