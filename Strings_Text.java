public class Strings01 {
//Non-Primitive String types-Text
	public static void main(String[] args) {
		
		int myInt = 10;
		//Primitive version
		String text = "Da Harro";
		//New version, upper case first letter for class reasons, quote marks for words
		String blank = " ";
		String name = "Nasser";
		String greeting = text + blank + name;
		//Added all three strings together
		
		System.out.println(myInt);
		System.out.println(text);
		System.out.println(blank);
		System.out.println(name);
		System.out.println(greeting);
		System.out.println("My integer is: " + myInt);
	}
}