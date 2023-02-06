package L20_2;

public class Kreuz_Karte extends Karte{
	public Kreuz_Karte(String blatt, int bildWert) {
		super(blatt, bildWert);
		this.wert=4;
		if(blatt.equals("Bube")) {
			wert+=3;
		}
	}
}
