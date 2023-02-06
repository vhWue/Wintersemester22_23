package L16_4;

public class Cyborg extends Individuum implements Decide{

	Mensch mensch = new Mensch();
	Roboter roboter = new Roboter();
	@Override
	public Entscheidung entscheide(Gefahrensituation situation) {
		Entscheidung m = mensch.entscheide(situation);
		Entscheidung r = roboter.entscheide(situation);
		
		if(!(m.equals(r))) {
			if(Math.random()<=0.5) return m;
			else return r;
		}
		else {
			return m;
		}
	}

}
