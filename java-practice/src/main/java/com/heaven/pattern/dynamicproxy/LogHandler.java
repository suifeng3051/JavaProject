package com.heaven.pattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by whd@zizizizizi.com on 2016/5/25.
 */
/**
 * 日志打印handler，打印调用代理对象的方法及其参数值
 * **/
public class LogHandler implements InvocationHandler{
	private Object proxied;
	LogHandler(Object proxied){
		this.proxied=proxied;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("begin to invoke method:"+method.getName()+" params:"+ Arrays.toString(args));
		Object result=method.invoke(proxied,args);
		System.out.println("invoke "+method.getName()+" end");
		return result;
	}
}
