package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		int avgMoney = 1700000;
		byte numPeople = 3;
		int cntStore = 1500;
		long total = (long)avgMoney * 12 * (long)numPeople * (long)cntStore;
		
		System.out.println("<< ��̺��� ���� �ΰǺ� >>");
		System.out.println("�� ��� �޿� : " + String.format("%,d", avgMoney) + "��");
		System.out.println("���� �� ���� �� : " + numPeople + "��");
		System.out.println("���� �� : " + String.format("%,d", cntStore) + "��\n");
		System.out.println("�ΰǺ� : " + String.format("%,d", total) + "��");
	}

}
