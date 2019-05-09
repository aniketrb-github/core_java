package string_class;
/**
 * Tell the output for following all sysout's done in Main method 
 * String equality checker
 * @author abharsa
 */
public class StringEquality {
	static String func(String s) {
		if (s == "hello")
			return "yes";
		else
			return "no";
	}

	public static void main(String[] args) {
		System.out.println(func("s"));
		
		System.out.println(func("hello"));
		
		System.out.println(func("Hello"));
		
		System.out.println(func(null));
		
		// System.out.println(func(1));
		
		foo();
		
		bar();
	}
	
	
	static void foo () {
		String s1 = new String("HELLO"); 
        String s2 = new String("HELLO"); 
        System.out.println("s1 == s2 : "+(s1 == s2)); // here, address comparison is done for reference's : s1 & s2
        System.out.println("s1.equals(s2) : "+s1.equals(s2)); 	// here, content comparison is done
	}
	
	static void bar() {
		// integer-type
		System.out.println("10 == 20 : "+(10 == 20));

		// char-type
		System.out.println("'a' == 'b' : "+('a' == 'b'));

		// char and double type
		System.out.println("'a' == 97.0 : "+('a' == 97.0));

		// boolean type
		System.out.println("true == true : "+(true == true));
	}
}
