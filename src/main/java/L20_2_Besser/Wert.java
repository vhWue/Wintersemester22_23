package L20_2_Besser;

public enum Wert {
	BUBE(8), ASS(7), ZEHN(6), KOENIG(5), DAME(4), NEUN(3), ACHT(2),
	 SIEBEN(1);
	 
	 private int wert;
	 Wert(int wert) {
		this.wert=wert;
	}
	public int getWert() {
		return wert;
	}
}
