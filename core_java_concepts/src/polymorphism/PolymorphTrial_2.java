package polymorphism;

/**
 * Interview qun. for polymorphism to trace the output with dry run
 * @author aniket bharsakale
 */
public class PolymorphTrial_2 {

	public static void main(String[] args) {
		foo(5); // do dry run & trace the output: what will be printed?
		foo(15);
	}

	static void foo(int n) {
		if (n > 10)
			System.out.println("A");
			if (n > 20)
				System.out.println("A");
		else
			System.out.println("B");

	}
}
