package L22_3_MultipleChatRoom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private ServerSocket serverSocket;
	
	public Server(ServerSocket ss) {
		this.serverSocket = ss;
	}
	
	public void startServer() {
		try {
			
			while(!serverSocket.isClosed()) {
				Socket socket = serverSocket.accept();
				System.out.println("A new Client has Connected");
				ClientHandler clientHandler = new ClientHandler(socket);
				
				Thread thread = new Thread(clientHandler);
				thread.start();
			}
		}catch(IOException e) {
			closeServerSocket();
		}
	}
	
	public void closeServerSocket() {
		try {
			if(serverSocket!=null) {
				serverSocket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void main(String[] args) throws IOException  {
		ServerSocket serverSocket = new ServerSocket(5000);
		Server server = new Server(serverSocket);
		server.startServer();
		
	}

}
