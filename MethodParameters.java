//Parameter is a variable you pass into a method
class Robot {
	public void speak(String text) {
		// String text receives the data from below, at alpha.speak
		System.out.println(text);
	}

	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}
	
	public void move(String direction, double distance){
		System.out.println("Moving " + distance + " meters in direction: " + direction);
	}
}

public class Parameter {

	public static void main(String[] args) {

		Robot alpha = new Robot();

		alpha.speak("Alpha activated");
		// --(); here is like the top of a tunnel, the bottom is... up at the top, where the void is declared
		alpha.jump(2);
		alpha.move("North", 115.5);
	}
}