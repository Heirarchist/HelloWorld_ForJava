
public class polymorphism {

	public static void main(String[] args) {
		
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		plant2.grow();
		//Can do this because tree is a plant subclass
		tree.leavesFall();
		//Plant cannot have leaves fall, as that is only declared in the subclass
		Plant plant3;
		//limited, as it is not originally declared
		
		doGrow(tree);
		//Done because declared below
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}
	
}
//////////////////////////////////////////////////////////////////////////////////
public class Plant {
	public void grow() {
		System.out.println("Plant growing.");
	}
}
//////////////////////////////////////////////////////////////////////////////////
public class Tree extends Plant {

	@Override
	public void grow() {
		System.out.println("Tree growing.");
	}
	
	public void leavesFall() {
		System.out.println("Leaves falling.");
	}
	
}