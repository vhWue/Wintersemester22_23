package L14;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class KugelTest {

	@Test
	public void testVolumen_0() {
		assertEquals(0, Kugelvolumen.berechneKugelvolumen(0));
	}
	@Test
	public void testVolumen_1() {
		assertEquals(4.18879, Kugelvolumen.berechneKugelvolumen(1),0.0001);
	}
	@Test
	public void testVolumen_5() {
		assertEquals(523.599, Kugelvolumen.berechneKugelvolumen(5),0.001);
	}
	@Test
	public void testVolumen_Negativ() {
		try {
			assertEquals(null, Kugelvolumen.berechneKugelvolumen(-1));
			fail("Runtime Exception erwartet");
		}catch(RuntimeException e){
			String errorMessage = e.getMessage();
			assertEquals("NegativerRadius", errorMessage);
		}
	}

}
