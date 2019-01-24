package com.heaven.pattern.proxy;

/**
 * Created by whd@zizizizizi.com on 2016/5/23.
 */
public class TestProxy {
	public static void main(String[] args) {
		SomeBody someBody=new SomeBody();
		TrainStationProxy adaptor=new TrainStationProxy(new TrainStation());
		someBody.goToTicketSubject(adaptor);
		someBody.buy();
	}
}
