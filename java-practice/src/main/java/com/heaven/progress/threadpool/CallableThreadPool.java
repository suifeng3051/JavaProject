package com.heaven.progress.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThreadPool {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		List<Future<?>> futureList = new ArrayList<Future<?>>();
		for (int i = 0; i < 10; i++) {
			Future<?> future = threadPool.submit(new CallableThread(i));
			futureList.add(future);
		}
		
		for (Future<?> future : futureList) {
			Object computeResult = future.get();
			System.out.println(computeResult);
		}
		threadPool.shutdown();
	}

}
