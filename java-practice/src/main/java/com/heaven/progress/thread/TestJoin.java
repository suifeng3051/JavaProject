package com.heaven.progress.thread;

public class TestJoin implements Runnable{
	public static int a=0;


	public void run() {
		try {
			System.out.println("Thread begin");
			Thread.sleep(2000);
			System.out.println("Thread end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * 测试Join的有效期：join的有效期时间即是主线程的wait时间。
	 * */
	public static void main(String[] args) {
		TestJoin tj=new TestJoin();
		Thread t=new Thread(tj);
		t.start();
		try {
			t.join(0);
			System.out.println("join end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
