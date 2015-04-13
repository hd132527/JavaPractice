package org.dimigo.oop;

public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setCompany(String newcompany) {
		company = newcompany;
	}
	
	public void setModel(String newmodel) {
		model = newmodel;
	}
	
	public void setColor(String newcolor) {
		color = newcolor;
	}
	
	public void setMaxSpeed(int newmaxSpeed) {
		maxSpeed = newmaxSpeed;
	}
	
	public void setPrice(int newprice) {
		price = newprice;
	}
}
