package L20_2;

public class Pik_Karte extends Karte{
	
	public Pik_Karte(String blatt,int bildWert) {
		super(blatt, bildWert);
		this.wert=3;
		if(blatt.equals("Bube")) {
			wert+=3;
		}
	}
}
