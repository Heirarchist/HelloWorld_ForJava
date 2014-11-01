import java.util.Scanner;
//ctrl+shift+o adds this
public class Switch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a command: ");
		String text = input.nextLine();

		switch(text) {
		//allows you to take different actions depending on the value of a variable, more efficient than if
		case "start":
			//pretty much "in the case of"
			System.out.println("Machine started");
			break;
			
		case "stop":
			System.out.println("Machine stopped");
			break;
		
			default:
				//case type, done when no other cases are activated
				System.out.println("Command not recognized");
		}
	}
}