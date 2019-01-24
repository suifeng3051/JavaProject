package com.heaven.pattern.proxy;

/**
 * Created by whd@zizizizizi.com on 2016/5/23.
 */
public class TrainStationProxy implements TicketSubject {
	private TrainStation trainStation;
	public TrainStationProxy(TrainStation trainStation){
		this.trainStation=trainStation;
	}

	public void sell() {
		System.out.println("欢迎光临!");
		trainStation.sell();
		System.out.println("请交手续费!");
	}
}
