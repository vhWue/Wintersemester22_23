package L20_2;

import java.util.ArrayList;

public class Deck{
	private ArrayList<Karte> deck;
	
	public ArrayList<Karte> getDeck() {
		return deck;
	}


	public Deck() {
		deck = new ArrayList<>();
		
			String[] blattWerteArr= {"7","8","9","Dame","Koenig","10","Ass","Bube"};
		for(int i = 0 ; i<blattWerteArr.length;i++) {
			addKarte(new Kreuz_Karte(blattWerteArr[i],i+1));
			addKarte(new Pik_Karte(blattWerteArr[i],i+1));
			addKarte(new Herz_Karte(blattWerteArr[i],i+1));
			addKarte(new Karo_Karte(blattWerteArr[i],i+1));	
		}
	}
	
	
	public void addKarte(Karte k) {
		deck.add(k);
	}
	
	public void ausgabe() {
		for(Karte k : deck) {
			System.out.println("Wert "+k.wert+"  "+k.getClass().getSimpleName()+" 	Karte: " +k.blatt /*+" KartenBildWert "+k.bildWert*/);
		}
	}


	public static Karte gebeZufaelligeKarte(Deck deck) {
		
		int zufallIndex = (int)(Math.random()*deck.getDeck().size());
		return deck.getDeck().get(zufallIndex);
	}

}
