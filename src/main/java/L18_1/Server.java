package L18_1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.print.attribute.standard.Severity;

public class Server {
	
	private BufferedReader input;
	private BufferedWriter output;
	public Server(Socket socket) {
		try {
			this.input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			this.output=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			System.out.println("Client connceted");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clientCommunication(Galgenmaenchen g) throws IOException 
	{
		int versuche = 1;
		
		String space = addSpace(String.valueOf(g.getKopie()));
		schreibe(output, space);
		while(true) 
		{
			String msgFromClient = getInput().readLine();
			if(msgFromClient.equalsIgnoreCase("bye")) { //verlässt innere while_schleife
				System.out.println("Client left");
				break;
			}
			g.checkInput(msgFromClient);
			
			String s = String.valueOf(g.getKopie());
			space= addSpace(s);
			if(s.equals(g.getWord())) {  //verlässt die while Schleife wenn der Spieler gewonnen hat
				schreibe(output, space +"   gewonnen");
				break;
			}
			if(versuche==10) 
			{
				if(!s.equals(g.getWord())) 
				{
					schreibe(output, "Verloren, das Wort war: "+g.getWord());
					break;
				}
			}
				schreibe(output, space);	
				versuche++;
		}
	}
	
	public static void ausgabe(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void schreibe(BufferedWriter bw, String msg) throws IOException {
		bw.write(msg);
		bw.newLine();
		bw.flush();
	}
	
	public static String addSpace(String str) {
		String s = "";
		for (int i = 0; i <str.length(); i++) {
			s+=str.charAt(i)+" ";
		}
		return s;
	}

	public BufferedReader getInput() {
		return input;
	}
	
	public BufferedWriter getOutput() {
		return output;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(5000);
		
		while(true) {
			Socket client = ss.accept();
			Server server = new Server(client);
			server.clientCommunication(new Galgenmaenchen("Haus","Garten","zimmer","Fenster","Auto","Exam","Lexikon"));
		}
		
		
	
	}	

	
	
}	

