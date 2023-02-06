package L14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	public void falschVorname() {
		try {
			Adresse adr = new Adresse("Musterstrasse5", "45a", "97080", "Würzburg");
			Person p = new Person("gustav", "Mustermann", adr);
			fail("Runtime Excetion erwartet");
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			assertEquals("FalscheEingabe", errorMessage);
		}
	}
	@Test
	public void falschStrasse() {
		try {
			Adresse adr = new Adresse("musterstrasse5", "45a", "97080", "Würzburg");
			Person p = new Person("Gustav", "Mustermann", adr);
			fail("Runtime Excetion erwartet");
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			assertEquals("FalscheEingabe", errorMessage);
		}
	}
	@Test
	public void falschOrt() {
		try {
			Adresse adr = new Adresse("Musterstrasse5", "45a", "97080", "würzburg");
			Person p = new Person("Gustav", "Mustermann", adr);
			fail("Runtime Excetion erwartet");
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			assertEquals("FalscheEingabe", errorMessage);
		}
	}
	@Test
	public void falschHausNr() {
		try {
			Adresse adr = new Adresse("Musterstrasse5", "b45a", "97080", "Würzburg");
			Person p = new Person("Gustav", "Mustermann", adr);
			fail("Runtime Excetion erwartet");
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			assertEquals("FalscheEingabe", errorMessage);
		}
	}
	@Test
	public void korrekt() {
	
			Adresse adr = new Adresse("Musterstrasse5", "45a", "97080", "Würzburg");
			Person p = new Person("Gustav", "Mustermann", adr);
			
	}

}
