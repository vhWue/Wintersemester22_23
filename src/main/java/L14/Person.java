package L14;

public class Person {
	String vorname;
	String nachname;
	Adresse adresse;
	
	public Person(String vorname, String nachname, Adresse adresse) {
		if(checkFirstChar(vorname) && checkFirstChar(adresse.strasse) && checkFirstChar(adresse.ort)&&checkFirstNum(adresse.hausNr)) {
			this.vorname = vorname;
			this.nachname = nachname;
			this.adresse = adresse;			
		}else {
			throw new RuntimeException("FalscheEingabe");
		}
	}
	
	public static boolean checkFirstChar(String input) {
		if (input.charAt(0)>='A' && input.charAt(0)<='Z') {
			return true;
		}
		return false;
	}
	public static boolean checkFirstNum(String input) {
		if (input.charAt(0)>='0' && input.charAt(0)<='9') {
			return true;
		}
		return false;
	}
	
	

}
