package L20_4;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SMS_Test {
	BufferedReader br = null;
	@BeforeEach
	void prepareTest() {
		try {
			br = new BufferedReader(new FileReader("Zeichenkontakte.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	@Test
	void testReader() {
		ArrayList<String> expectedInhalt = new ArrayList<>();
		expectedInhalt.add("FAKUKLTAETFIW");
		expectedInhalt.add("HAUS");
		expectedInhalt.add("GARTEN");
		expectedInhalt.add("AUTO");		
		ArrayList<String> actualInhalt  = new ArrayList<>();
		do {
			try {
				String line = br.readLine();
				if(line==null) break;
				actualInhalt.add(line);
			} catch (IOException e) {
				e.printStackTrace();
			}		
		} while (true);
		assertEquals(expectedInhalt, actualInhalt);
	}
	
	@Test
	void testException() {
		MultiMap handy = new MultiMap();
		try {
			String zeichenKontakt = "FAKULTÄT";
			handy.checkCompleteString(zeichenKontakt);
			fail("Exception erwartet");
		} catch (IllegalTelephoneNumberException e) {
			String errorMessage = e.getMessage();
			assertEquals("ungueltige Telefonnummer "+32585808,errorMessage);
		}
	}
}
