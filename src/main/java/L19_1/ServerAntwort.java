package L19_1;

import java.io.Serializable;

public class ServerAntwort implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7456051097090159107L;
	private boolean erraten;
	private boolean beendet;
	private boolean treffer;
	private String str;
	private static int anzahlVersuche=1;
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setErraten(boolean erraten) {
		this.erraten = erraten;
	}

	public void setBeendet(boolean beendet) {
		this.beendet = beendet;
	}

	public void setTreffer(boolean treffer) {
		this.treffer = treffer;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public static void setAnzahlVersuche(int anzahlVersuche) {
		ServerAntwort.anzahlVersuche += anzahlVersuche;
	}

	public boolean isErraten() {
		return erraten;
	}

	public boolean isBeendet() {
		return beendet;
	}

	public boolean isTreffer() {
		return treffer;
	}

	public String getStr() {
		return str;
	}

	public static int getAnzahlVersuche() {
		return anzahlVersuche;
	}

	
	
	public ServerAntwort() {
		this.erraten=false;
		this.beendet=false;
		this.treffer=false;
		this.str=null;
		
	}
	
	public void setAntworten(boolean erraten, boolean beendet) {
		this.erraten = erraten;
		this.beendet= beendet;
		
	}
	
	public String toString() {
		return "Wort erraten: ["+erraten +"] Spiel beendet: ["+beendet+"] Buchstabe Treffer: ["+treffer+"]";
	}
}
