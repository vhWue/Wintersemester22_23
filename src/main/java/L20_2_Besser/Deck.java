package L20_2_Besser;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Karte> kartendeck = new ArrayList<>();
	
	public Deck() {
		Farbe[] farben = Farbe.values();
		Wert[] werte = Wert.values();

		
		
		for(Farbe f :farben) {
			for (Wert wert : werte) {
				kartendeck.add(new Karte(f, wert));
			}
		}
	}
	
	
	
	public void ausgabe() {
		kartendeck.stream()
		.forEach(System.out::println);
	}
	public void sortieren() {
		Collections.sort(kartendeck);
	}
	
	public void shuffle() {
		Collections.shuffle(kartendeck);
	}
	
	public ArrayList<Karte> randomHand(int handGroeße){
		ArrayList<Karte> hand= new ArrayList<>();
		int counter = 0;
		while(counter<handGroeße) {
			int zufall = (int)(Math.random()*kartendeck.size());
				if(!kartendeck.get(zufall).isEnthalten()){
					hand.add(kartendeck.get(zufall));
					kartendeck.get(zufall).setEnthalten(true);
					counter++;
				}
			}
		return hand;
	}
	
	public static void main(String[] args) {
		Deck d = new Deck();
		d.shuffle();
		d.sortieren();
		d.ausgabe();
		
		
	}

}
