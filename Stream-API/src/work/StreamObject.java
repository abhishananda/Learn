package work;

import java.util.*;
import java.util.stream.*;




public class StreamObject {
	public static void main(String[] args) {
		
		Stream<Object> emptyStream=Stream.empty();
		emptyStream.forEach(e->{
			System.out.println(e);
		});
		
		
		//2nd way
		String names[]= {"Abhishek","Durgesh", "Ankit","Divya"};
		Stream<String> stream1 = Stream.of(names);
		stream1.forEach(e -> {
			System.out.println(e);
		});
		
		
		//3rd way
		
		Stream<Object> stream2=Stream.builder().build();
		
		IntStream stream = Arrays.stream(new int[] {2,3,4,5,6,7});
		stream.forEach(e->{
			System.out.print(" "+e);
		});
		System.out.println();
		
		//4th way
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(34);
		list2.add(23);
		list2.add(78);
		list2.add(55);
		
		Stream<Integer>stream3=list2.stream();
		stream3.forEach(e->{
			System.out.print(" "+e);
		});
		
		
		
		
	}

}











