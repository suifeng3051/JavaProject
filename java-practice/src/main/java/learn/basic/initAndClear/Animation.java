package learn.basic.initAndClear;

public class Animation {
	static int x=prt("static Animation.x is initialized!");
	int i;
	int j=20;
	static int k;
	Animation(){
		System.out.println("i="+i+"  j="+j+"  k="+k);
		j=40;
	}
	static int prt(String s){
		System.out.println(s);
		return 10;
	}

}
