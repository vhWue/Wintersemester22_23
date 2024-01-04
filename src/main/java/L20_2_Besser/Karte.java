package L20_2_Besser;

public class Karte implements Comparable<Karte>{
	
	private Farbe farbe;
	private Wert wert;
	private boolean enthalten=false;
	
	public Karte(Farbe farbe, Wert wert) {
		this.farbe=farbe;
		this.wert=wert;
		
	}
	
	
	public Farbe getFarbe() {
		return farbe;
	}

	public Wert getWert() {
		return wert;
	}


	@Override
	public int compareTo(Karte o) {
		
		if(this.wert==Wert.BUBE && !(o.wert==Wert.BUBE)) return -1;
		if(!(this.wert==Wert.BUBE) && o.wert==Wert.BUBE) return 1;
		
		if (this.farbe.getWert()>o.farbe.getWert()) return -1;
		else if	(this.farbe.getWert()<o.farbe.getWert()) return 1;
		
		else {
			if (this.wert.getWert()>o.wert.getWert()) return -1;
			else if(this.wert.getWert()<o.wert.getWert()) return 1;
			else return 0;
		}
	
	}
	public String toString() {
		return farbe + "\t"+wert;
	}

	public void setEnthalten(boolean enthalten) {
		this.enthalten = enthalten;
	}


	public boolean isEnthalten() {
		return enthalten;
	}
	


}
