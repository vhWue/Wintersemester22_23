package muenzautomat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BetterChangeCalculatorTest {
	BetterChangeCalculator calculator = new BetterChangeCalculator();
	@Test
	void NegativeEuroTest() {
		try {
			calculator.getChange(-1, 50);
			fail("Exception erwartet");
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			assertEquals("Negativer Euro Betrag", errorMessage);
		}
	}
	@Test
	void NegativeCentTest() {
		try {
			calculator.getChange(1, -50);
			fail("Exception erwartet");
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			assertEquals("Negativer Cent Betrag", errorMessage);
		}
	}
	@Test
	void CentBetragZuHoch() {
		try {
			calculator.getChange(1, 100);
			fail("Exception erwartet");
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			assertEquals("Cent Betrag groeßer als 99", errorMessage);
		}
	}
	
	@Test
	void calculatorTest() {
		
		int[] betrag_Eins = calculator.getChange(0, 0);
		int[] betrag_Zwei = calculator.getChange(9, 99);
		int[] betrag_Drei = calculator.getChange(4, 86);
		int[] betrag_Vier = calculator.getChange(3, 45);
		int[] betrag_Fuenf = calculator.getChange(1, 98);
		int[] betrag_Sechs = calculator.getChange(0, 2);
		
		//Vergleichswerte
		int[] rueckgabe_Eins= {0,0,0,0,0,0,0,0};
		int[] rueckgabe_Zwei= {0,2,1,0,2,1,1,4};
		int[] rueckgabe_Drei= {1,0,1,1,1,1,0,2};
		int[] rueckgabe_Vier= {0,0,1,0,2,0,1,1};
		int[] rueckgabe_Fuenf= {1,1,1,0,2,1,1,0};
		int[] rueckgabe_Sechs= {0,1,0,0,0,0,0,0};
		for (int i = 0; i < 8; i++) {
			assertEquals(rueckgabe_Eins[i], betrag_Eins[i]);			
			assertEquals(rueckgabe_Zwei[i], betrag_Zwei[i]);			
			assertEquals(rueckgabe_Drei[i], betrag_Drei[i]);			
			assertEquals(rueckgabe_Vier[i], betrag_Vier[i]);			
			assertEquals(rueckgabe_Fuenf[i], betrag_Fuenf[i]);			
			assertEquals(rueckgabe_Sechs[i], betrag_Sechs[i]);			
		}
	}

}
