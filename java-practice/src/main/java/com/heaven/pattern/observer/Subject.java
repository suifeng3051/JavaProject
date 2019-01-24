package com.heaven.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by whd@zizizizizi.com on 2016/4/25.
 */
public class Subject {
	//主题对象维持着一个依赖它的观察者对象列表
	private List<Observer> observers = new ArrayList<Observer>();
	//主题对象的状态
	private int state;
	//当主题对象状态变化时，调用所有观察者对象的方法
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	//调用所有依赖它的观察者的方法
	public void notifyAllObservers(){
		for (Observer observer : observers) {
			observer.update(state);
		}
	}
	//主题对象也可以注册、和删除依赖它的观察者对象
	public void attach(Observer observer){
		observers.add(observer);
	}

	public int getState() {
		return state;
	}
}


