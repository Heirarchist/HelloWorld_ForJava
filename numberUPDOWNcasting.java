class Machine {
	public void Start() {
		System.out.println("Machine started.");
	}
}
class Camera extends Machine {
	public void Start() {
		System.out.println("Camera started.");
	}
	public void Snap() {
		System.out.println("Picture taken.");
	}
}
public class updowncast {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.Start();
		camera1.Start();
		camera1.Snap();
		
		//Upcasting
		Machine machine2 = camera1;
		machine2.Start();
		//Started camera, as machine2 is camera1
		/*machine2.Snap();
		Can't be done, Machine variable, even with type camera, cannot call on undefined machine class*/
		
		//Downcasting
		Machine machine3 = new Camera();
		Camera camera2 = (Camera)machine3;
		//Java needs confirmation, as this is a risky-ish move
		camera2.Start();
		camera2.Snap();
		
		//Future/runtime error
		/*
		Machine machine4 = new Machine();
		Camera camera3 = (Camera)machine4;
		camera3.Start();
		camera3.Snap();
		*/
	}
}