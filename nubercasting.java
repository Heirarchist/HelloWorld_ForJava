public class castnumval {
	public static void main(String[] args) {
		int intValue = 123;
		short shortValue = 10;
		byte byteValue = 127;
		float floatValue = 8834.8f;//needs an f at the end
		double doubleValue = 123.45;
		long longValue = 55555;
		
		System.out.println(Byte.MAX_VALUE);//shows max value for number stuffs above
		
		intValue = (int)longValue;
		//casting right here, override, 'user knows best'
		System.out.println(intValue);
		
		doubleValue = intValue;
		//less potential to go wrong in this state
		System.out.println(doubleValue);
		intValue = (int)floatValue;
		System.out.println(intValue);
		//Does not round when converting, merely chops off what cannot be used
		
		byteValue = (byte)128;
		System.out.println(byteValue);
		//looped to negative, minimum value
		//Will not work as expected
	}
}