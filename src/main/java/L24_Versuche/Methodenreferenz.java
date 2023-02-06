package L24_Versuche;

import java.util.ArrayList;
import java.util.List;

public class Methodenreferenz {
	public static void main(String[] args) {
		List<String> students = List.of("Peter","Paul","Hans","August");
		
		
		ArrayList<String> test = students.stream()
		.map(String::toUpperCase)
		.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		
		System.out.println(test);
		
	
		
	
	
	}

}
