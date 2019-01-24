package com.heaven.progress.thread;

public class TestInterrupt implements Runnable{


	public void run() {
		System.out.println("thread run...");
		try {
			System.out.println("begin to sleep...");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("sleep was interrupted");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		TestInterrupt ti=new TestInterrupt();
		Thread t=new Thread(ti);
		t.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.interrupt();//终断线程运行
		
	}

}
