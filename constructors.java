//constructor is a special method that runs when you create an instance in a class
//no return type
//same name as class
class Machine {
	private String name;
	private int code;
//private hides stuff from other... stuff
	public Machine() {
		this("Alpha", 1);
		//Calls another constructor
		System.out.println("Constructor running.");
	}
	
	public Machine(String name) {
		this.name = name;
		System.out.println("Constructor 2 running.");
	}
	
	public Machine(String name, int code) {
		
		this.name = name;
		this.code = code;
		System.out.println("Constructor 3 running.");
	}
}
public class constructors {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		new Machine();
		//no name needed, constructor assigns data
		
		Machine machine2 = new Machine("Beta");
		//runs second constructor because of string
		
		Machine machine3 = new Machine("Gamma", 3);
		//Meets requirements for constructor 3
	}
}