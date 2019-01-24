package com.heaven.progress.thread;

public class TestProducerCustomer {
	public static void main(String[] args) {
		SteamBreadStack sbs=new SteamBreadStack();
		Producer p=new Producer(sbs);
		Customer c=new Customer(sbs);
		Thread tp=new Thread(p);
		Thread tc=new Thread(c);
		tp.start();
		tc.start();
	}
}
