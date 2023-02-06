package L15;

public class Rechteck extends GeometrischeFigur{
	double laenge;
	double breite;
	
	public Rechteck() {
		// TODO Auto-generated constructor stub
	}
	public Rechteck(double laenge, double breite) {
		this.breite=breite;
		this.laenge=laenge;
	}
	
	public double berechneFlaeche() {
		return laenge*breite;
	}

}
