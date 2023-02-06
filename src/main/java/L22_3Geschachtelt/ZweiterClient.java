package L22_3Geschachtelt;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public class ZweiterClient {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		List<Integer> newList2 = Arrays.asList(new Integer[] {10,20,36,43,15,69,375429123});
		Socket socket = new Socket("localhost",5000);
		TCPClient c2 = new TCPClient(new IntegerList(newList2),socket);
		
		c2.starteUebertragung();
	}

}
