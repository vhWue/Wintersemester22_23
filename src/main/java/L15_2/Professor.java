package L15_2;

public class Professor extends Person{

	public Professor(String taetigkeit) {
		super(taetigkeit);
	}
	
	@Override
	public String gibTaetigkeitAus() {
		return "Der Professor unterrichtet "+taetigkeit;
	}
	

}
