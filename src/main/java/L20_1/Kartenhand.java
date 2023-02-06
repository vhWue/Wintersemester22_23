package L20_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Kartenhand {
	
	final int anzahlKarten=3;
	
	Collection<Karte> kartenhand = new ArrayList<>();
	
	public boolean Nichtenthalten(Karte k) {
		if(!kartenhand.contains(k)) return true;
		else return false;
	}
	
	
	public Kartenhand() {
		
		Bube b = new Bube();
		Dame d = new Dame();
		Koenig k = new Koenig();
		Sieben s = new Sieben();
		
		
		while(kartenhand.size()<anzahlKarten) {
			int zufall= (int)(Math.random()*4);
			switch (zufall) {
			case 0: if(!kartenhand.contains(b)) kartenhand.add(b);break;
			case 1: if(!kartenhand.contains(d)) kartenhand.add(d);break;
			case 2: if(!kartenhand.contains(k)) kartenhand.add(k);break;
			case 3: if(!kartenhand.contains(s)) kartenhand.add(s);break;
			default:
				break;
			}
			
			
		}
	}
	
	
	void ausgabeKarten() {
		for(Karte k : kartenhand) {
			System.out.println(k.getName());
		}
	}

}
