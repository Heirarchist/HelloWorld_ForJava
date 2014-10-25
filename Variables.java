public class Tutorial02 {
//All primitive
	public static void main(String[] args) {
		int myNumber = 10;
		//Basic Number System, 32bit
		short myShort = 1;
		//Smaller numbers, 16bit, 32000 max
		long myLong = 100;
		//Longer numbers, 64bit
		double myDouble = 5.25;
		// For more precise numbers
		float myFloat = 500.125f;
		//Another version of double, requires an f or it will be translated as a double
		//^Doubles and ints will be common
		
		char myChar = 'N';
		//Displays a character
		boolean myBoolean = true;
		//Can hold true and false
		//^Basic characters
		
		byte myByte = 127;
		//8bit, 127 max
		//^Can be used for rows of data
		
		System.out.println(myShort);
		System.out.println(myNumber);
		System.out.println(myLong);
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myChar);
		System.out.println(myBoolean);
		System.out.println(myByte);
		// ^ Declares variables in console
	}

}
