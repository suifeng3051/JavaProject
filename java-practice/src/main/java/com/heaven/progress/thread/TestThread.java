package com.heaven.progress.thread;

public class TestThread extends Thread{
	private String name;
	public TestThread(String name) {
		this.name=name;
	}
	private int count=1000;
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println(name+" "+count--);
		}
	}
	public static void main(String[] args) {
		
		TestThread t1=new TestThread("窗口A");
		TestThread t2=new TestThread("窗口B");
		t1.start();
		t2.start();
		
	}
	
}
