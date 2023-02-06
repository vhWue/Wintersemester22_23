package L19_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import L18_1.Galgenmaenchen;
public class TCPServer {
	
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	public TCPServer(Socket clientSocket) {
		try {
			this.oos=new ObjectOutputStream(clientSocket.getOutputStream());
			this.ois = new ObjectInputStream(clientSocket.getInputStream());
			System.out.println("Client connected");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void schreibe(ObjectOutputStream oos, Object o) throws IOException{
		oos.writeObject(o);
		oos.flush();
	}
	
	public void startConnetiontoClient(Galgenmaenchen g) throws IOException, ClassNotFoundException{
		ServerAntwort startMessage = new ServerAntwort();
		startMessage.setStr(String.valueOf(g.getKopie()));
		schreibe(oos, startMessage);
		while(true) {
			ClientRateVersuch client =(ClientRateVersuch) ois.readObject();
			if (client.rateVersuch.equalsIgnoreCase("bye")) {
				System.out.println("Client disconnected");
				break;
			}
			ServerAntwort antwort = new ServerAntwort();
			boolean treffer = g.checkInput(client.rateVersuch);
			if(treffer) antwort.setTreffer(true);
			
			String s= String.valueOf(g.getKopie());
			antwort.setStr(s);
			
			if(ServerAntwort.getAnzahlVersuche()==10) {
				if(!s.equals(g.getWord())) {
					antwort.setAntworten(false, true);
					schreibe(oos, antwort);
					break;
				}
			}
			if(s.equals(g.getWord())) {
				antwort.setAntworten(true, true);
				schreibe(oos, antwort);
				break;
			}
			schreibe(oos, antwort);
			ServerAntwort.setAnzahlVersuche(1);
		}
		ServerAntwort.setAnzahlVersuche(0);
	}
	
	public static void main(String[] args) throws IOException{
		ServerSocket serverSocket=new ServerSocket(5000);
			while(true) {
				try {
					Socket client = serverSocket.accept();
					TCPServer server = new TCPServer(client);
					server.startConnetiontoClient(new Galgenmaenchen("Haus","Garten","zimmer","Fernseher"));
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} 
			}					
	} 
}

