package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "������";
		boolean gender = false; // T:Man
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char blood = 'A';

		System.out.println("<< ������ ������ >>");
		System.out.println("�̸� : " + name);
		if(gender == true)	System.out.println("���� : ����");
		else System.out.println("���� : ����");
		System.out.println("���� : " + age + "��");
		System.out.println("Ű : " + height + "cm");
		System.out.println("������ : " + weight + "kg");
		System.out.println("������ : " + blood + "��");
	}

}
