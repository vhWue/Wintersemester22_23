package L15_3;

public class MultipleChoice extends Frage{
	String[] auswahl;
	public MultipleChoice(String frage, String loesung) {
		super(frage, loesung);
		this.auswahl=new String[4];
	}
	public void setAuswahl(String a1, String a2, String a3, String a4) {
		this.auswahl[0]=a1;
		this.auswahl[1]=a2;
		this.auswahl[2]=a3;
		this.auswahl[3]=a4;
	}
	
	
	public String toString() {
		String ausgabe="";
		ausgabe+=frage+"\nAntwortmöglichkeiten:\n";
		char buchstabe = 'A';
		for (int i = 0; i < auswahl.length; i++) {
			ausgabe+=buchstabe+": "+auswahl[i]+"\n";
			buchstabe++;
		}
		ausgabe+="\n";
		return ausgabe;
		
	}
	
//	public static void main(String[] args) {
//		
// 		MultipleChoice test = new MultipleChoice("Wie viele Protonen hat ein Wasserstoff-Atom?", "0");
// 		test.setAuswahl("4","2","1","0");
// 		
// 		
// 		System.out.println(test);
//	}

	
	
}
