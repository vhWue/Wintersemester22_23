package L20_2;

public class Karo_Karte extends Karte{
		
	public Karo_Karte(String blatt,int bildWert) {
		super(blatt, bildWert);
		this.wert=1;
		if(blatt.equals("Bube")) {
			wert+=3;
		}
	}
}
