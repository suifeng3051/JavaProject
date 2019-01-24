package com.heaven.base.zaishenglei;

public class FinalData {
	final int i1=9;
	static final int i2=99;
	public static final int i3=39;
	final int i4=(int)(Math.random()*20);
	static final int i5=(int)(Math.random()*20);
	Value v1=new Value();
	final Value v2=new Value();
	static final Value v3=new Value();
	final int a[]={1,2,3,4,5,6};
	public void print(String id){
		System.out.println(id+":"+"i4="+i4+",i5="+i5);
	}
	public static void main(String[] args) {
		FinalData fd1=new FinalData();
		//fd1.i1++; 会编译错误，提示final数据不能修改
		fd1.v2.i++;
		fd1.v1=new Value();
		for(int i=0;i<fd1.a.length;i++){
			fd1.a[i]++;
			//fd1.v2=new Value();
			//fd1.v3=new Value();
			//fd1.a=new int[3];
		}
	}

}
