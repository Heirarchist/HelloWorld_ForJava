import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.println("Enter a number: ");
		
		int value = scanner.nextInt();
		//Value is what user enters
		
		while(value != 5){
			//while value is not equal to five, perform action
			System.out.println("Enter a number again: ");
			value = scanner.nextInt();
			//int not needed, as it is already declared
		}
		*/
		//^ Comment tags used to deactivate
		
		//Duplicated codes, inefficient
		
		int value = 0;
		//value must be declared here, as the scanner value is effective only inside the brackets, as it is in the brackets
		do {
		//doWhile
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		while(value != 5);
		
		System.out.println("Got 5!");
	}

}