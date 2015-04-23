import java.util.*;

public class helloworld {

	public static void main(String []args){
        //System.out.println("Hello World");
		System.out.println("Answer: " + gridPath(20, 20));
     }
	
	public static long gridPath(int width, int length) {
		long[][] grid = new long[width + 1][length + 1];
		
		for (int i = 0; i <= width; i++) {
			for (int j = 0; j <= length; j++) {
				grid[i][j] = 1l;
			}
		}
		
		for (int i = width - 1; i >= 0; i--) {
			for (int j = length - 1; j >= 0; j--) {
				grid[i][j] = grid[i+1][j] + grid[i][j+1];
			}
		}
		return grid[0][0];
		
	}
	
	
}
