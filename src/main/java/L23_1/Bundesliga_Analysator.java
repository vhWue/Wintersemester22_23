package L23_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bundesliga_Analysator {
	public static void main(String[] args) {
	
		List<Mannschaft> bundesTabelle = Mannschaft.createTabelle();
		/*
		 * Aufgabe b
		 * Alle Mannschaften welche mehr als 50 Punkte haben
		 */
		System.out.println("Aufgabe B\n");

		List<Mannschaft> mehrAls50 = bundesTabelle.stream()
				.filter(team -> team.punkte>50)
				.collect(Collectors.toList());
//		mehrAls50.stream().forEach(team-> System.out.println(team));
		mehrAls50.stream().forEach(System.out::println);
		
		/*
		 * Aufgabe c
		 * Alle Mannschaftsnamen
		 */
		
		System.out.println("\nAufgabe C");
		bundesTabelle.stream()
			.forEach(team -> System.out.println(team.name));
	
		/*
		 * Aufgabe d
		 * alle Mannschaftsnamen die mit F beginnen alphabetisch sortiert
		 */
		System.out.println("\nAufgabe D");
		bundesTabelle.stream()
			.filter(team-> team.name.startsWith("F"))
			.sorted()
//			.forEach(mannschaft -> System.out.println(mannschaft));
			.forEach(System.out::println);
		/*
		 * Aufgabe e
		 * Mannschaft mit den meisten Gegentoren
		 */
		System.out.println("\nAufgabe E");

		Mannschaft m = bundesTabelle.stream()
				.max(new Comparator<Mannschaft>() {
						@Override
						public int compare(Mannschaft o1, Mannschaft o2) {
							if(o1.gegentore<o2.gegentore) return -1;
							else if(o1.gegentore>o2.gegentore) return 1;
							else return 0;
							}
						})
				.get();
	System.out.println(m);
	
	System.out.println("\nComparator durch lamba ausdruck");
	Comparator<Mannschaft> comp = (Mannschaft m1, Mannschaft m2)->
	{
		if(m1.gegentore<m2.gegentore) return -1;
		else if(m1.gegentore>m2.gegentore) return 1;
		else return 0;
	};
	
	System.out.println(bundesTabelle.stream().max(comp).get());
	System.out.println("Reverse");
	Comparator<Mannschaft> compReverse = (Mannschaft m1, Mannschaft m2)->
	{
		if(m1.punkte<m2.punkte) return -1;
		else if(m1.punkte>m2.punkte) return 1;
		else return 0;
	};
	
	
	
	bundesTabelle.stream()
		.sorted(compReverse)
		.forEach(team -> System.out.println(team));
	
	}
	

}
