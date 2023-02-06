package L22_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Kreuzwortraetsel{
	
	/*
	 * Vorteil der anonymen Klasse -> nicht nötig immer eine neue Comparator Klasse anlegen zu müssen
	 * Nachteil-> nur zugriff innerhalb der dieser Klasse auf den Comparator
	 */
	static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel", 
			 "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen","z"};
			 
			 public static void main(String[] args){
				 
			 TreeSet<String> t = new TreeSet<>(new RaetselComparator());
			 t.addAll(Arrays.asList(alleWoerter));
			 System.out.println(t);
			 System.out.println("----------------");
			
			 TreeSet<String> t2 = new TreeSet<>(new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					if (o1.length()<o2.length()) return -1;
					else if (o1.length()<o2.length()) return 1;
					else return o1.compareTo(o2);
				}
			});
			 t2.addAll(Arrays.asList(alleWoerter));
			 System.out.println(t2);
			 
			 
			
			
			 
			 
			 
	}

			
}
