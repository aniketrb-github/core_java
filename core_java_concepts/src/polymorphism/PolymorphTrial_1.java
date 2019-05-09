package polymorphism;
/**
 * Interview qun. for polymorphism to trace the output with dry run
 * @author aniket bharsakale
 */
public class PolymorphTrial_1 {

	public static void main(String[] args) {
		D.f2(); // calculate the result by dry-run : what will be printed?
	}
}

class B {
	private int i;

	public B(int i) {
		this.i = i;
	}

	public int getInt() {
		return i;
	}
}

class C {
	public B b;

	C(int i) {
	}

	public B getB() {
		return b;
	}
}

class D {
	public static String f1(B b) {
		return "f1-B";
	}

	public static String f1(int b) {
		return "f1-int";
	}

	public static String f2() {
		C c = new C(42);
		return D.f1(c.getB());
	}
}