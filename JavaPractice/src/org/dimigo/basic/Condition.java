package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance = 10;
		String carType = "경차";
		int fee = 0;
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + carType + "원");
		
		if(distance > 0) {
			switch(carType){
			case "경차":
				if(distance <= 10){
					fee = 300;
				} else {
					fee = 300 + 200*((distance-1)/10);
				}
				break;
			case "고속버스":
				if(distance <= 10){
					fee = 850;
				} else {
					fee = 850 + 300*((distance-1)/10);
				}
				break;
			default:
				if(distance <= 10){
					fee = 600;
				} else {
					fee = 600 + 200 * ((distance-1)/10);
				}
			}
		}
		System.out.println("통행료 : " + fee + "원");
	}

}