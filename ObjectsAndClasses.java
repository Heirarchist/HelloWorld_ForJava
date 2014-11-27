	//Classes can contain Data(state), 
	//subroutines are methods
class Person {
	
	String name;
	int age;
	//Instance variables- data or state

}
//Multiple classes can be done, as seen here
//A class is a template for creating objects
//^ Person, in this case, is the object

public class ObjectClass {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		//variable that can refer to the Person object
		person1.name = "Scourge";
		person1.age = 30;
		
		Person person2 = new Person();
		//Object type, object = new Object
		person2.name = "Sally Sue";
		person2.age = 25;
		
		System.out.println(person1.name);
		
	}
	//inside the class is the subroutine
}