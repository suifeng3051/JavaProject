package com.heaven.pattern.adaptor;

/**
 * Created by whd@zizizizizi.com on 2016/5/23.
 */
/**
 * 为了能够适配定电饭煲110v电源接口，我们需要继承110v接口
 * */
public class PowerAdaptor implements JP110VInterface {
	private CN220VInterface cn220VInterface;//用220V接口进行适配
	PowerAdaptor(CN220VInterface cn220VInterface){
		this.cn220VInterface=cn220VInterface;
	}
	public void connect() {
		cn220VInterface.connect();
	}
}
