package L15_1;

public class Angestellter {
	String id;
	String nachname;
	String vorname;
	String gebDatum;
	double grundgehalt;
	double faktor;
	double gehalt;
	
	public Angestellter(String id, String nachname, String vorname,String gebDatum, double grundgehalt) {
		this.id = id;
		this.nachname = nachname;
		this.vorname = vorname;
		this.gebDatum=gebDatum;
		if(grundgehalt>=0) {
			this.grundgehalt = grundgehalt;
		}else {
			throw new RuntimeException("Negatives Grundgehalt");
		}
		this.faktor=1;
		this.gehalt= grundgehalt*faktor;
	}
	
	
	public String toString() {
		
		return "ID: "+id+"\nVorname: "+vorname+"\nNachname: "+nachname+"\nGrundgehalt: "+grundgehalt+"\nFaktor: "+faktor+"\nGehalt: "+gehalt;
	}
	
	 

}
