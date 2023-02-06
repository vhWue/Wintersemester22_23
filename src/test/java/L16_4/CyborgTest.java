package L16_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Counter;

class CyborgTest {
	Roboter roboter = new Roboter();
	Mensch mensch = new Mensch();
	Cyborg cyborg = new Cyborg();
	double wiederholungen=1000000;
	
	@Test
	void testMensch() {
		for(int i = 0; i<wiederholungen;i++) {
			if(mensch.entscheide(Gefahrensituation.GEFAHR_LINKS)==Entscheidung.UNENTSCHIEDEN) {
				mensch.counter++;
			}else {
				mensch.gegenCounter++;
			}
		}
		assertEquals(0.25, mensch.counter/wiederholungen,0.01);
		assertEquals(0.75, mensch.gegenCounter/wiederholungen,0.01);
	}
	@Test
	void testRoboter() {
		for(int i = 0; i<wiederholungen;i++) {
			if(roboter.entscheide(Gefahrensituation.GEFAHR_RECHTS)==Entscheidung.UNENTSCHIEDEN) {
				roboter.counter++;
			}else {
				roboter.gegenCounter++;
			}
		}
		assertEquals(0, roboter.counter);
		assertEquals(1.0, roboter.gegenCounter/wiederholungen,0.01);
	}
	@Test
	void testCyborg() {
		for (int i = 0; i < wiederholungen; i++) {
			if(cyborg.entscheide(Gefahrensituation.GEFAHR_LINKS)==Entscheidung.UNENTSCHIEDEN) {
				cyborg.counter++;
			}else {
				cyborg.gegenCounter++;
			}
		}
		
		assertEquals(0.125, cyborg.counter/wiederholungen,0.01);
		assertEquals(0.875, cyborg.gegenCounter/wiederholungen,0.01);
	}

}
