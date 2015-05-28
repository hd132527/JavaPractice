package org.dimigo.oop;

public class IdolGroup {

	public static void main(String[] args) {

		String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};	
		String[][] idols = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "소진", "민아", "혜리", "그외"}
		};
		/*
		for(int i=0; i<idolGroup.length; i++) {
			System.out.println("<< " + idolGroup[i] + " 멤버 >>");
			for(int j=0; j<idols[i].length; j++) {
				System.out.println(idols[i][j]);
			}
			System.out.println();
		}
		*/	
		for(int i=0; i<idolGroup.length; i++) {
			System.out.println("<< " + idolGroup[i] + " 멤버 >>");
			for(String value:idols[i]) {
				System.out.println(value);
			}
			System.out.println();
		}
	}

}
