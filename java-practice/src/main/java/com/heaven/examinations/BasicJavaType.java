package com.heaven.examinations;

public class BasicJavaType {
	public static void main(String[] args) {
		//关于强制类型转换
		short s1=1;
		//s1=s1+1;//编译器会提示需强制类型转换
		s1+=1;//这么写编译器不会提示
		//char 类型几个字节
		char myname='厚';//两个字节 byte
		String mynamestr="厚";//三个字节
		byte[] mynameb=mynamestr.getBytes();
		System.out.println(mynameb.length);
		
	}

}
