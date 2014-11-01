public class Arrays {
	
	public static void main(String[] args) {
		
		int value = 7;
		// NEW- allocates memory to hold integer
		int[] values;
		//[]- array
		//reference, reference variable
		values = new int[3];
		
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		//says what the value is when you enter the number
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		for(int i=0; i<values.length; i++) {
			//size of an array can be found by referring to .length
			System.out.println(values[i]);
		}
		
		int[] numbers = {5, 6, 7};
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}