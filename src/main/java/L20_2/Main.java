package L20_2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		Collections.shuffle(deck.getDeck());
		deck.ausgabe();
		Collections.sort(deck.getDeck());
		System.out.println();
		System.out.println();
		System.out.println();
		deck.ausgabe();
		
		

//		ArrayList<Karte> hand = new ArrayList<>();
//		while(hand.size()<10) {
//			Karte zufall=Deck.gebeZufaelligeKarte(deck);
//			if(!hand.contains(zufall)) {
//				hand.add(zufall);
//			}
//					
//		}
//		for(Karte k : hand) {
//			k.ausgabe();
//		}
//		
//		Collections.sort(hand);
//		System.out.println("Nach Karten Wert sortiert\n\n");
//		
//		for(Karte k : hand) {
//			k.ausgabe();
//		}
//		
//		
//		ArrayList<Karte> hand2 = new ArrayList<>();
//		
//		hand2.add(new Pik_Karte("7", 1));
//		hand2.add(new Pik_Karte("9", 3));
//		hand2.add(new Karo_Karte("Ass", 7));
//		hand2.add(new Herz_Karte("Bube", 8));
//		hand2.add(new Pik_Karte("Bube", 8));
//		hand2.add(new Kreuz_Karte("Bube", 8));
//		hand2.add(new Karo_Karte("7", 1));
//		hand2.add(new Karo_Karte("Bube", 8));
//		hand2.add(new Kreuz_Karte("Ass", 7));
//		hand2.add(new Pik_Karte("8", 2));
//		hand2.add(new Herz_Karte("Ass", 7));
//	
//		for(Karte k : hand2) {
//			k.ausgabe();
//		}
//		
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		Collections.sort(hand2);
//		for(Karte k : hand2) {
//			k.ausgabe();
//		}
//		
//		
		
	}

}
