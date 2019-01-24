package learn.basic.initAndClear;

public class Animal {
	private static int age=10;
	static {
		System.out.println("Animal静态代码块开始执行！");
	}
	{
		System.out.println("Animal实例代码块开始执行！");
	}
	Animal(){
		System.out.println("Animal构造函数开始执行");
	}

}
