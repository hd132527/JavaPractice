package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int la = 9;
		int lb = 10;
		double lh = 5.8;
		double ls = (la+lb) * lh / 2;
		
		int ta = 9;
		double th = 5.4;
		double ts = (ta * th);

		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + ls);
		System.out.println("평행사변형 넓이 : " + ts + "\n");
		
		if(ls > ts)	System.out.println("사다리꼴이 평행사변형 보다 " + (ls - ts) + " 더 큽니다");
		else if(ls < ts) System.out.println("평행사변형이 사다리꼴보다 " + (ts - ls) + " 더 큽니다");
		else System.out.println("사다리꼴과 평행사변형의 넓이가 같습니다.");
	}

}
