package singleton_design_pattern;
/**
 * Singleton Design Pattern implementation
 * @author Ainket Bharsakale
 */
public class Singleton {
	public static void main(String[] args) {
		SingletonClass theSingleObject = SingletonClass.getReferenceToSingletonObject();
		System.out.println("Singleton Object 1: "+theSingleObject.hashCode());
		SingletonClass anotherObjectReference = SingletonClass.getReferenceToSingletonObject();
		System.out.println("Singleton Object 2: "+anotherObjectReference.hashCode());
		
		RegularClass object1 = new RegularClass();
		System.out.println("\nNonSingletonObject 1 :"+object1.hashCode());
		RegularClass object2 = new RegularClass();
		System.out.println("NonSingletonObject 2 :"+object2.hashCode());
	}
}

/**
 * We are making this class as Singleton
 * @author Aniket Bharsakale
 */
class SingletonClass {
	
	  // static object creation reasong being only one copy of object will be created
	  static SingletonClass mySingleObject = new SingletonClass();
	  
	  // private ctor. so as to restrict other classes from creating multiple objects of this class
	  private SingletonClass() { }
	  
	  // static getter method due to static object public SingletonClass
	  public static SingletonClass getReferenceToSingletonObject() {
		  return mySingleObject;
	  }
}

class RegularClass {
	
	// public ctor.
	public RegularClass() {	}

	// non-static public getter method which returns an instance of this class
	public RegularClass getReferenceToObject() {
		return new RegularClass();
	}
	
}