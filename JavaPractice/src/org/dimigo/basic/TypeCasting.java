package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		int avgMoney = 1700000;
		byte numPeople = 3;
		int cntStore = 1500;
		long total = (long)avgMoney * 12 * (long)numPeople * (long)cntStore;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", avgMoney) + "원");
		System.out.println("점포 내 직원 수 : " + numPeople + "명");
		System.out.println("점포 수 : " + String.format("%,d", cntStore) + "개\n");
		System.out.println("인건비 : " + String.format("%,d", total) + "원");
	}

}
