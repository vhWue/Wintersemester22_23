package L16_4;

public class Mensch extends Individuum implements Decide {

	@Override
	public Entscheidung entscheide(Gefahrensituation situation) {
		if((Math.random())<=0.25) {
			return Entscheidung.UNENTSCHIEDEN;
		}
		if(situation.reaktion=="rechts") return Entscheidung.RECHTS;
		if(situation.reaktion=="links") return Entscheidung.LINKS;
		if(situation.reaktion=="bremsen") return Entscheidung.BREMSEN;
		return null;
	}
}
