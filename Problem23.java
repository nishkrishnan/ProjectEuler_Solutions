import java.util.*;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;


public class helloworld {
	
	public static boolean[]array = new boolean[28124];
	public static List<Integer> abundant = new ArrayList<Integer>();
	
	public static void main(String []args)
		throws IOException {
        //System.out.println("Hello World");
		
		
		System.out.println("Answer: " + SumNonAbundant());

     }
	public static int SumNonAbundant() {
		int sum = 0;
		Arrays.fill(array, false);
		abundant.add(12);
		GetAbundant(28123);
		
		for (int i = 1; i <= 28123; i++) {
			
			if (GetSum(i)) {
				System.out.println(i);
				sum+=i;
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
	
	public static void GetAbundant(int num) {
		
		for (int i = 13; i <= num ; i++) {
			int sum = SumOfDivisors(i);
			if ( sum > i) {
				System.out.println(i + " " + sum);				
				abundant.add(i);
				
			}
		}
		
	}
	
	public static boolean GetSum(int num) {
		int start = 0;
		int end = abundant.size() - 1;
		
		while (start < end) {
			if (abundant.get(start) == num) {
				return true;
			}
			else if (abundant.get(start)*2 == num) {
				return false;
			}
			else if (abundant.get(end)*2 == num) {
				return false;
			}
			else if (abundant.get(start) + abundant.get(end) == num) {
				return false;
			}
			else if (abundant.get(start) + abundant.get(end) < num) {
				start++;
			}
			else if (abundant.get(start) + abundant.get(end) > num) {
				end--;
			}
		}
		return true; 
	}
	
	
	
}
