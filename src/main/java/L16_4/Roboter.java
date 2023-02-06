package L16_4;

public class Roboter extends Individuum implements Decide {
	
	@Override
	public Entscheidung entscheide(Gefahrensituation situation) {
		if(situation.reaktion=="rechts") return Entscheidung.RECHTS;
		if(situation.reaktion=="links") return Entscheidung.LINKS;
		if(situation.reaktion=="bremsen") return Entscheidung.BREMSEN;
		else {
			return Entscheidung.UNENTSCHIEDEN;
		}
	}




}
