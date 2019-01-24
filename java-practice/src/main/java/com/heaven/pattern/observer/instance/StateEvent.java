package com.heaven.pattern.observer.instance;

/**
 * Created by whd@zizizizizi.com on 2016/4/27.
 */
public class StateEvent {
	public final int oldState;
	public final int newState;
	StateEvent(int oldState,int newState){
		this.oldState=oldState;
		this.newState=newState;
	}

}

