package L17_3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Zeitmessung {
	//Methode um bytes einzeln einzulesen --> inputstream greift für jedes byte aufs system zu
	static void ungepuffert(FileInputStream is, FileOutputStream os) throws IOException
	{
		int n;
		while((n=is.read())!=-1) {
			os.write(n);
		}
		is.close();
	}
	//standartmäßiger Buffered Stream
	static void BufferedcopyImproved(BufferedInputStream is, BufferedOutputStream os) throws IOException
	{
		int n;
		while((n=is.read())!=-1) {
			os.write(n);
		}
		is.close();
	}
	
	static void copy1024(FileInputStream is, FileOutputStream os) throws IOException
	{
		byte[] b = new byte[1024];
		int n;
		//n ist die länge des gelesen streams
		while((n=is.read(b))!=-1) {
			os.write(b,0,n);
		}
		is.close();	
	}
	
	
	public static void createStreams(String musikdatei, String copy) {
		try {
			FileInputStream fis = new FileInputStream(musikdatei);
			FileOutputStream fos = new FileOutputStream(copy);
			try {
				ungepuffert(fis, fos);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
//		byteweise Ausgabe mit ungepuffertem Stream
		String musikDatei ="GettingAlong.mp3";
		String copy = "Files/dasIstDieNeueMusikdatei.mp3";
		long duration;
			long startTime = System.currentTimeMillis();
			createStreams(musikDatei, copy);
			long endTime = System.currentTimeMillis();
			duration = endTime-startTime;
	System.out.println(duration);
	
	System.out.println("Ausgabe x10 gebpuffert");
//		Ausgabe mit gepuffertem Stream 10x mal
		for(int i = 0; i<10;i++) {
		try (FileInputStream fis = new FileInputStream("GettingAlong.mp3");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("Files/BufferedGettingAlong.mp3");
			BufferedOutputStream bos = new BufferedOutputStream(fos)) 
			{
			
				long start= System.currentTimeMillis();
				BufferedcopyImproved(bis, bos);
				long end = System.currentTimeMillis();
				long zeit = end-start;
				System.out.println(zeit);
			} catch (IOException e) {
				e.printStackTrace();		
		}		
	}
		
		System.out.println("Ausgabe mit byte array[1024]");
// 		Ausgabe mit byte[1024] ungepuffert
		try(FileInputStream is = new FileInputStream("GettingAlong.mp3");
				FileOutputStream os = new FileOutputStream("Files/Copy_1024.mp3")) {
			
			long start = System.currentTimeMillis();
			copy1024(is, os);
			long end = System.currentTimeMillis();
			long dauer = end-start;
			System.out.println(dauer);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
