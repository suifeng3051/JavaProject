package learn.basic.initAndClear;

public class TestConstruct {
	public static void main(String[] args) {
		/**测试构造器初始化*/
		//Counter counter=new Counter();
		//System.out.println(counter.i);
		/**测试初始化的顺序：先进行成员变量初始化，再进行构造器初始化**/
		//Card t=new Card();
		//t.f();
		/**测试静态变量及其它类型变量的创建过程：
		 * 1.用到某类时 ，先创建类的静态变量，在创建类的非静态变量，在执行构造方法，在执行方法
		 * */
		System.out.println("create new cupboard in main" +new Cupboard());
		System.out.println("create new cupboard in main" +new Cupboard());
		t2.f2(1);
		t3.f3(1);
	}
	static Table t2=new Table();
	static Cupboard t3=new Cupboard();

}
