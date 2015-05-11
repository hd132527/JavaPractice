package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("가장 좋아하는 가수는?");
		String answer = s.nextLine();
		if("빅뱅".equals(answer)) {
			System.out.println("정답입니다! ㅎ\n");
		} else {
			System.out.println("틀렸습니다! ㅠ\n");
		}
		
		System.out.println("가장 좋아하는 배우는?");
		answer = s.nextLine();
		if("조인성".equals(answer)) {
			System.out.println("정답입니다! ㅎ\n");
		} else {
			System.out.println("틀렸습니다! ㅠ\n");
		}
		
		System.out.println("가장 좋아하는 과목은?");
		answer = s.nextLine();
		if("자바".equals(answer)) {
			System.out.println("정답입니다! ㅎ\n");
		} else {
			System.out.println("틀렸습니다! ㅠ\n");
		}
		
		s.close();
	}

}
