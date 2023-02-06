package Klausur_Spieldaten;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

public class Spieldaten {
	private final double geld;
	private final List<String> spielerIDs;

	private Spieldaten(double geld, List<String> spielerIDs) {
		this.geld=geld;
		this.spielerIDs=spielerIDs;
	}
	
	public void ausgabe() {
		spielerIDs.forEach(System.out::println);
	}
	public double getGeld() {
	        return this.geld;
	   }
	
	public List<String> getSpielerIDs() {
	        return Collections.unmodifiableList(this.spielerIDs);
	   }


	
	public static class SpieldatenBuilder{
		private double geld;
		private final List<String> spieler;
		
		public SpieldatenBuilder() {
			spieler=new ArrayList<>();
		}
		
		public SpieldatenBuilder geld(double geld) {
			this.geld=geld;
			return this;
		}
		public SpieldatenBuilder add(String spieler) {
			this.spieler.add(spieler);
			return this;
		}
		public Spieldaten build() {
			return new Spieldaten(geld, Collections.unmodifiableList(this.spieler));
		}
	}

}
