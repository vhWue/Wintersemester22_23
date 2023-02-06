package L21_4;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		Exam exam = new Exam();
		
		try {
			exam.readQuestions("questions.csv")
			.toTest();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
