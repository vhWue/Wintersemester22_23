package L20_2_Besser;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		Kartenhand hand = new Kartenhand(32, new Deck());
//		hand.ausgabe();
		hand.sort();
		System.out.println("\nsortiert:\n");
//		hand.ausgabe();
		
//		System.out.println(hand.stelleInHand(Farbe.KARO, Wert.SIEBEN));;

		
		ArrayList<Karte> test = new ArrayList<>();
		test.add(new Karte(Farbe.KREUZ, Wert.BUBE));
		test.add(new Karte(Farbe.PIK, Wert.BUBE));
		test.add(new Karte(Farbe.HERZ, Wert.BUBE));
		test.add(new Karte(Farbe.KREUZ, Wert.ASS));
		test.add(new Karte(Farbe.PIK, Wert.NEUN));
		test.add(new Karte(Farbe.PIK, Wert.ACHT));
		test.add(new Karte(Farbe.PIK, Wert.SIEBEN));
		test.add(new Karte(Farbe.HERZ, Wert.ASS));
		test.add(new Karte(Farbe.KARO, Wert.ASS));
		test.add(new Karte(Farbe.KARO, Wert.SIEBEN));
		
		Collections.shuffle(test);
		test.stream()
			.forEach(System.out::println);
		Collections.sort(test);
		System.out.println("\n sortiert\n");
		test.stream()
			.forEach(System.out::println);
		
	}

}
