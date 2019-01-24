package com.heaven.progress.thread;

public class TestOtherThread implements Runnable{
	 public void run() {
	        for (int i = 0; i < 3; i++) {
	        	try {
					Thread.sleep(2000);//每隔2秒运行一次
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	            System.out.println(Thread.currentThread().getName());
	        }
	    }
	 
	    public static void main(String[] args) {
	    	TestOtherThread test = new TestOtherThread();
	        Thread demo = new Thread(test,"线程");
	        /***测试线程状态
	        System.out.println("线程启动之前---》" + demo.isAlive());
	        demo.start();
	        System.out.println("线程启动之后---》" + demo.isAlive());
	        */
	        demo.start();
	        for(int i=0;i<30;i++){
	        	if(i>5){
	        		try {
						demo.join();
					} catch (InterruptedException e) {					
						e.printStackTrace();
					}
	        	}
	        	System.out.println("主线程执行"+i);
	        }
	        
	    }
}
