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

		System.out.println("<< ���� ���� �� >>");
		System.out.println("��ٸ��� ���� : " + ls);
		System.out.println("����纯�� ���� : " + ts + "\n");
		
		if(ls > ts)	System.out.println("��ٸ����� ����纯�� ���� " + (ls - ts) + " �� Ů�ϴ�");
		else if(ls < ts) System.out.println("����纯���� ��ٸ��ú��� " + (ts - ls) + " �� Ů�ϴ�");
		else System.out.println("��ٸ��ð� ����纯���� ���̰� �����ϴ�.");
	}

}
