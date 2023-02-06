package L15;

public class GeometrischeFigur {

	public static void main(String[] args) {
		Rechteck rechteck = new Rechteck(5, 5);
		Quader quader = new Quader(10, 5, 2);
		rechteck.berechneFlaeche();
		quader.berechneVolumen();
		
		GeometrischeFigur[] arr= new GeometrischeFigur[3];
		
		arr[0]=rechteck;
		arr[1]=quader;
		System.out.println(quader.berechneVolumen());
		System.out.println(arr[1]);
		
	}

}
