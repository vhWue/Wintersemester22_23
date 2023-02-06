package L23_Versuche;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda {
	
	public static Predicate<String> letterFilter(String letter){
		return name-> name.startsWith(letter);
	}
	
	
	
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Bert","Bob","Heinz");
		
		nameList.stream().map(new Function<String, String>() {
			@Override
			public String apply(String name) {
				return name.toUpperCase();
			}
		}).forEach( name -> System.out.println(name));
		nameList.stream().forEach(name->System.out.println(name));
		
		nameList.stream()
		.map(name -> name.toUpperCase())
		.forEach(name-> System.out.print(name));
		System.out.println();
		
		nameList.stream()
		.map(name -> name.length())
		.forEach(name-> System.out.print(name));
		
		
		List<String> neueStringList = nameList.stream()
				.filter(name-> name.startsWith("B"))
				.collect(Collectors.toList());
		
		neueStringList.stream().forEach(name-> System.out.println(name));
		
		ArrayList<String> arrList = new ArrayList<>();
		arrList.addAll(neueStringList);
		System.out.println(arrList);
		
		System.out.println();
		nameList.stream()
			.filter(letterFilter("H"))
			.forEach(name-> System.out.println(name));
		
		
		Function<String, Predicate<String>> letterFilterFunction = letter -> (name->name.startsWith(letter));
		nameList.stream()
		.filter(letterFilterFunction.apply("B"))
		.forEach(name-> System.out.println("Neuer Versuch : "+name));
		
		
		Consumer<String> c = new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t+" hallo");
			}
		};
		String[] arr = {"Bert","Fritz","Heinz"};
		
		
 		Stream<String> s = Arrays.stream(arr);
// 		s.forEach(c);
		
	}

}
