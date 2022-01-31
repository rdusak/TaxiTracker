package com.taxitracker.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AreaDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int areaID;
	private String name;
	private double radius;
	private String center;
	
	public AreaDTO () {}
	
	public AreaDTO(String name, double radius, String center) {
		super();
		this.name = name;
		this.radius = radius;
		this.center = center;
	}
	public int getAreaID() {
		return areaID;
	}
	public void setAreaID(int areaID) {
		this.areaID = areaID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getCenter() {
		return center;
	}
	public void setCenter(String center) {
		this.center = center;
	}
	@Override
	public String toString() {
		return "AreaDTO [areaID=" + areaID + ", name=" + name + ", radius=" + radius + ", center=" + center + "]";
	}
	
	
}
