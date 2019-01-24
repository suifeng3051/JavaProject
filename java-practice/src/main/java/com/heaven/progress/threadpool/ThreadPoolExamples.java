package com.heaven.progress.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExamples {
	public static void main(String[] args) {
		try {
			// testCachedThreadPool();
			//testFixedThreadPool();
			testScheduledThreadPool();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	/**
	 * 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程
	 * */
	public static void testCachedThreadPool() throws InterruptedException {
		ExecutorService threadPool = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			final int index = i;
			Thread.sleep(index * 1000);
			threadPool.execute(new Runnable() {
				public void run() {
					System.out.println("[index: " + index + ";" + Thread.currentThread().getName() + ";activeCount: " + Thread.activeCount() + "]");

				}
			});
		}
		threadPool.shutdown();
	}
	/**创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待*/
	public static void testFixedThreadPool() throws InterruptedException {
		ExecutorService threadPool = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			final int index = i;
			Thread.sleep(index * 1000);
			threadPool.execute(new Runnable() {
				public void run() {
					System.out.println("[index: " + index + ";" + Thread.currentThread().getName() + ";activeCount: " + Thread.activeCount() + "]");
				}
			});
		}
		threadPool.shutdown();
	}
	/**创建一个定长线程池，支持定时及周期性任务执行*/
	public static void testScheduledThreadPool() throws InterruptedException {
		ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(5);
		/**定时任务执行,延迟3秒*/
		threadPool.schedule(new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + ";activeCount: " + Thread.activeCount() + "]");
			}
		}, 3, TimeUnit.SECONDS);
		/**定期任务执行,延迟1秒后，每3秒执行一次*/
		threadPool.scheduleAtFixedRate(new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + ";activeCount: " + Thread.activeCount() + "]");
			}
		}, 1,3, TimeUnit.SECONDS);
		threadPool.shutdown();
	}
	
	
}
