public class MultiDim {

	//A Multi-Dimensional Array is an array of arrays
	public static void main(String[] args) {
	
		int[][] grid = {
		//2 brackets- 2 dimensions
				{3, 5, 100},
				//Row 0
				//3 would be index 0, and so on
				{2, 4}
				//Row 1
		};
		
		System.out.println(grid[0][2]);
		System.out.println(grid[1][1]);
		//array set= row one, index one
		
		//////////////////////////Divider///////////////////////////////
		
		String[][] texts = new String[2][3];
		//2 rows and 3 columns of strings
		
		texts[0][1] = "I am the scourge of worlds.";
		//dedicates an array value to say something
		
		System.out.println(texts[0][1]);
		
		
		for(int row=0; row<grid.length; row++) {
			for(int col=0; col < grid[row].length; col++){
				System.out.print(grid[row][col] + "\t");
				//print prints items on one line, println prints stuff on separate lines, /t puts new tab
			}
			System.out.println();
		}
	}
}