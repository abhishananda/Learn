package work;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
	
	public static void main(String[] args) {
		
		List<Integer>list1 = List.of(2,4,50,21,22,67);
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(34);
		list2.add(23);
		list2.add(78);
		list2.add(55);
		
		List<Integer> list3=Arrays.asList(2,4,6,7,9,10,15);
		
		
		List<Integer> listEven = new ArrayList<>();
		
		for(Integer i:list1) {
			if(i%2==0) {
				listEven.add(i);
			}
		}
		System.out.println(list1);
		System.out.println(listEven);
		
		//using Stream-API
		Stream<Integer> stream1 = list1.stream();
		
//		List<Integer> newList = stream1.filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(newList);
//		
//		Stream<Integer> stream2= list1.stream();
//		List<Integer>newlist1= stream1.filter(i -> i>20).collect(Collectors.toList());
//		System.out.println(newlist1);
		
		List<Integer>newList2=list1.stream()
									.filter(i->i>20)
									.collect(Collectors.toList());
		System.out.println(newList2);
		
		List<Integer>newList3=list1.stream().filter(i->i>=50).collect(Collectors.toList());
		System.out.println(newList3);
		
	}

}









