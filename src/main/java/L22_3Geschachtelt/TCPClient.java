
package L22_3Geschachtelt;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TCPClient {
	private IntegerList iList;
	private Socket socket;

	public IntegerList getiList() {
		return iList;
	}
	
	public TCPClient(IntegerList iList,Socket socket) {
		this.iList=iList;
		this.socket=socket;
	}
	
	public List<Integer> getListValues(){
		return iList.getList();
	}
	
	public void starteUebertragung() {
		ServerAnswer incomingAnswer = null;
		try (ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())) {
			
			oos.writeObject(iList);
			oos.flush();
			Object obj = ois.readObject();
			if(obj instanceof ServerAnswer) {
				incomingAnswer= (ServerAnswer) obj;
			}
			incomingAnswer.ausgabe();
			System.out.println("übertragung fertig");
			
			
		} catch (IOException e) {
			// TODO: handle exception
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		List<Integer> newList = Arrays.asList(new Integer[] {1,2,3,4,5,6});
		Socket socket = new Socket("localhost",5000);
		TCPClient c1 = new TCPClient(new IntegerList(newList),socket);
		c1.starteUebertragung();
		
	}
}
