package L21_4;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class ExamTest {

	@Test
	void testReadQuestions() {
		
		try {
			Exam e = new Exam();
			e.readQuestions("questions.csv");
			e.toTest();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	
	@Test
	void fileFound() {
		try {
			FileReader f = new FileReader("test.tex");
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
