package L15_3;



public class Quiz {
	
	public static void main(String[] args) {
		
		
		MultipleChoice[] mArr = new MultipleChoice[5];
		mArr[0]= new MultipleChoice("Wie viele Protonen hat ein Wasserstoff-Atom?", "1");
		mArr[0].setAuswahl("4", "2", "1", "0");
		mArr[1]= new MultipleChoice("Welche Währung hat Deutschland?", "Euro");
		mArr[1].setAuswahl("Dollar", "Pfund", "Rubel", "Euro");
		mArr[2]= new MultipleChoice("Welche der Folgenden Zahlen ist keine Primzahl?", "15");
		mArr[2].setAuswahl("31", "47", "15", "7");
		mArr[3]= new MultipleChoice("Wie heißt der aktuelle Präsident der USA?", "Biden");
		mArr[3].setAuswahl("Trump", "Obama", "Bush Jr.", "Biden");
		mArr[4]= new MultipleChoice("Ab welcher Temperatur fängt Wasser an zu kochen?", "100");
		mArr[4].setAuswahl("90", "50", "100", "110");
		
		Textfrage[] tArr = new Textfrage[5];
		tArr[0] = new Textfrage("Was ist die Hauptstadt von Deutschland?", "Berlin");
		tArr[1] = new Textfrage("Welcher Tag kommt nach Montag?", "Dienstag");
		tArr[2] = new Textfrage("Welcher Jahreszeit kommt nach dem Sommer?", "Herbst");
		tArr[3] = new Textfrage("Wie heißt der aktuelle Bundeskanzler", "Scholz");
		tArr[4] = new Textfrage("Welches Land wird auch Down Under genannt?", "Australien");
		
		Frage[] fragen = {mArr[0],tArr[0],mArr[1],tArr[1],mArr[2],tArr[2],mArr[3],tArr[3],mArr[4],tArr[4]};
		Frage.erstelleQuiz(fragen);
		
//		Frage[] downcastFragen = new Frage[10];
//		
//		downcastFragen[0]= new MultipleChoice("Wie viele Protonen hat ein Wasserstoff-Atom?", "1");
//		((MultipleChoice) downcastFragen[0]).setAuswahl("4", "2", "1", "0");
//		
//		downcastFragen[1]= new MultipleChoice("Welche Währung hat Deutschland?", "Euro");
//		((MultipleChoice) downcastFragen[1]).setAuswahl("Dollar", "Pfund", "Rubel", "Euro");
//		
//		downcastFragen[2]= new MultipleChoice("Welche der Folgenden Zahlen ist keine Primzahl?", "15");
//		((MultipleChoice) downcastFragen[2]).setAuswahl("31", "47", "15", "7");
//		
//		downcastFragen[3]= new MultipleChoice("Wie heißt der aktuelle Präsident der USA?", "Biden");
//		((MultipleChoice) downcastFragen[3]).setAuswahl("Trump", "Obama", "Bush Jr.", "Biden");
//		
//		downcastFragen[4]= new MultipleChoice("Ab welcher Temperatur fängt Wasser an zu kochen?", "100");
//		((MultipleChoice) downcastFragen[4]).setAuswahl("90", "50", "100", "110");
		
 	}

}
