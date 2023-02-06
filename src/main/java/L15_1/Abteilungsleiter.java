package L15_1;

public class Abteilungsleiter extends Angestellter {
	
	public Abteilungsleiter(String id, String nachname, String vorname,String gebDatum, double grundgehalt) {
		super(id, nachname, vorname, gebDatum, grundgehalt);
		this.faktor=2;
		this.gehalt*=this.faktor;
		
	}
	
	public static void befoerden(Angestellter angestellter) {
		angestellter.faktor*=1.1;
		angestellter.gehalt*=angestellter.faktor;
	}

	
	

}
