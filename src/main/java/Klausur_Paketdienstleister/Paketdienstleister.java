package Klausur_Paketdienstleister;

public class Paketdienstleister {
	private double[] preise;
	private double maxGewicht;
	private double maxGroeße;
	private double[] gewichte;
	public Paketdienstleister(double[] preise,double[] gewichte, double maxGewicht, double maxGroeße) {
		this.maxGewicht=maxGewicht;
		this.preise=preise;
		this.maxGroeße=maxGroeße;
		this.gewichte = gewichte;
	}
	
	
	public double gibPreisFuerPacket(Paket p) {
		if(p.getGewicht()>maxGewicht || p.getGroeße()> maxGroeße) {
			throw new RuntimeException();
		}
		double pGewicht = p.getGewicht();
		if (pGewicht<=gewichte[0]) return preise[0];
		if (pGewicht>gewichte[0] && pGewicht<gewichte[1]) return preise[1];
		if (pGewicht>gewichte[1] && pGewicht<=gewichte[2]) return preise[2];
		return -1;
		
	}

}
