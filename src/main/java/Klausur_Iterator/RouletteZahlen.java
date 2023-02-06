package Klausur_Iterator;

import java.util.Iterator;

public class RouletteZahlen implements Iterable<Integer> {

	@Override
	public Iterator<Integer> iterator() {
		return new RouletteZahlenIterator();
	}
	
	public static void main(String[] args) {
		//Aufgabe b
		RouletteZahlen roulette = new RouletteZahlen();
		Iterator<Integer> iterator = roulette.iterator();
//		int anzahl_versuche = 0;
//		while(iterator.hasNext()) {
//			int wert = iterator.next();
//			System.out.println(iterator.next()==0 ? wert+"  NULL" : wert);
//			anzahl_versuche++;
//		}
//		System.out.println("Anzahl Versuche: "+anzahl_versuche);
		
		//Aufgabe b alternative
		for (int i = 0; i < 1000; i++) {
			int wert = iterator.next();
			if(!iterator.hasNext()) break;
			System.out.println(iterator.next()==0 ? wert+"  NULL" : wert);
		}
		
		
		//Aufgabe c
//		Iterator<Integer> aufgabeC = new RouletteZahlenIterator();
//		while(aufgabeC.hasNext()) {
//			System.out.println(aufgabeC.next());
//		}
	}
	

}
