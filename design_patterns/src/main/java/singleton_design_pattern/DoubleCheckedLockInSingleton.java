package singleton_design_pattern;

public class DoubleCheckedLockInSingleton {

	// If we dont use volatile keyword, then other threads are able to see the half
	// instantiated state of object. volatile keyword guarantees the happens-before relationship
	// i.e All the write operation on 'object' will happen-before any read operation is done on it.
	private volatile static DoubleCheckedLockInSingleton object;
	
	// Private Contructor prevents object instantiation of this class
	private DoubleCheckedLockInSingleton() {
	}
	
	// Here, we perform double check locking
	public static DoubleCheckedLockInSingleton getInstance() {
		if (object == null) {
			
			// synchronized block, prevents race condition between multiple threads
			synchronized (DoubleCheckedLockInSingleton.class) {
				if (object == null) {
					object = new DoubleCheckedLockInSingleton();
				}
			}
		}
		return object;
	}
	
	
	public static void main(String[] args) {
	}
}
