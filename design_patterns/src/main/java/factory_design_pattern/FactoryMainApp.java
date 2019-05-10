package factory_design_pattern;

public class FactoryMainApp {

	public static void main(String[] args) {

		// here we are not using the factory method as wel as the implementation class is visible to client
		/*
		IOperatingSystem operatingSystem = new WindowsOS_Impl();
		operatingSystem.specifications();
		
		operatingSystem = new LinuxOS_Impl();
		operatingSystem.specifications();
		
		operatingSystem = new IOS_Impl();
		operatingSystem.specifications();
		*/

		// Here we have implemented the factory Method pattern of Java
		// we provide a phrase & it returns an instance of the class
		// hence at front-end/client end we dont know the implementation class
		OperatingSystemFactoryMethod osFm = new OperatingSystemFactoryMethod();
		osFm.getInstanceOfOperatingSystem("RichMan").specifications();
		osFm.getInstanceOfOperatingSystem("CommonMan").specifications();
		osFm.getInstanceOfOperatingSystem("SecureMan").specifications();
		 
		
	}

}
