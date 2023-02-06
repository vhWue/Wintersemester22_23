package L17_1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exceptions {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			String str= "afg";
			int x = Integer.valueOf(str);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		
		String[] arr = {"Peter","Müller"};
		try {
			System.out.println(arr[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		
		try {
			
			Car.printCar(null);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		
		try {
			FileInputStream fis = new FileInputStream("pic.jpg");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		try {
			int x=5;
			int y=0;
			int ergebnis = x/y;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		
		List<byte[]> list = new LinkedList<>();   
		try {
		    while (true) 
			    {
			        byte[] b = new byte[10 * 1024 * 1024]; // 10MB byte object
			        list.add(b);
			    }
		} catch (OutOfMemoryError e) {
			System.out.println(e);
		}
	}	
}	
	
	
	
	
	


