package com.heaven.pattern.adaptor;

/**
 * Created by whd@zizizizizi.com on 2016/5/23.
 */
public class AdaptorTest {
	public static void main(String[] args) {
		CN220VInterface cn220VInterface=new CN220VInterfaceImpl();//中国的220V电源
		PowerAdaptor adaptor=new PowerAdaptor(cn220VInterface);//电源适配器
		ElectricCooker cooker=new ElectricCooker(adaptor);//使用110V接口的电饭煲
		cooker.cook();//使用了适配器，在220V的环境下可以工作啦
	}
}
