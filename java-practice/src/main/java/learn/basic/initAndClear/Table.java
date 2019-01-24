package learn.basic.initAndClear;

public class Table {
	static Bow1 b1=new Bow1(1);
	Table(){
		System.out.println("Table()");
		b2.f(1);
	}
	void f2(int maker){
		System.out.println("f2"+maker);
	}
	static Bow1 b2=new Bow1(2);
}
