import java.util.*;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;


public class helloworld {
	
	public static void main(String []args)
		throws IOException {
        //System.out.println("Hello World");
		
		Scanner s = new Scanner(new File("names.txt"));
		ReadValue(s);
		
		System.out.println("Answer: ");

     }
	
	public static void ReadValue(Scanner s) {
		s = s.useDelimiter(",");
		StringBuffer newName;
		List<String> names = new ArrayList<String>();
		String[]finalNames;
		
		while (s.hasNext()) {
			String name = s.next();
			newName = new StringBuffer(name);
			newName.deleteCharAt(0);
			newName.deleteCharAt(newName.length() - 1);
			names.add(newName.toString());
			
			
			
		}
		
		Collections.sort(names);
		/*for (String name : names) {
			System.out.println(name);
		}*/
		CalcScore(names);
		
	}
	
	public static void CalcScore (List<String> names) {
		int sum = 0;
		long sumScore = 0l;
		//System.out.println(names.get(0));
		//System.out.println(names.get(0).charAt(0) + names.get(0).charAt(1));
		for (int i = 1; i <= names.size(); i++) {
			for (int j = 0; j < names.get(i-1).length(); j++) {
				sum += (names.get(i-1).charAt(j) - 64);
			}
			sumScore += sum * (i);
			sum = 0;
			
			
		}
		System.out.println(sumScore);
	}
	
	
		
	
	
	
}
