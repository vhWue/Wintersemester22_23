package L20_2;

public class Herz_Karte extends Karte {

	
	public Herz_Karte(String blatt,int bildWert) {
		super(blatt,bildWert);
		this.wert=2;
		if(blatt.equals("Bube")) {
			wert+=3;
		}
	}
	
}
