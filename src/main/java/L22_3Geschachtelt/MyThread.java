package L22_3Geschachtelt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.Socket;
import java.util.Set;

//public class MyThread implements Runnable{
//	private Socket socket;
//	private ServerAnswer serverAnswer;
//	public MyThread(Socket socket) {
//		this.socket=socket;
//	}
//	
//	
//	@Override
//	public void run() {
//	
//		try (ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
//			 ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())) {
//			IntegerList iL = null;
//			Object obj = ois.readObject();
//			if(obj instanceof IntegerList) {
//				iL = (IntegerList) obj;
//			}
//			serverAnswer=new ServerAnswer();
//			for(Integer wert : iL.getList()) {
//				boolean isPrim = testeObPrimzahl(wert);
//				serverAnswer.getAnswer().put(wert, isPrim);
//			}
//			try {
//				Thread.sleep(10000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			oos.writeObject(serverAnswer);
//			oos.flush();
//			System.out.println("Neue Map gesendet");
//			
//			
//		} catch (IOException | ClassNotFoundException e) {
//			// TODO: handle exception
//		}
//	}
//	
//	
//	public boolean testeObPrimzahl(int zahl) {
//		if(zahl<2) return false;
//		for(int divisor = 2; divisor<zahl;divisor++) {
//			if(zahl%divisor==0) return false;
//		}
//		return true;
//	}
//	
//	public void ausgabe() {
//		Set<Integer> keySet = serverAnswer.getAnswer().keySet();
//		for (Integer key : keySet) {
//			System.out.println(key+" -> "+ serverAnswer.getAnswer().get(key));
//		}
//	}
//
//
//	public ServerAnswer getServerAnswer() {
//		return serverAnswer;
//	}
//	
//
//}
