package com.heaven.pattern.factory;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author HeavenWang
 *
 */
public class TestCalculator01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入A:");
		String a=sc.next();
		System.out.println("请输入操作符：");
		char operation=sc.next().toCharArray()[0];
		System.out.println("请输入B:");
		String b=sc.next();
		//操作类工厂根据操作符来获得相应的操作类
		/**此处用到了：
		 * 1.工厂模式
		 * 2.抽象:把加减乘除操作抽象成操作类
		 * 3.继承：操作类为父类，子类为具体操作实现
		 * 4.多态：父类引用可以指向一个子类实例
		*/
		Operation oa=OperatorFactory.getOperator(operation) ;
		oa.operatorA=new BigDecimal(a);
		oa.operatorB=new BigDecimal(b);
		BigDecimal result=oa.getResult();
		System.out.println(a+operation+b+" ="+result);
	}

}
