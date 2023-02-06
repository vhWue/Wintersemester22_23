package L22_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	private ServerSocket serverSocket;
	
	public TCPServer(ServerSocket serverSocket) {
		this.serverSocket=serverSocket;
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
	
	public void startServer() {
		try {
			while(!serverSocket.isClosed()) {
				Socket socket =serverSocket.accept();
				System.out.println("A new Client has Connected");
				MyThread handler = new MyThread(socket);
				Thread t = new Thread(handler);
				t.start();
				
			}
		} catch (IOException e) {
			closeServerSocket();
		}
	}
	
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(5000);
		TCPServer server = new TCPServer(serverSocket);
		server.startServer();
	}

}
