import java.util.*;
import java.math.BigInteger;

public class helloworld {
	public enum Months {
		January,
		February,
		March,
		April,
		May,
		June,
		July,
		August,
		September,
		October,
		November,
		December;
	}

	
	public enum Day {
		Monday,
		Tuesday,
		Wednesday,
		Thursday,
		Friday,
		Saturday,
		Sunday;
	}

	public static void main(String []args){
        //System.out.println("Hello World");
		System.out.println("Answer: " + NumSundays());
     }
	
	public static int NumSundays() {
		Day current = Day.Monday;
		int index = 1;
		int dayIndex = 0;
		int limit = 31;
		int numSundays = 0;
		
		for (int i = 1900; i <= 2000; i++) {
			System.out.println("YEAR:	" + i);
			
			for (Months value: Months.values()) {
				limit = GetLimit(i, value);
				
				System.out.println(value.name() + " limit: " + limit);
				
				while (index <= limit) {
					current = Day.values()[(dayIndex % 7)];
					System.out.println("	" + current.name());
					
					if (i  > 1900) {
						if (index == 1 && current == Day.Sunday) {
							numSundays++;
						}
					}
					index++;
					dayIndex = (dayIndex+1);
				}
				//dayIndex = (current.ordinal() + 1)%7;
				index = 1;
			}
		}
		return numSundays;
		
		
	}
	public static int GetLimit(int index, Months value) {
		int limit = 0;
		if (value == Months.February) {
			if (index %100 == 0) {
				if (index %400 == 0) {
					limit = 29;
				}
				else
					limit = 28;
			}
			else {
				if (index%4==0) {
					limit = 29;
				}
				else
					limit = 28;
			}
		}
		else if (value == Months.April || value == Months.June || value == Months.September || value == Months.November) {
			limit = 30;
		}
		else
			limit = 31;
		
		return limit;
		
	}

	
}
