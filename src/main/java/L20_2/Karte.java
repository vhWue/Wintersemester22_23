package L20_2;

public abstract class Karte  implements Comparable<Karte>{
	
	String blatt;
	int wert;
	int bildWert;
	public Karte(String blatt, int bildWert) {
		this.blatt=blatt;
		this.bildWert = bildWert;

	}
	
	
	
	@Override
	public int compareTo(Karte o) {
		
		if(this.wert<o.wert) return 1;
		else if(this.wert>o.wert) return -1;
		else {
			if(this.bildWert<o.bildWert) return 1;
			else if(this.bildWert>o.bildWert) return -1;
		}
		
		return 0;
	}
	
	public void ausgabe() {
		System.out.println(this.getClass().getSimpleName()+"  	"+blatt);
	}

}
