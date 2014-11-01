public class StringArrays {

	public static void main(String[] args) {

		String[] words = new String[3];
		// string array equals 3 new string elements
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		// ^3 new elements are these
		System.out.println(words[2]);
		// prints which word element specified

		String[] fruits = { "apple", "banana", "pear", "kiwi" };

		for (String fruit : fruits) {
			// sets variable fruit to all the fruits in array fruits
			System.out.println(fruit);
		}

		int value = 0;

		String text = null;
		// null=nothing
		System.out.println(text);

		String[] texts = new String[2];
		System.out.println(texts[0]);

		texts[0] = "one";
		// applies string reference 0 to "one"
	}
}