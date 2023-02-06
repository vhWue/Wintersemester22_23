package L15_2;

public class Student extends Person{

	public Student(String taetigkeit) {
		super(taetigkeit);
	}

	@Override
	public String gibTaetigkeitAus() {
		return "Der Student besucht das Fach "+taetigkeit;
	}
	

}
