public class IfStatements {

	public static void main(String[] args) {
		
		boolean ncond = 5 != 2;
		// Not equal to
		boolean equal = 4 == 3;
		// Test for equality for different values
		int myInt = 20;
		
		System.out.println(ncond);
		System.out.println(equal);

		
		if(myInt < 100) {
			System.out.println("Yes, this is true");
		}
		else {
			System.out.println("No, this is false");
			// Happens when if is not true
		}
	////////////////////////////////////cosmetic divider////////////////////////////////////////////////////
		if(myInt < 10) {
			System.out.println("Yes, this is true");
		}
		else if(myInt > 20){
			// Alternative for if
			System.out.println( "Yep, this is also true");
		}
		else {
			System.out.println("None of the above");
			//In this case, this happens when no above conditions are true
		}

		int loop = 0;
		
		while(loop < 5) {
			System.out.println("Looping: " + loop);
			//Does as it sounds. While loop is true, output will be displayed(infinite, unless at one point this is false
			
			if(loop == 5) {
				break;
				//loop breaks when value = 5
				// All affiliated with loop ends
			}
			loop++;
			
			System.out.println("Running");
			// Displays while loop is active
		}
	}
}