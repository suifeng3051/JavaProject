package com.heaven.pattern.observer;

/**
 * Created by whd@zizizizizi.com on 2016/4/26.
 */
public class ObserverPatternDemo {
	public static void main(String[] args) {
		//初始化主题对象
		Subject subject = new Subject();
		//注册观察者对象到主题对象
		ConcreteObserverA ConcreteObserverA=new ConcreteObserverA();
		ConcreteObserverB ConcreteObserverB=new ConcreteObserverB();
		subject.attach(ConcreteObserverA);
		subject.attach(ConcreteObserverB);
		//主题对象状态发生变化
		subject.setState(20);

	}
}
