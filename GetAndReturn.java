class Person {
	String name;
	int age;

	void speak() {
		System.out.println("Identity: " + name);
	}

	// use int so you can return
	int calculateLifeLeft() {
		int yearsLeft = 49 - age;
		// yearsLeft is 42 minus the age

		return yearsLeft;
	}

	int getAge() {
		return age;
	}

	// Get method
	String getName() {
		return name;
	}
}

public class GetReturn {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Sentry Sam";
		person1.age = 21;
		// person1.speak();----commented out

		int years = person1.calculateLifeLeft();
		// In this case, it sets calculate to return
		System.out.println("Years until demise: " + years);

		int age = person1.getAge();
		String name = person1.getName();

		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		// name and age are being returnded here
	}
}