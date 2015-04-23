import java.util.*;

public class helloworld {

	public static void main(String []args){
        //System.out.println("Hello World");
		System.out.println("Answer: " + triangleNum(500));
     }
	
	public static int triangleNum (int num) {
		
		int index = 1;
		int sum = 1;
		
		
		while (factors(sum) < num) {
			index++;
			sum+= index;
		}
		return sum;
		
	}
	
	public static int factors (int val) {
		int factors = 0;
		for (int i = 1; i <= Math.sqrt(val); i++) {
			if (val % i == 0) {
				factors +=2;
			}
		}
		if (val % (int)Math.sqrt(val) == 0) {
			factors--;
		}
		return factors;
	}
	
}
