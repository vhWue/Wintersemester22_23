package L15_3;
import java.util.Scanner;
public class Frage {
	
	String frage;
	String loesung;
	public Frage(String frage, String loesung) {
		this.frage=frage;
		this.loesung=loesung;
	}
	
	
	public static void erstelleQuiz(Frage[] fragen) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < fragen.length; i++) {
			System.out.print(fragen[i]);
			if(sc.nextLine().equals(fragen[i].loesung)) {
				System.out.println("Korrekt!\n");
			}else {				
				System.out.println("Falsch!\n");
			}
		}
	}
	
	
	

}
