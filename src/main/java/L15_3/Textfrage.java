package L15_3;

public class Textfrage extends Frage{

	public Textfrage(String frage, String loesung) {
		super(frage, loesung);
		
	}
	
	public String toString() {
		return frage+"\n\nAntwort:";
	}

}
