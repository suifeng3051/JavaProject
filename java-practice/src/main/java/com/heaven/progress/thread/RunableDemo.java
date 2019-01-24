package com.heaven.progress.thread;
public class RunableDemo implements Runnable{
	RunableDemo(String name){
		this.name=name;
	}
	private String name;

	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(name+" run "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		RunableDemo ra=new RunableDemo("线程A");
		RunableDemo rb=new RunableDemo("线程B");
		Thread ta=new Thread(ra);
		Thread tb=new Thread(rb);
		ta.start();
		tb.start();
	}
}
