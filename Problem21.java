import java.util.*;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;


public class helloworld {
	
	public static void main(String []args)
		throws IOException {
        //System.out.println("Hello World");
		
		System.out.println("Answer: "  + AmicableNumbers(10000));

     }
	
	public static int AmicableNumbers(int num) {
		int[] array = new int[num];
		Vector<Integer> v = new Vector<Integer>();
		int currentSum = 0;
		int otherSum = 0;
		int sum = 0;
		
		for (int i = 2; i < num; i++) {
		//int i = 220;
			currentSum = SumOfDivisors(i);
			if (currentSum >= num)
				continue;
			otherSum = SumOfDivisors(currentSum);
			
			/*v.add(i, new Integer(currentSum));
			if (v.elementAt(currentSum) == 0) {
				v.add(currentSum, new Integer(SumOfDivisors(currentSum)));
				
				
			}*/
			if (otherSum == i && i != currentSum) {
				System.out.println(i + " " + currentSum);
				sum += i;
			}
			
		}
		return sum;
	}
	
	public static int SumOfDivisors(int num) {
		int sum = 0;
		
		for (int i = num - 1; i > 0; i--) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	
		
	
	
	
}
