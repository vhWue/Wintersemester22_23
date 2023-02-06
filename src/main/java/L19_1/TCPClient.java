package L19_1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	private Socket socket;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private Scanner sc;

	public static void ausgabe(String str) {
		for(int i = 0; i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
	}

	public TCPClient(Socket socket){
		try {
			this.sc = new Scanner(System.in);
			this.socket=socket;
			this.input = new ObjectInputStream(socket.getInputStream());
			this.output = new ObjectOutputStream(socket.getOutputStream());
		} catch(IOException e){
			e.printStackTrace();
		}

	}
	public void startConnection() throws IOException, ClassNotFoundException {
			ServerAntwort startMsgFromServer = (ServerAntwort) input.readObject();
			System.out.print("Neues Wort :  ");
			ausgabe(startMsgFromServer.getStr());
		while(true) {  
				System.out.println("Ihre Nachricht an den Server: ");
				String msgToClient = sc.nextLine();
				if(msgToClient.length()<1) msgToClient=" ";
				ClientRateVersuch versuch = new ClientRateVersuch(msgToClient);
				output.writeObject(versuch);
				output.flush();
				if(msgToClient.equalsIgnoreCase("bye")) {
					System.out.println("Logged off");
					break;
				}
				ServerAntwort antwort = (ServerAntwort) input.readObject();
				if(antwort.isBeendet()) {
					System.out.println("Spiel beendet");
					System.out.println(antwort);
					System.out.print("Versuch "+ServerAntwort.getAnzahlVersuche()+" ");
					ausgabe(antwort.getStr());
					System.out.println("\nstarten sie das Programm neu um nochmal zu spielen");
					break;
				}
				System.out.println(antwort);
				System.out.print("Versuch "+ServerAntwort.getAnzahlVersuche()+" ");
				ausgabe(antwort.getStr());
				ServerAntwort.setAnzahlVersuche(1);
			}
		}

	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("localhost",5000);
		TCPClient client = new TCPClient(socket);
		try {
			client.startConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
