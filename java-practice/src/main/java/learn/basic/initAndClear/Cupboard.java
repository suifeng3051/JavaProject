package learn.basic.initAndClear;

public class Cupboard {
	Bow1 b3=new Bow1(3);
	static Bow1 b4=new Bow1(4);
	Cupboard(){
		System.out.println("Cupboard()");
		b4.f(2);
	}
	void f3(int maker){
		System.out.println("f3"+maker);
	}
	static Bow1 b5=new Bow1(5);
}
