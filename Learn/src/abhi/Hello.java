package abhi;

import java.util.stream.Stream;

public class Hello {

	public static void main(String[] args) {
		 Stream.iterate(1, element->element+1)  
	        .filter(element->element%5==0)  
	        .limit(5)  
	        .forEach(System.out::println);  
		 Stream.iterate(1, x->x+1)
		 	.filter(x->x%5==0)
		 	.limit(5)
		 	.forEach(System.out::println);
	}
	
}
