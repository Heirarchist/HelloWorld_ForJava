import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scanfiles {
						//Throws away file not found
	public static void main(String[] args) throws FileNotFoundException {
		String filename = "C:/Programming/example.txt";
		//forward slashes needed
		
		File textfile = new File(filename);
		Scanner in = new Scanner(textfile);
		
		int value = in.nextInt();
		System.out.println("Read value: " + value);
		//read integers
		
		while(in.hasNextLine()) {
			//While file has another line, read it
			String line = in.nextLine();
			//string = the next line
			System.out.println(line);
		}
		in.close();
		//Closes scanner
	}
}