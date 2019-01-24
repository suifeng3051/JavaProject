package learn.basic.initAndClear;

public class TestInitializeSequence {
	static Sample sam=new Sample("静态sam变量开始初始化");
	static{
		System.out.println("静态代码块开始初始化");
	}
	int i=10;
	int j;
	TestInitializeSequence(){
		System.out.println("构造函数开始执行");
		System.out.println("i="+i+" j="+j);
		j=20;
	}
	public static void main(String[] args) {
		TestInitializeSequence ti=new TestInitializeSequence();
	}

}
