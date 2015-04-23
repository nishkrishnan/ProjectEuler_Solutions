import java.util.*;
import java.io.File;
import java.io.IOException;


public class helloworld {
	
	public static void main(String []args)
		throws IOException {
        //System.out.println("Hello World");
		
		Scanner s = new Scanner(new File("ProductGrid.txt"));
		
		System.out.println("Answer: " + Grid(s));

     }
	
	public static int Grid(Scanner s) {
		int[][] GridArray = new int[20][20];
		int row = 0;
		int max = 0;
		int counter = 0;
		int horizProduct = 1;
		int vertProduct = 1;
		int oneDiagProduct = 1;
		int twoDiagProduct = 1;
		
		
		while (s.hasNextLine()) {
			String line = s.nextLine();
			String numbers[] = line.split("\\s+");
			//System.out.println(numbers.length);
			
			for (int col = 0; col <numbers.length; col++) {
				GridArray[row][col] = Integer.parseInt(numbers[col]);
				System.out.print(GridArray[row][col] + " ");
			}
			System.out.println(" ");
			row++;
		}
		System.out.println("Next");
		
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				//System.out.println (j + " ");
				for (int k = j; k < j + 4 && k != 19; k++) {
					
					horizProduct *= GridArray[i][k];
					vertProduct *= GridArray[k][i];
					counter++;
					
				}
				if (counter == 4) {
					if (horizProduct > max) {
						System.out.println("Horizontal:" + horizProduct + " Values: " + GridArray[i][j]);
						max = horizProduct;
					}
					if (vertProduct > max) {
						max = vertProduct;
						System.out.println("Vertical:" + vertProduct + " Values: " + GridArray[j][i]);
					}
				}
				counter = 0;
				horizProduct = 1;
				vertProduct = 1;
				
				//System.out.print(GridArray[i][j] + " ");
				
				
			}
			System.out.println(" ");
		}
		System.out.println("Next");
		
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				for (int k = j; k < j + 4 && k < 20; k++) {
					if (i + counter > 19) {
						break;
					}
					oneDiagProduct *= GridArray[i + counter][k];
					//System.out.print(GridArray[i+counter][k] + " ");
					//twoDiagProduct *= GridArray[k][i + counter];
					counter++;
					
				}
				if (counter == 4) {
					if (oneDiagProduct > max) {
						max = oneDiagProduct;
						System.out.println("Onediag:" + oneDiagProduct  + " Values: " + GridArray[j][i]);
					}
				}
				counter = 0;
				for (int k = j; k >= j - 3 && k >= 0; k--) {
					if (i + counter > 19) {
						break;
					}
					twoDiagProduct *= GridArray[i + counter][k];
					//System.out.print(GridArray[i+counter][k] + " ");
					//twoDiagProduct++;
					counter++;
				}
				
				
				if (counter == 4) {
					
					if (twoDiagProduct > max) {
						max = twoDiagProduct;
						System.out.println("TwoDiag:" + twoDiagProduct  + " Values: " + GridArray[j][i]);
					}
				}
				counter = 0;
				oneDiagProduct = 1;
				twoDiagProduct = 1;
				//System.out.println(" ");
				
			}
		}
		
		return max;
		
		
		
	}
	
	
	
}
