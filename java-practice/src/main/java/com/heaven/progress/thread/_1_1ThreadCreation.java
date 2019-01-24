package com.heaven.progress.thread;
/**1.3线程的创建***/
public class _1_1ThreadCreation {
	public static void main(String[] args) {
		/**1.3.1主线程***/
		//获得主线程的引用
		//修改线程名字
		//修改线程名字
		Thread t=Thread.currentThread();
		System.out.println("old thread:"+t);
		t.setName("My Thread");
		System.out.println("new thread:"+t);
		try{
		for(int i=0;i<10;i++){
			System.out.println(i);
			Thread.sleep(1000);//让线程休眠
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		/**1.3.2实现runnable接口***/
		RunableDemo ra=new RunableDemo("线程A");
		RunableDemo rb=new RunableDemo("线程B");
		Thread ta=new Thread(ra);
		Thread tb=new Thread(rb);
		ta.start();
		tb.start();
		/**1.3.3继承Thread类***/
		ThreadDemo tc=new ThreadDemo("线程C");
		ThreadDemo td=new ThreadDemo("线程D");
		tc.start();
		td.start();
	}

}
