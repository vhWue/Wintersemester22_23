package L22_3_MultipleChatRoom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler implements Runnable {
	private Socket socket;
	public static ArrayList<ClientHandler> clientHandlers = new ArrayList<>();
	private BufferedReader bufferedReader;
	private BufferedWriter bufferedWriter;
	private String clientUserName;
	
	
	public ClientHandler(Socket socket) {
		try {
			this.socket = socket;
			this.bufferedWriter= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			this.clientUserName = bufferedReader.readLine();
			clientHandlers.add(this);
			broadcastMessage("Server: "+clientUserName+" has entered the chat!");
		} catch (IOException e) {
			closeEverything(socket,bufferedReader,bufferedWriter);
		}
	}
	
	
	
	@Override
	public void run() {
		String msgFromClient;
		
		while(socket.isConnected()) {
			try {
				msgFromClient = bufferedReader.readLine();
				broadcastMessage(msgFromClient);
			} catch (IOException e) {
				closeEverything(socket,bufferedReader,bufferedWriter);
				break;
			}
		}
	}
	
	public void broadcastMessage(String msg) {
		for (ClientHandler client : clientHandlers) {
			try {
				if(!client.clientUserName.equals(clientUserName)) {
					client.bufferedWriter.write(msg);
					client.bufferedWriter.newLine();
					client.bufferedWriter.flush();
				}
			} catch (IOException e) {
				closeEverything(socket,bufferedReader,bufferedWriter);
			}
		}
	}
	
	public void removeClientHandler() {
		clientHandlers.remove(this); //remove current client
		broadcastMessage("Server: "+clientUserName+ " has left the chat");
	}
	
	public void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
		removeClientHandler();
		try {
			if(bufferedReader!=null) bufferedReader.close();
			if(bufferedWriter!=null) bufferedReader.close();
			if(socket!=null) socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
