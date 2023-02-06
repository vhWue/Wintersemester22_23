package L15_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	public static void main(String[] args) {
		Angestellter angestellter= new Angestellter("12345", "Müller", "Peter", "6.07.1950", 20000);
		Angestellter angestellter2= new Abteilungsleiter("21345", "Müller", "Peter", "6.07.1950", 20000);
//	
//		System.out.println(angestellter2);
//		Abteilungsleiter.befoerden(angestellter2);
		((Abteilungsleiter) angestellter2).befoerden(angestellter2);
//		Abteilungsleiter neu = (Abteilungsleiter) angestellter2;
//		neu.befoerden(angestellter2);
//		System.out.println();
//		System.out.println(angestellter2);
//		Abteilungsleiter.befoerden(angestellter2);
//		System.out.println();
//		System.out.println(angestellter2);
		
	}
	
	@Test
	void testGrundFaktor() {
		Angestellter angestellter= new Angestellter("12345", "Müller", "Peter", "6.07.1950", 20000);
		Angestellter abteilungsleiter= new Abteilungsleiter("21345", "Müller", "Peter", "6.07.1950", 20000);
		assertTrue(angestellter.faktor==1.0);
		assertTrue(abteilungsleiter.faktor==2.0);
		assertTrue(angestellter.gehalt==20000);
		assertTrue(abteilungsleiter.gehalt==40000);
		
	}
	@Test
	void testBefoerderung() {
		Angestellter angestellter= new Angestellter("12345", "Müller", "Peter", "6.07.1950", 20000);
		Angestellter abteilungsleiter= new Abteilungsleiter("21345", "Müller", "Peter", "6.07.1950", 20000);
		Abteilungsleiter.befoerden(angestellter);
		Abteilungsleiter.befoerden(abteilungsleiter);
		assertTrue(angestellter.faktor==1.1);
		assertTrue(abteilungsleiter.faktor==2.2);
		assertTrue(angestellter.gehalt==22000);
		assertTrue(abteilungsleiter.gehalt==88000);
		
	}
	@Test
	void testNegativesGrundgehalt() {
		try {
			Angestellter angestellter= new Angestellter("12345", "Müller", "Peter", "6.07.1950", -10);
			Angestellter abteilungsleiter= new Abteilungsleiter("21345", "Müller", "Peter", "6.07.1950", -10);
			fail("Exception erwartet");
		} catch (Exception e) {
			String errorMessage= e.getMessage();
			assertEquals("Negatives Grundgehalt", errorMessage);
		}
	}

}
