package factory_design_pattern;

/**
 * This is a Factory Method implementation class
 * Based on the string we return a instance back to client
 * @author Aniket Bharsakale
 */
public class OperatingSystemFactoryMethod {

	public IOperatingSystem getInstanceOfOperatingSystem(String str) {
		if(str.equalsIgnoreCase("CommonMan") ) {
			return new WindowsOS_Impl();
		} else if(str.equalsIgnoreCase("RichMan")) {
			return new IOS_Impl();
		} else if(str.equalsIgnoreCase("SecureMan")) {
			return new LinuxOS_Impl();
		}  
		
		return null;
	}
}
