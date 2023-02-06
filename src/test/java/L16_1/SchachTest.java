package L16_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SchachTest{

	public static boolean vergleiche(Laeufer laeufer,Turm turm,Dame dame) {
		Brett l = laeufer.gibErlaubteFelder();
		Brett t = turm.gibErlaubteFelder();
		Brett d = dame.gibErlaubteFelder();
		boolean uebereinstimmend=true;
		
			for (int i = 1; i <= 8; i++) {
				for(int j= 1; j<=8;j++) {
				if( !((l.gibFeld(i, j) || t.gibFeld(i, j))==d.gibFeld(i, j)) ) {
					uebereinstimmend=false;
				}
			}
		}
			return uebereinstimmend;
	}
	
	
	@Test
	void vergleich() {
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				Laeufer laeufer = new LaeuferImpl(i, j);
				Turm turm = new TurmImpl(i, j);
				Dame dame = new Dame(i, j);
				boolean test = vergleiche(laeufer, turm, dame);
				assertEquals(true, test);				
			}
		}
	}
	@Test
	void vergleichEinzelCase() {
			int x=8;
			int y = 8;
				Laeufer laeufer = new LaeuferImpl(x, y);
				Turm turm = new TurmImpl(x, y);
				Dame dame = new Dame(x, y);
				boolean test = vergleiche(laeufer, turm, dame);
				assertEquals(true, test);				
	}
	@Test
	void vergleichEinzelCase2() {
		int x=1;
		int y = 1;
		Laeufer laeufer = new LaeuferImpl(x, y);
		Turm turm = new TurmImpl(x, y);
		Dame dame = new Dame(x, y);
		boolean test = vergleiche(laeufer, turm, dame);
		assertEquals(true, test);				
	}
}
