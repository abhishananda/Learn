package abhi.StreamLearn;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Product> list= new ArrayList<Product>();
		list.add(new Product(1,"HP Laptop",25000f));
		list.add(new Product(2,"Dell Laptop",30000f));
		list.add(new Product(3,"Lenevo Laptop",28000f));
		list.add(new Product(4,"Sony Laptop",28000f));
		list.add(new Product(5,"Apple Laptop",90000f));
		
		List<Float> Listnew = list.stream()
				.filter(p->p.price<30000)
				.map(p->p.price)
				.collect(Collectors.toList());
		System.out.println(Listnew);
	}

}
