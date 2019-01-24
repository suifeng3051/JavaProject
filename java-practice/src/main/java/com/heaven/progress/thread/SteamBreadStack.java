package com.heaven.progress.thread;

public class SteamBreadStack {
	private int index = 0;
	private SteamBread[] sbs = new SteamBread[6];

	public synchronized void pushBread(SteamBread sb) {
		while (index == sbs.length) {// 筐满了，即栈满，
			try {
				this.wait();// 让当前线程等待
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();// 唤醒在此对象监视器上等待的单个线程，即消费者线程
		sbs[index] = sb;
		this.index++;
		System.out.println("放入了箱子，箱子大小是："+index);
	}

	// 从框中拿出，相当于出栈
	public synchronized SteamBread popBread() {
		while (index == 0) {// 筐空了，即栈空
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();
		this.index--;// push第n个之后，this.index++，使栈顶为n+1，故return之前要减一
		System.out.println("拿出了箱子，箱子大小是："+index);
		return sbs[index];
	}

}
