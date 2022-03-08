package ArrayList;

import java.util.*;


public class LearnArrayList {

	public static void main(String[] args) {
		List<String> list = new LinkedList();
		
		list.add("Rahul");
		list.add("Rohan");
		list.add("Shyam");
		
		System.out.println(list);
		
		list.get(1);
		System.out.println(list.get(1));
	}

}
