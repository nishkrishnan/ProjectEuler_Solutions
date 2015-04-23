import java.util.*;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;


public class helloworld {
	
	public static void main(String []args)
		throws IOException {
        //System.out.println("Hello World");
		
		System.out.println("Answer: " + FactoralDigits(100));

     }
	
	public static int FactoralDigits(int num) {
		BigInteger result = new BigInteger("1");
		String answer;
		int sum = 0;
		
		for (int i = num; i > 0; i--) {
			BigInteger tmp = new BigInteger(Integer.toString(i));
			result = result.multiply(tmp);
		}
		
		answer = result.toString();
		System.out.println(answer);
		for (int i = 0; i < answer.length(); i++) {
			sum += Character.getNumericValue(answer.charAt(i));
		}
		return sum;
		
	}
		
	
	
	
}
