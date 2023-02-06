package L20_1;

public class Spieler {
	
	private Kartenhand hand;
	
	public Spieler() {
		hand= new Kartenhand();
	}
	
	public void zieheKarten() {
		hand = new Kartenhand();
	}
	
	public void zeigeKarten() {
		hand.ausgabeKarten();
	}

}
