package org.dimigo.thread;

public class Runner2 implements Runnable{
	private String name;
	
	public Runner2() {
		
	}
	
	public Runner2(String name) {
		this.name = name; 
	}
	
	@Override
	public void run() {
		System.out.println(name + " 출발");
		 try {
	            for(int i = 100; i>=0; i-=10) {
	                System.out.println(name + i + " 미터");
	                Thread.sleep(100);
	            }
	            System.out.println(name + " 골인");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}
}