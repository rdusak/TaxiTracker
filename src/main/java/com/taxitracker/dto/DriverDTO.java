package com.taxitracker.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DriverDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int driverID;
	private int areaID;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double costPerKm;
	
	public DriverDTO () {}
	
	public DriverDTO(int areaID, String firstName, String lastName, String email, String password, double costPerKm) {
		super();
		this.areaID = areaID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.costPerKm = costPerKm;
	}
	public int getDriverID() {
		return driverID;
	}
	public void setDriverID(int driverID) {
		this.driverID = driverID;
	}
	public int getAreaID() {
		return areaID;
	}
	public void setAreaID(int areaID) {
		this.areaID = areaID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getCostPerKm() {
		return costPerKm;
	}
	public void setCostPerKm(double costPerKm) {
		this.costPerKm = costPerKm;
	}
	@Override
	public String toString() {
		return "[" + driverID + "] " + firstName + " " + lastName;
	}
	
}
