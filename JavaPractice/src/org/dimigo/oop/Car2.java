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
public class Car2 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car2() {
		
	}
	
	public Car2(String newcompany, String newmodel, String newcolor, int newMaxSpeed, int newPrice) {
		company = newcompany;
		model = newmodel;
		color = newcolor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
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
	
}
