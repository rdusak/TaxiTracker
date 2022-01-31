package com.taxitracker.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReviewDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int reviewID;
	private int customerID;
	private int driverID;
	private double score;
	private String description;
	private String date;
	
	public ReviewDTO () {}
	
	public ReviewDTO(int customerID, int driverID, double score, String description, String date) {
		super();
		this.customerID = customerID;
		this.driverID = driverID;
		this.score = score;
		this.description = description;
		this.date = date;
	}
	public int getReviewID() {
		return reviewID;
	}
	public void setReviewID(int reviewID) {
		this.reviewID = reviewID;
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
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Recenzija br." + reviewID + "\nKlijent br." + customerID + "\nDatum: " + date
				+ "\n" + score + "\n" + description + "\n------------------------------\n";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReviewDTO other = (ReviewDTO) obj;
		if (customerID != other.getCustomerID())
			return false;
		if (date == null) {
			if (other.getDate() != null)
				return false;
		} else if (!date.equals(other.getDate()))
			return false;
		if (driverID != other.getDriverID())
			return false;
		return true;
	}

	
	
}
