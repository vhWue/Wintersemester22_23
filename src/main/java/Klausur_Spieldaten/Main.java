package Klausur_Spieldaten;

public class Main {
	public static void main(String[] args) {
		Spieldaten.SpieldatenBuilder builder = new Spieldaten.SpieldatenBuilder();
		Spieldaten daten = builder.geld(1100)
				.add("abc")
				.add("xyz")
				.add("xyz")
				.add("xyz")
				.build();
		
		
		System.out.println("Durchlauf 1");
		daten.ausgabe();

		
		
	}

}
