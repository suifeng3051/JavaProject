package com.heaven.pattern.proxy;

/**
 * Created by whd@zizizizizi.com on 2016/5/23.
 */
public class TrainStation implements TicketSubject {
	public void sell() {
		System.out.println("卖出一张票!");
	}
}
