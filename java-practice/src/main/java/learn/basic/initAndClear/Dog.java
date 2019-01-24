package learn.basic.initAndClear;

public class Dog extends Animal{
	Dog(){
		System.out.println("Dog 构造函数开始执行!");
	}
	private static int age=30;
	{
		System.out.println("Dog 实例代码块开始执行");
	}
	static {
		System.out.println("Dog 静态代码块开始执行");
	}
	
}
