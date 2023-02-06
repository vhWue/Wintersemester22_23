package L21_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Exam {
	
	private ArrayList<Question> list;
	
	public ArrayList<Question> getList() {
		return list;
	}
	
	public Exam() {
		list = new ArrayList<>();
	}
	
//	String readHeaderFromFile() {
//		return fileName;
//	}
//	
	
	
	
	public Exam readQuestions(String csvFile) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(csvFile));
		do {
			String line = br.readLine();
			if(line==null) break;
			list.add(Question.toQuestion(line));
		} while (true);
		
		br.close();
		
		return this;
	}
	
	public void toTest() throws IOException{
		File f = new File("test.tex");
		BufferedWriter br = new BufferedWriter(new FileWriter(f));
		Iterator<Question> iterator = list.iterator();
		br.write("\\documentclass[NeuerVersuch]{article}\n");
		br.write("\\begin{document}\n");
		while(iterator.hasNext()) {
			String line = iterator.next().getText();
			br.write("\\textbf{"+line+"}\\\\");
			br.newLine();
			br.flush();
		}
		br.write("\\end{document}");
		br.flush();
		br.close();
	}

}
