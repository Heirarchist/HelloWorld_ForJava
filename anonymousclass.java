//way of extending an existing class or implementing an interface in a one time shot
class Machine {
	public void Start() {
		System.out.println("Machine started.");
	}
}
interface Plant {
	public void Grow();
}//Does not make Plant
public class anonym {
	public static void main(String[] args) {
		Machine machine1 = new Machine() {
			@Override public void Start() {
				System.out.println("Car Started");
				//Override, child class of machine, anonymous
			}
		};
		machine1.Start();
		Plant plant1 = new Plant(){

			public void Grow() {
				System.out.println("Plant growing.");
				//Needs a method to work
			}
			//This anonymously is the plant class
		};
		plant1.Grow();
	}
}