package abhi.FunctionalInterface;

import java.util.*;

public class LambdaStream {

	static List<String> places = new ArrayList<>();
	
	public static List<String> getplaces() {
		places.add("Nepal, KathMandu");
		places.add("Nepal, Pokhara");
		places.add("India, New Delhi");
		places.add("USA, NewYork");
		places.add("USA, Washington");
		places.add("Africa, Nigeria");
		return places;
	}
	
	public static void main(String[] args) {
		
		List<String> myPlaces = getplaces();
		
		System.out.println("Places from Nepal:");
		
		myPlaces.stream()
				.filter( (p) -> p.contains("USA") )
				.map( (p) -> p.toLowerCase() )
				.sorted()
				.forEach((p) -> System.out.println(p));
	}

}
