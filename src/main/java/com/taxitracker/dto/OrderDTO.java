package com.taxitracker.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderID;
	private int customerID;
	private int driverID;
	private String date;
	private double price;
	private String place;
	private boolean confirmed;
	
	public OrderDTO () {}
	
	public OrderDTO(int customerID, int driverID, String date, double price, String place, boolean confirmed) {
		super();
		this.customerID = customerID;
		this.driverID = driverID;
		this.date = date;
		this.price = price;
		this.place = place;
		this.confirmed = confirmed;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getDriverID() {
		return driverID;
	}
	public void setDriverID(int driverID) {
		this.driverID = driverID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	@Override
	public String toString() {
		return "OrderDTO [orderID=" + orderID + ", customerID=" + customerID + ", driverID=" + driverID + ", date="
				+ date + ", price=" + price + ", place=" + place + ", confirmed=" + confirmed + "]";
	}
	
	
}
