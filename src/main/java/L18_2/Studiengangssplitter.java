package L18_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Studiengangssplitter {
	
	
	
	public static boolean checkString(String str) {
		boolean korrekt=true;
		for(int i=0;i<str.length();i++) {
			if(!(str.charAt(i)>='0' && str.charAt(i)<='9')) {
				korrekt=false;
				break;
			}
		}
		return korrekt;
	}
	
	
	public static void splitStudiengaenge(String fileName) throws MatrikelnummerException, IOException{
			
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
			BufferedWriter writerWInf = new BufferedWriter(new FileWriter(Studiengaenge.WINF.studiengaenge));
			BufferedWriter writerInf = new BufferedWriter(new FileWriter(Studiengaenge.INF.studiengaenge));
			BufferedWriter writerEC = new BufferedWriter(new FileWriter(Studiengaenge.EC.studiengaenge)))
			{
				
				String matrNr;
				while((matrNr=bufferedReader.readLine()) != null) {
					if(matrNr.length()!=7 || matrNr.equals("")) {
						throw new MatrikelnummerException("Ungültige MatrNr: "+matrNr);
					}
					if(!checkString(matrNr)) {
						throw new MatrikelnummerException("Ungültige MatrNr: "+matrNr);

					}
					if(matrNr.startsWith("50")) {
						writerWInf.write(matrNr+"\n");
						writerWInf.flush();
					}else if(matrNr.startsWith("51")) {
						writerInf.write(matrNr+"\n");
						writerInf.flush();
					}else {					
						writerEC.write(matrNr+"\n");
						writerEC.flush();
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}

