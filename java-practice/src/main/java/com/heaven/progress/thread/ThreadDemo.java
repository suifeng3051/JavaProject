package com.heaven.progress.thread;
public class ThreadDemo extends Thread{
	private String name;
	ThreadDemo(String name){
		this.name=name;
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(name+" run "+i);
		}
	}
	public static void main(String[] args) {
		ThreadDemo ta=new ThreadDemo("线程A");
		ThreadDemo tb=new ThreadDemo("线程B");
		ta.start();
		tb.start();
	}
}
