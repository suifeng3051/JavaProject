package com.heaven.progress.thread;
public class TestSynchronize implements Runnable{
	private int tickets=5;

	public void run() {
		for(int i=0;i<5;i++){
			sale();
		}
	}
	public synchronized void sale(){
			if(tickets>0){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+":"+tickets--);
			}
	}
	public static void main(String[] args) {
		//此处会出现线程同步问题，因为各个线程共用一个tickets资源。
		TestSynchronize ts=new TestSynchronize();
		Thread ta=new Thread(ts,"窗口A");
		Thread tb=new Thread(ts,"窗口B");
		Thread tc=new Thread(ts,"窗口C");
		ta.start();
		tb.start();
		tc.start();
	}

}
