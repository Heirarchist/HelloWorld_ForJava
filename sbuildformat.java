public class sbuildformat {
	public static void main(String[] args) {

		String info = "";
		info += "This is Delta.";
		info += " ";
		info += "Delta is an inexperienced builder. ";
		System.out.println(info);
		//Taking info(empty string) and reassigning it to new text, building upon the last text
		//Inefficient

		StringBuilder sb = new StringBuilder("");
		
		sb.append("This is Gamma.");
		sb.append(" ");
		sb.append("Gamma is a real builder");
		System.out.println(sb.toString());
		//Efficient
		
		StringBuilder s = new StringBuilder();
		
		s.append("This is Alpha.")
		.append(" ")
		.append("Alpha is a chain builder");
		System.out.println(s.toString());
		
		///////////Divider/////////////////
		
		System.out.println("This is some text.\tThat was a new tab.\nThat was a new line.");
		System.out.printf("Total cost %10d, quantity is %d\n", 5, 100);
		//d- number
		//%10d- output in a field 10 characters wide
		//printf- format
		
		for(int i=0; i<20; i++) {
			System.out.printf("%2d: %s\n", i, "Text");
			//%s for string
		}
		
		System.out.printf("Total value: %.2f\n", 5.6126);
		//%.2f- floating point, 2 decimal points
		//rounds off
	}
}