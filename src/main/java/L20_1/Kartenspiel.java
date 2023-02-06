package L20_1;

public class Kartenspiel {
	

	/*
	 * a) Welche objekte werden benötigt?
	 * 		-die verschiedenen Kartentypen
	 * 		-eine Kartenhandklasse mit max anzahl karten pro hand
	 * 		-eine Spielerklasse die eine kartenhand enthalten kann
	 * 		-
	 * b) wie würde die Abbildung einer Kartenhand aussehen?
	 * 		-mit einer maxAnzahl an Karten
	 * 		-einem hashSet das die Kartenhand darstellt und als Typwert die Oberklasse Karte hat von welcher die spezifischen Kartentypen erben
	 * c)Erstelle einen Spieler mit einer zufälligen Mau Mau Kartenhand --> keine doppelten Karten geben (evtl hashSet?)
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		Spieler eins = new Spieler();
		eins.zeigeKarten();
		eins.zieheKarten();
		System.out.println("Neue ausgabe");
		eins.zeigeKarten();
	}
}
