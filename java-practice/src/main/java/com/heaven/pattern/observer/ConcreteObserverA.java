package com.heaven.pattern.observer;

/**
 * Created by whd@zizizizizi.com on 2016/4/26.
 */
public class ConcreteObserverA extends Observer{

	@Override
	public void update(int state) {
		System.out.println( "ConcreteObserverA get state change event: " + state );
	}
}
