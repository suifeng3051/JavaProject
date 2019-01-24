package learn.basic.initAndClear;

public class Beetle extends Insect {
	int k = prt("Beetle.k initialized");

	Beetle() {
		prt("k = " + k);
	}

	static int x2 = prt("static Beetle.x2 initialized");

	static int prt(String s) {
		System.out.println(s);
		return 63;
	}

}
