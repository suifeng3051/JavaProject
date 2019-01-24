package com.heaven.pattern.dynamicproxy;

/**
 * Created by whd@zizizizizi.com on 2016/5/26.
 */
public class RealSubjectB implements SubjectB{
	public void sayHello(String name) {
		System.out.println("--------------say hello:"+name+"-------------");
	}
}
