package abhi.ComparatorVsComparable;

import java.util.*;

public class SortExample {

	public static void main(String[] args) {
		ArrayList<Emp> emps = new ArrayList<>();
		
		emps.add(new Emp("Abhishek","123456789",12));
		emps.add(new Emp("Durgesh","7654321",14));
		emps.add(new Emp("Baba","0987654321",17));
		
		System.out.println(emps);
		
		Collections.sort(emps, new IdComparator());
		System.out.println(emps);
		
		//Collections.sort(emps,new IdComparator());
		//System.out.println(emps);
		
		
		ArrayList<Emp> emps1= new ArrayList<>(emps);
		
		Collections.sort(emps1,new NameComparator());
		System.out.println(emps1);
	}

}
