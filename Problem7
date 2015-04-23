import java.util.*;

public class helloworld {

	public static void main(String []args){
        //System.out.println("Hello World");
		System.out.println("Answer: " + PrimeNum(10001) );
     }
	
	public static int PrimeNum (int n) {
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(new Integer(2));
		System.out.println(2);
		int i = 3;
		while(true) {
			System.out.println(i);
			if (i % 2 != 0) {
				if (checkPrime(i, v)) {
					v.addElement(new Integer(i));
					
					if (v.size() == n) {
						break;
					}
				}
			}
			i++;
			
		}
		return ((Integer)v.lastElement()).intValue();
	}
     
	public static boolean checkPrime(int i, Vector<Integer> vect) {
		if (vect.capacity() == 0) {
			return true;
			
		}
		else 
			for (Object obj: vect) {
				if (i % ((Integer)obj).intValue() == 0) {
					return false;
				}
				
			}
		return true;
	}
	
}
