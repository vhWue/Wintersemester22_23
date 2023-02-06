package L21_1;

public class Naehrstoffangaben {
	//pflicht
	private double portionsgroeße;
	private int anzahlPortionen;
	//optional
	private double mengeEiweiß;
	private double mengeFett;
	private double mengeCarbs;
	private double mengeNatrium;
	private Naehrstoffangaben(double portionsgroeße, int anzahlPortionen, double mengeEiweiß, double mengeFett,
			double mengeCarbs, double mengeNatrium) {
		this.portionsgroeße = portionsgroeße;
		this.anzahlPortionen = anzahlPortionen;
		this.mengeEiweiß = mengeEiweiß;
		this.mengeFett = mengeFett;
		this.mengeCarbs = mengeCarbs;
		this.mengeNatrium = mengeNatrium;
	}
	
	public static class AngabenBuilder {
		//pflicht
		private double portionsgroeße;
		private int anzahlPortionen;
		//optional
		private double mengeEiweiß;
		private double mengeFett;
		private double mengeCarbs;
		private double mengeNatrium;
		
		
		public AngabenBuilder(double portionsgroeße, int anzahlPortionen) {
			this.portionsgroeße=portionsgroeße;
			this.anzahlPortionen=anzahlPortionen;
		}
		
		public AngabenBuilder withEiweiß(double mengeEiweiß) {
			this.mengeEiweiß=mengeEiweiß;
			return this;
		}
		public AngabenBuilder withFett(double mengeFett) {
			this.mengeFett=mengeFett;
			return this;
		}
		public AngabenBuilder withCarbs(double mengeCarbs) {
			this.mengeCarbs=mengeCarbs;
			return this;
		}
		public AngabenBuilder withNatrium(double mengeNatrium) {
			this.mengeNatrium=mengeNatrium;
			return this;
		}
		
		public Naehrstoffangaben build() {
			return new Naehrstoffangaben(portionsgroeße, anzahlPortionen, mengeEiweiß, mengeFett, mengeCarbs, mengeNatrium);
		}	
	}
}
