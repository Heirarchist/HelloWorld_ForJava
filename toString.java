// Create a string rep for your object for identification, useful for debugging
class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
	}
}
public class twostring {

	public static void main(String[] args) {

		Person person1 = new Person(1, "Alpha");
		Person person2 = new Person(2, "Beta");
		System.out.println(person1);
		System.out.println(person2);
	}
}