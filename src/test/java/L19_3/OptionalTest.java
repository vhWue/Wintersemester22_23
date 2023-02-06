package L19_3;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class OptionalTest {

	@Test 
	void FalseURL() {
	Browser browser = new Browser("htp://google.de");
	Optional<URL> back = browser.back();
	assertEquals(true, back.isEmpty() );
	}
	
	@Test
	void KorrektURL() {
		Browser browser = new Browser("http://google.de");
		Optional<URL> back = browser.back();
		assertEquals(true, back.isPresent() );
	}

}
