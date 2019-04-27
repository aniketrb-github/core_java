package double_check_locking_concept;

public class Singleton {

	// If we dont use volatile keyword, then other threads are able to see the half
	// instantiated state of object. volatile keyword guarantees the happens-before relationship
	// i.e All the write operation on 'object' will happen-before any read operation is done on it.
	private volatile static Singleton object;
	
	// Private Contructor prevents object instantiation of this class
	private Singleton() {
	}
	
	// Here, we perform double check locking
	public static Singleton getInstance() {
		if (object == null) {
			
			// synchronized block, prevents race condition between multiple threads
			synchronized (Singleton.class) {
				if (object == null) {
					object = new Singleton();
				}
			}
		}
		return object;
	}
	
	
	public static void main(String[] args) {
	}
}
