package com.taxitracker.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TransactionDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int transactionID;
	private int orderID;
	private String date;
	private double sum;
	
	public TransactionDTO () {}
	
	public TransactionDTO(int orderID, String date, double sum) {
		super();
		this.orderID = orderID;
		this.date = date;
		this.sum = sum;
	}
	public int getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "TransactionDTO [transactionID=" + transactionID + ", orderID=" + orderID + ", date=" + date + ", sum="
				+ sum + "]";
	}
	
	
}
