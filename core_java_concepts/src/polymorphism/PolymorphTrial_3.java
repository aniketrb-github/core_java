package polymorphism;

/**
 * Interview qun. for polymorphism to trace the output with dry run
 * @author aniket bharsakale
 */
public class PolymorphTrial_3 extends Base {

	// trace & do dry-run for the output : what will be printed?
	public static void main(String[] args) {
		D d = new D();
		System.out.println(d.f2());
	}

	public String f1() {
		return "f1t";
	}

	public String f2() {
		return super.f1();
	}
}

class Base {
	public String f1() {
		return "f1";
	}
}
