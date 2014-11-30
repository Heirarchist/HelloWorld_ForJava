class Thing {
	public final static int LUCKYNUMBER = 7;
	// final is constant
	public String name;
	public static String description;
	// static belongs only to one class

	public static int count = 0;
	// only one copy of item(count), shared between all objects

	public int id;

	public Thing() {
		id = count;
		count++;
		// makes count the object id
	}

	public void showName() {
		System.out.println("Object id: " + id + " " + description + " " + name);
	}

	public static void showInfo() {
		System.out.println(description);
	}
}
public class staticfinal {

	public static void main(String[] args) {

		Thing.description = "Test";

		Thing.showInfo();

		System.out.println("Before creation, count is: " + Thing.count);

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		System.out.println("After creation, count is: " + Thing.count);

		thing1.name = "Alpha";
		thing2.name = "Beta";

		System.out.println(thing1.name);
		System.out.println(thing2.name);

		thing1.showName();
		thing2.showName();

		System.out.println(Math.PI);
		// accessing data via class Math- static
		System.out.println(Thing.LUCKYNUMBER);
	}
}