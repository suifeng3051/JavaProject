package learn.basic.initAndClear;

public class FinalArguments {

	void with(final Value g) {
		// ! g = new Value(); // Illegal --g is final
		g.print("123");
	}

	void without(Value g) {
		g = new Value(); // OK --g not final
		g.print("456");
	}

	// void f(final int i) { i++; } // Can't change
	// You can only read from a final primitive:
	int g(final int i) {
		return i + 1;
	}

	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
		Value v=new Value();
		bf.without(v);
		bf.with(v);
	}

}
