package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance = 10;
		String carType = "����";
		int fee = 0;
		
		System.out.println("<< ��ӵ��� ����� ��� >>");
		System.out.println("�Ÿ� : " + distance + "km");
		System.out.println("���� : " + carType + "��");
		
		if(distance > 0) {
			switch(carType){
			case "����":
				if(distance <= 10){
					fee = 300;
				} else {
					fee = 300 + 200*((distance-1)/10);
				}
				break;
			case "��ӹ���":
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
		System.out.println("����� : " + fee + "��");
	}

}