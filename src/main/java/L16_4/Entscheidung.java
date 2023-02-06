package L16_4;

public enum Entscheidung {
	RECHTS("rechts"),
	LINKS("links"),
	BREMSEN("bremsen"),
	UNENTSCHIEDEN("unentschieden");
	
	String entscheidung;
	
	Entscheidung(String entscheidung){
		this.entscheidung=entscheidung;
	}
}
