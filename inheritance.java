public class Machine {
	
	private String name = "Machine type 1";
	
	public void start() {
		System.out.println("Machine Started.");
	}
	
	public void stop() {
		System.out.println("Machine Stopped");
	}
}
/////////////Separate page//////////////
public class Car extends Machine {

	@Override
	//@Override used to override an already specified method
	public void start() {
		System.out.println("Car Started.");
	}

	public void wipeWindow() {
		System.out.println("Wiping Window.");
	}
	
}
///////////////Separate page//////////////////////
public class inheritance {
	public static void main(String[] args) {
		Machine Alpha = new Machine();
		
		Alpha.start();
		Alpha.stop();
		
		Car car1 = new Car();
		car1.start();
		car1.wipeWindow();
		car1.stop();
	}
}