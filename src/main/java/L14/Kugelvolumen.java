package L14;

public class Kugelvolumen {
	
	public static double berechneKugelvolumen(double radius) {
		if(radius<0) {
			throw new RuntimeException("NegativerRadius");
		}
		return 4.0/3.0*Math.PI*radius*radius*radius;
	}

}
