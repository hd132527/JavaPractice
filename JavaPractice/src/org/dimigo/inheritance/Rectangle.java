package org.dimigo.inheritance;

public class Rectangle extends Figure{
	private int height;
	private int width;
	
	public Rectangle(int width, int height) {
		super(0, 0);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}

	protected double calcArea() {
		return (width * height);
	}
	
	protected void printCenter() {
		System.out.print("사각형 ");
		super.printCenter();
	}

}
