package L18_3;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToUpperCaseWriterTest {

	toUpperCaseWriter writer;
	ByteArrayOutputStream baos;
	

	
	public void compare(String expected, char c) {
		try {
			writer.write(c);
			writer.flush();
			String uppercase = baos.toString();
			assertEquals(expected, uppercase);
		} catch (IOException e) {
			fail("IOException: "+e.getMessage());
		}
	}
	
	
	@BeforeEach
	public void prepareTest() {
		baos=new ByteArrayOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(baos);
		writer = new toUpperCaseWriter(osw);
	}
	@AfterEach
	public void cleanUp() {
		try {
			writer.close();
		}catch(IOException e)
		{
			fail("IOException: "+e.getMessage());
		}
	}
	
	@Test
	void writeCharTest() {
		compare("A", 'a');
	}
	@Test
	void writeNumberTest() {
		compare("1", '1');
	}
	
	@Test
	void alphabetToUpperCase() {
		char c = 0;
		char vergleich = 0;
		String anhang="";
		for (int i = 0; i < 128; i++) {
			anhang+=vergleich;
			String groß= anhang.toUpperCase();
			compare(groß, c);
			c++;
			vergleich++;
			
		}
	}

}
