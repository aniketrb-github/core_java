package singleton_design_pattern;

/**
 * Can we clone a singleton object? Yes, why not. But whats the use?
 * If u clone it, u violate the Singleton design pattern principle by creating another instance.
 * This program demonstrates the prevention of cloning a existing Singleton instance.
 * 
 * 
 * @author Aniket Bharsakale
 */
public class BreakingSingletonViaCloing {

	public static void main(String[] args) {
		SingletonOne singleObj1 = SingletonOne.getReferenceToSingletonObject();
		SingletonOne singleObj2 = SingletonOne.getReferenceToSingletonObject();
		
		System.out.println("HashCode of 1st First object: "+singleObj1.hashCode());
		System.out.println("HashCode of 1st Second object: "+singleObj2.hashCode());
	}
}

/**
 * The Singleton class
 * @author Aniket Bharsakale
 */
class SingletonOne implements Cloneable {

	// static reference
	private static SingletonOne mySingleObject = null;

	// public ctor. for cloning demonstration
	private SingletonOne() {}

	// static block executes once only while class loading
	static {
		mySingleObject = new SingletonOne();
	}

	// static getter method due to static object
	public static SingletonOne getReferenceToSingletonObject() {
		return mySingleObject;
	}

	/*
	// THIS BREAKS THE SINGLETON DESIGN PATTERN PRINCIPLE
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// here you clone the existing singleton object by invoking the actual clone() of the Object class
		return super.clone();
	}
	*/
	
	// This breaks the Singleton design pattern idea
	@Override
	public Object clone() throws CloneNotSupportedException {
		return getReferenceToSingletonObject();
	}
}