package L20_2_Besser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Kartenhand {
	
	private ArrayList<Karte> hand;
	
	public Kartenhand(int groeße, Deck d) {
		hand = d.randomHand(groeße);
	}

	public ArrayList<Karte> getHand() {
		return hand;
	}

	void ausgabe() {
		hand.stream()
		.forEach(System.out::println);
	}
	
	void sort() {
		Collections.sort(hand);
	}
	
//	public int stelleInHand(Farbe farbe, Wert wert) {
//		for (int i = 0; i < hand.size(); i++) {
//			if(hand.get(i).getFarbe()==farbe && hand.get(i).getWert()==wert) {
//				return i;
//			}
//		}
//		return -1;
//	}
	
}
