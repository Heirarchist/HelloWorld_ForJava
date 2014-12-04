public class interfaces {

	public static void main(String[] args) {

		Machine Alpha = new Machine();
		Alpha.start();
		
		Person person1 = new Person("Gamma");
		person1.speak();
		
		Info info1 = new Machine();
		//can be done due to implement
		//only done to implement machine methods from interface
		info1.showInfo();
		Info info2 = person1;
		info2.showInfo();
		
		outputInfo(Alpha);
		outputInfo(person1);
	}
	private static void outputInfo(Info info) {
		info.showInfo();
	}
}
//////////Page 2/////////////////

public class Machine implements Info{
	
	private int id = 7;
	
	public void start() {
		System.out.println("Machine Started.");
	}

	@Override
	public void showInfo() {
		System.out.println("Machine id is: " + id);
	}
}
/////////////////////page 3///////////////////

public class Person implements Info{
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("Hello.");
	}

	@Override
	public void showInfo() {
		System.out.println("Human name is : " + name);
	}

}

/////////////Page 4//////////////////

public interface Info {
	public void showInfo();
}