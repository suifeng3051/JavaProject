package com.heaven.pattern.adaptor;

/**
 * Created by whd@zizizizizi.com on 2016/5/25.
 */
public class ElectricCooker {
	private JP110VInterface jp110VInterface;//日本电饭煲，用的是日本110V标准电源接口
	ElectricCooker(JP110VInterface jp110VInterface){
		this.jp110VInterface=jp110VInterface;
	}
	public void cook(){
		jp110VInterface.connect();//接通电源
		System.out.println("开始做饭......");
	}
}
