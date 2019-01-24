package com.heaven.pattern.dynamicproxy;

/**
 * Created by whd@zizizizizi.com on 2016/5/25.
 */
public class RealSubjectA implements SubjectA {
	public void setUser(String name,String password){
		System.out.println("-------------set user,name:"+name+" password:"+password+"-------------");
	}
}
