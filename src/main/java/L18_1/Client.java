package L18_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try (Socket socket = new Socket("localhost",5000);
			InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);){
			int counter=1;
			System.out.println(bufferedReader.readLine());
			while(true) {
				if(counter>10) break;
				String msgToServer = sc.nextLine();
				bufferedWriter.write(msgToServer);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				if(msgToServer.equalsIgnoreCase("bye")) {
					break;
				}
				String msg = bufferedReader.readLine();
				System.out.println("Server MSG: "+msg);	
				if(msg.equals("gewonnen")) break;
				counter++;
			}
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

}
