package L24_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import L20_2_Besser.Farbe;

public class Kartendeck {
	List<Karte> karten;
	
	public Kartendeck() {
		
		karten = new ArrayList<>();
	}
	
	public void erzeugeDeck() {
		List<L24_2.Farbe> farben = List.of(L24_2.Farbe.values());
		List<Wert> werte = List.of(Wert.values());
		farben.stream()
			.forEach(farbe->{
				werte.stream()
					.forEach(wert -> karten.add(new Karte(farbe, wert)));
			});
		
	}
	
	private String rueckgabe = "";
	public String toString() {
		karten.stream()
			.forEach(karte -> rueckgabe+=karte+",");
		return rueckgabe;
	}
	

	
	public static void main(String[] args) {
		Kartendeck deck = new Kartendeck();
		
		deck.erzeugeDeck();

		System.out.println(deck);
	}
}
