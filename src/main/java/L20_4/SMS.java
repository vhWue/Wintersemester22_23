package L20_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class SMS {
	
	public static void main(String[] args) {
		MultiMap neuesHandy = new MultiMap();

		neuesHandy.printSmSContainer();
	
		
		try (FileReader fileReader = new FileReader("Zeichenkontakte.txt");
			 BufferedReader bufferedReader = new BufferedReader(fileReader);
			 FileWriter fileWriter = new FileWriter("Nummernkontakte.txt");
			 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))	{
			
			do {
				String line = bufferedReader.readLine();
				if(line ==null) break;
				try {
					String nummer = neuesHandy.checkCompleteString(line);
					bufferedWriter.write(nummer);
					bufferedWriter.newLine();
					bufferedWriter.flush();
					
				} catch (IllegalTelephoneNumberException e) {
					System.out.println(e.getMessage());
				}
				
				
			} while (true);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
