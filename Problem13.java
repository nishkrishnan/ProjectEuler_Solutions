import java.util.*;
import java.io.File;
import java.io.IOException;


public class helloworld {
	
	public static void main(String []args)
		throws IOException {
        //System.out.println("Hello World");
		
		Scanner s = new Scanner(new File("hundred50digit.txt"));
		
		System.out.println("Answer: " + Addition(s));

     }
	
	public static String Addition(Scanner s) {
		String[] array = new String[100];
		String current;
		int index = 0;
		int digitSum = 0;
		StringBuffer result = new StringBuffer();
		while (s.hasNext()) {
			array[index] = s.next();
			index++;
			
		}
		for (int i = 49; i >= 0; i--) {
			for (int j = 0; j < array.length; j++) {
				current = array[j];
				digitSum += Character.getNumericValue(current.charAt(i));
				
			}
			String tmp = Integer.toString(digitSum);
			result.append(tmp.charAt(tmp.length() - 1));
			StringBuffer temp = new StringBuffer(tmp);
			temp.deleteCharAt(temp.length() - 1);
			digitSum = Integer.parseInt(temp.toString());
		}
		result.append(Integer.toString(digitSum));
		result.reverse();
		return result.substring(0, 10);

	}
	
}
