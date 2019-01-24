package com.heaven.pattern.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Created by whd@zizizizizi.com on 2016/5/25.
 */
public class TestDynamicProxy {
	public static void main(String[] args) {
		RealSubjectA realA = new RealSubjectA();
		SubjectA proxySubjectA = (SubjectA) Proxy.newProxyInstance(SubjectA.class.getClassLoader(),
				new Class[]{SubjectA.class},
				new LogHandler(realA));
		RealSubjectB realB = new RealSubjectB();
		SubjectB proxySubjectB = (SubjectB) Proxy.newProxyInstance(SubjectB.class.getClassLoader(),
				new Class[]{SubjectB.class},
				new LogHandler(realB));
		proxySubjectA.setUser("heaven","123456");
		proxySubjectB.sayHello("heaven");
	}
}
