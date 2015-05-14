package org.dimigo.oop;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		StringBuilder sb1 = new StringBuilder();
		
		System.out.println("국어 점수 입력 => ");
		int kor = s1.nextInt();
		
		System.out.println("수학 점수 입력 => ");
		int math = s1.nextInt();
		
		System.out.println("영어 점수 입력 => ");
		int eng = s1.nextInt();
		
		s1.close();
		
		
		sb1.append("<< 점수 출력 >>\n");
		sb1.append("국어 점수 : " + kor + "점\n");
		sb1.append("수학 점수 : " + math + "점\n");		
		sb1.append("영어 점수 : " + eng + "점\n");
		sb1.append("총점 : " + (kor + math + eng) + "점\n");
		sb1.append("평균 : " + (String.format("%.1f", (kor + math + eng)/3.0)) + "점\n");
		
		System.out.println(sb1);
	}
}
