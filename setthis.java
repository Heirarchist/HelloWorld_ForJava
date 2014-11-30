class Frog {
	String name;
	int age;
	
	public void setName(String name) {
		this.name = name;
		//This name equals name
		//used to avoid ambiguity
	}
	// Sets variables
	//USED TO AVOID REFERING TO INSTANCE VARIABLES
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	//put public in front of it, you will not go wrong- not explained
	public int getAge() {
		return age;
	}
}

public class setthis {

	public static void main(String[] args) {

		Frog frog1 = new Frog();
		
		//frog1.name = "Scourge of Worlds";
		//frog1.age = 100;
		
		frog1.setName("Scourge of Worlds");
		frog1.setAge(50);
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
	}
}