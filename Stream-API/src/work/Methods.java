package work;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
	public static void main(String[] args) {
		//filter(predicate)
		/*
		 * Boolean value function
		 */
		
		List<String> names = List.of("Aman","Ankit","Abhishek","Durgesh");
		
		names.stream().filter( e -> e.startsWith("A")).forEach(e->{
			System.out.println(e);
		});
		
		List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newNames);
		
		//map(function)
		/*
		 * each element operation
		 * 
		 * 
		 */
		
		List<Integer> numbers=List.of(12,2,1,4,5,6,7,8,9);
		List<Integer>newNumber=numbers.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(newNumber);
		

		
		names.stream().forEach(System.out::println);
		
		numbers.stream().sorted().forEach(e->{
			System.out.print(" "+e);
		});
		System.out.println();
		Integer integer = numbers.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("Min = "+integer);
		
		Integer integer1=numbers.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(integer1);
	}

}















