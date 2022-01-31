package com.taxitracker.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerID;
	private int areaID;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public CustomerDTO () {}
	
	public CustomerDTO(int areaID, String firstName, String lastName, String email, String password) {
		super();
		this.areaID = areaID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
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
	@Override
	public String toString() {
		return "CustomerDTO [customerID=" + customerID + ", areaID=" + areaID + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
