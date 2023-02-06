package L15_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	Person[] person = new Person[100];
	
	@Test
	void test() {
		Person[] person = new Person[2];
		String fach= "Programmieren";
		person[0]=new Professor(fach);
		person[1]=new Student(fach);
		assertEquals("Der Professor unterrichtet "+fach, person[0].gibTaetigkeitAus());
		assertEquals("Der Student besucht das Fach "+fach, person[1].gibTaetigkeitAus());
	}
	
	@Test void klassenTest() {
		int counter=0;
		String fach= "Programmieren";
		for (int i = 0; i < person.length; i++) {
			if(i%2==0) {
				person[i]= new Professor(fach);
			}else {
				person[i]=new Student(fach);
			}
			person[i].gibTaetigkeitAus();
		}
		for (int i = 0; i < person.length; i++) {
			if(person[i].getClass()==Student.class) {
				counter++;
			}
		}
		assertEquals(50, counter);
	}

}
