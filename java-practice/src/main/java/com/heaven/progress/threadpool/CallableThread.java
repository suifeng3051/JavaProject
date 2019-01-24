package com.heaven.progress.threadpool;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<Integer>{
	private int i;
	CallableThread(int i){
		this.i=i;
	}
	public Integer call() throws Exception {
		
		return i;
	}

}
