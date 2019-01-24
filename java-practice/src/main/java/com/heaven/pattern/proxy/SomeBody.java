package com.heaven.pattern.proxy;

/**
 * Created by whd@zizizizizi.com on 2016/5/23.
 */
public class SomeBody {
	private TicketSubject tickSubject;
	public void buy(){
		tickSubject.sell();
	}
	public void goToTicketSubject( TicketSubject tickSubject){
		this.tickSubject=tickSubject;
	}
}
