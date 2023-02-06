package L18_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MatrNrBefuellen {
	
	public static String createMatrNr() {
		
		int winf = 5000000;
		int inf  = 5100000;
		int ec   = 6100000;
		
		int anhang=(int)(Math.random()*99999+1);
		int zufall=(int)(Math.random()*3+1);
		switch (zufall) {
		case 1: return ""+(winf+anhang);
		case 2: return ""+(inf+anhang);
		case 3: return ""+(ec+anhang);
		default:
			return ""+(-1);
		}	
	}
	public static void main(String[] args) {
		
		try {
			FileWriter fileWriter = new FileWriter("Files/Studiengangssplitter/MatrNr.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			for(int i = 0; i<10;i++) {
				bufferedWriter.write(createMatrNr());
				bufferedWriter.newLine();
				bufferedWriter.flush();
			}
			bufferedWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
