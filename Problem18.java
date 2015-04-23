import java.util.*;
import java.io.File;
import java.io.IOException;


public class helloworld {
	
	public static void main(String []args)
		throws IOException {
        //System.out.println("Hello World");
		
		Scanner s = new Scanner(new File("MaxPath.txt"));
		
		MaxPath(s);
		
		System.out.println("Answer: " + MaxPath(s));

     }
	
	public static int MaxPath(Scanner s) {
		
		int[][] results = new int[15][15];
		int rows = 0;
		
		
		while (s.hasNextLine()) {
			String line = s.nextLine();
			String[] numbers = line.split("\\s+");
			System.out.println(numbers.length);
			for (int i = 0; i < numbers.length; i++) {
				//System.out.println(numbers[i]);
				results[rows][i] = Integer.parseInt(numbers[i]);
				System.out.print(results[rows][i] + " ");
				
			}
			System.out.println(" ");
			rows++;
		}
		System.out.println(rows);
		rows--;
		for (int row = 13; row >= 0; row--) {
			for (int col = 0; col < rows; col++) {
				results[row][col] += Math.max(results[row + 1][col], results[row + 1][col + 1]);
				System.out.print(results[row][col] + " ");
			}
			System.out.println(" ");
			rows--;
		}
		return results[0][0];
	}
	
	
	
	
}
