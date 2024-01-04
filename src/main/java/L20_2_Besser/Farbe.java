package L20_2_Besser;

public enum Farbe {
	KREUZ(4),
	PIK(3),
	HERZ(2),
	KARO(1);
	private final int wert;
	
	 Farbe(int wert) {
		this.wert=wert;
	}

	
	public int getWert() {
		return wert;
	}

}

