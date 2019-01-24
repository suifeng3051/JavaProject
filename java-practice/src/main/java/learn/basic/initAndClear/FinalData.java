package learn.basic.initAndClear;

public class FinalData {
	// final int i; no initializer final修饰的变量必须初始化
	// final Value v4; // Pre-Java 1.1 Error:
	// 编译器常数 Can be compile-time constants
	final int i1 = 9;
	static final int I2 = 99;
	// 通常常数值表示方式 Typical public constant:
	public static final int I3 = 39;
	// 非编译期常数 Cannot be compile -time constants:
	final int i4 = (int) (Math.random() * 20);
	static final int i5 = (int) (Math.random() * 20);
	// 对象句柄示例
	Value v1 = new Value();
	final Value v2 = new Value();
	static final Value v3 = new Value();
	// 数组 Arrays:
	final int[] a = { 1, 2, 3, 4, 5, 6 };

	public void print(String id) {
		System.out.println(id + ": " + "i4 =" + i4 + ", i5 = " + i5);
	}

	public static void main(String[] args) {
		FinalData fd1 = new FinalData();
		// ! fd1.i1++; //final类型变量不能改变其值 Error: can't change value
		fd1.v2.i++; // 对象句柄是常量，但对象本身不是 Object isn't constant!
		fd1.v1 = new Value(); // OK --not final
		for (int i = 0; i < fd1.a.length; i++)
			fd1.a[i]++; // 数组也一样，数组句柄不可改变，但数组内容可以改变 Object isn't constant!
		// ! fd1.v2 = new Value(); // Error: Can't
		// ! fd1.v3 = new Value(); // change handle
		// ! fd1.a = new int[3];
		fd1.print("fd1");
		System.out.println("Creating new FinalData");
		FinalData fd2 = new FinalData();
		fd1.print("fd1");
		fd2.print("fd2");
	}
}
