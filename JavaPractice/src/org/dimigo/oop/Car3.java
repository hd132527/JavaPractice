package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 1. 개요 : Car 클래스
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 * @author 인호
 *
 */
public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car3() {
		
	}
	/*
	public Car2(String newcompany, String newmodel, String newcolor, int newMaxSpeed, int newPrice) {
		company = newcompany;
		model = newmodel;
		color = newcolor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
	}
	*/
	public Car3(String company, String model, String color, int maxSpeed, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	
	public Car3(String company, String model, String color, int maxSpeed) {
		this(company, model, color, maxSpeed, 0);
	}
	
	public Car3(String company, String model, String color) {
		this(company, model, color, 0);
	}
	
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
/*
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
	*/
}
