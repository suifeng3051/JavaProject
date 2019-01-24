package com.heaven.progress.thread;
public class TestRunnable implements Runnable{
	private int count=100;
	public void run(){
		for(int i=0;i<200;i++){
			if(count>0){
				System.out.println(Thread.currentThread().getName()+" "+count--);
			}
		}
	}
	public static void main(String[] args) {
		TestRunnable r=new TestRunnable();
		Thread t1=new Thread(r,"A");
		Thread t2=new Thread(r,"B");
		t1.start();
		t2.start();		
	}
}
