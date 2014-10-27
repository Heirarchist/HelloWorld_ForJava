import java.util.Scanner;
// Need that for scanner(Think address, this is city for street)
public class UI {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// New scanner input(in=input)
		System.out.println("Enter a line of text: ");
		
		String line = input.nextLine();
		//This is where user inputs line
		//Input line in the console
		
		System.out.println("You entered: " + line);
		// Tells what they entered
		// You can replace line with values if you wish for numbers, but line does numbers
	}

}