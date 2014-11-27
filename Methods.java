class Person {
	String name;
	int age;

	// data of the person

	void speak() {
		System.out.println("Enemy name: " + name + "\t" + "Enemy age: " + age);
		System.out.println("I will destroy you!");
	}
	// Method for an object to do
}

public class Methods {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Scourge of Worlds";
		person1.age = 2000;
		person1.speak();
		// Method in action, method from another class needs ();

		Person person2 = new Person();
		person2.name = "Helpless Civillian";
		person2.age = 25;
	}
}