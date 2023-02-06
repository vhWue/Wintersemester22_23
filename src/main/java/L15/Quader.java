package L15;

public class Quader extends Rechteck{
	double tiefe;

	public Quader(double laenge, double breite ,double tiefe) {
		super(laenge,breite);
		this.tiefe=tiefe;
	}
	
	
	public double berechneVolumen() {
		return berechneFlaeche()*tiefe;
	}
	
	public String toString() {
		return ""+berechneVolumen();
	}
}
