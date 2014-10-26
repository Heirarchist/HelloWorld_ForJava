public class WhileLoops {

	public static void main(String[] args) {
		int value = 0;
		boolean loop = value < 10;
		// Used to see if text is true, probably to end or continue a loop later on(Assumption)
		
		while(value < 10)
		{
			System.out.println("Da Harro "+ value);
			//^while the value is true, loop will continue, which is displayed by the print line 
			
			value = value + 1;
			// Takes the value, adds one, and stores it. Loop will end
			//Loop ends when value is no longer true
		}
		System.out.println(loop);
	}
}