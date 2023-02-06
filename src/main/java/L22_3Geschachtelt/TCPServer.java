package L22_3Geschachtelt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Set;

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
	
	
	static class MyThread implements Runnable{
		private Socket socket;
		private ServerAnswer serverAnswer;
		
		public MyThread(Socket socket) {
			this.socket=socket;
		}
		public ServerAnswer getServerAnswer() {
			return serverAnswer;
		}
		
		public boolean testeObPrimzahl(int zahl) {
			if(zahl<2) return false;
			for(int divisor = 2; divisor<zahl;divisor++) {
				if(zahl%divisor==0) return false;
			}
			return true;
		}
		
		public void ausgabe() {
			Set<Integer> keySet = serverAnswer.getAnswer().keySet();
			for (Integer key : keySet) {
				System.out.println(key+" -> "+ serverAnswer.getAnswer().get(key));
			}
		}
		@Override
		public void run() {
			try (ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				 ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())) {
				IntegerList iL = null;
				Object obj = ois.readObject();
				if(obj instanceof IntegerList) {
					iL = (IntegerList) obj;
				}
				serverAnswer=new ServerAnswer();
				for(Integer wert : iL.getList()) {
					boolean isPrim = testeObPrimzahl(wert);
					serverAnswer.getAnswer().put(wert, isPrim);
				}
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				oos.writeObject(serverAnswer);
				oos.flush();
				System.out.println("Neue Map gesendet");
				
				
			} catch (IOException | ClassNotFoundException e) {
				// TODO: handle exception
			}
		}
	
		
	}
	
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(5000);
		TCPServer server = new TCPServer(serverSocket);
		server.startServer();
	}

}
