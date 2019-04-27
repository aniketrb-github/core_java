package core_java_basics;
/**
 * Java Concept: Dynamic Method Dispatch(DMD) This comes under the section of
 * Polymorphism DMD is a Runtime Polymorph concept i.e Late-Binding Dynamic
 * Binding
 * 
 * @author Aniket Bharsakale
 */
public class DynamicMethodDispatch {
	public static void main(String a[]) {

		Animal animal = new Animal();
		animal.sleep();
		animal.eat();

		Dog dog = new Dog();
		dog.sleep();
		dog.bark();

		Animal ani = new Dog();
		ani.eat();
		ani.sleep(); 
		// dynamic method dispatch is done here
		// ani is reference of parent class which points to the object of Child class

		/*
		 * When an overridden method is called by a reference, java determines which
		 * version of that method to execute based on the type of object it refers to.
		 * In simple words the type of object which it referred determines which version
		 * of overridden method will be called.
		 */
	}
}

class Animal {
	void sleep() {
		System.out.println("Animal Sleeping");
	}

	void eat() {
		System.out.println("Animal Eating");
	}
}

class Dog extends Animal {
	@Override
	void sleep() {
		System.out.println("Dog sleeping");
	}

	void bark() {
		System.out.println("Dog barking");
	}

}