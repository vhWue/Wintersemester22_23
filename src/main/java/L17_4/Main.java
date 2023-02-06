package L17_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
	public static void main(String[] args) throws IOException {
		
		
		try {
			FileOutputStream eins = new FileOutputStream("file1.txt");
			FileOutputStream zwei = new FileOutputStream("file2.txt");
			OutputStreamDoubler doubler = new OutputStreamDoubler(eins, zwei);
			FileInputStream is=new FileInputStream("BeispielText.txt");
			doubler.setIs(is);
			
			try {
				int n;					
				while((n=doubler.getIs().read())!=-1) {
					doubler.write(n);	
				}
				System.out.println("Ist closed ["+doubler.isEins()+"] Ist closed ["+doubler.isZwei()+"]");	
				doubler.close();
				
				System.out.println("Ist closed ["+doubler.isEins()+"] Ist closed ["+doubler.isZwei()+"]");
			} catch (IOException e) {
				System.out.println(e);
				System.out.println("Ist closed ["+doubler.isEins()+"] Ist closed ["+doubler.isZwei()+"]");
				
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
		
	}

}
