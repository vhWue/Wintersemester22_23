package L16_4;

public enum Gefahrensituation {
	GEFAHR_LINKS("rechts"),
	GEFAHR_RECHTS("links"),
	GEFAHR_VORNE("bremsen");
	String reaktion;
	
	Gefahrensituation(String reaktion) {
		this.reaktion=reaktion;
	}
	

}
