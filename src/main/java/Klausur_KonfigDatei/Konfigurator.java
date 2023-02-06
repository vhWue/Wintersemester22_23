package Klausur_KonfigDatei;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Konfigurator {
	
	public static List<String> liesKonfigurationsdatei() throws IOException{
		List<String> l = Arrays.asList("mail.transport.protocol=smtp","mail.smtp.port=465","mail.smtp.auth=true","mail.smtp.ssl.enable=true",
				"from=hallowelt@gmx.de","user=hallowelt@gmx.de","mail.smtp.host=smtp.gmx.de","password=K[O8a}5#");
		return l;
	}
	
	public static Map<String, String> createMap() throws IOException{
		Map<String, String> map = new HashMap<>();
		List<String> l = liesKonfigurationsdatei();
		
		for(String zeile : l) {
//			String[] arr = zeile.split("=");
//			map.put(arr[0], arr[1]);
			int index = zeile.indexOf('=');
			String davor = zeile.substring(0, index);
			String danach = zeile.substring(index);
			map.put(davor, danach);
 		}
		return map;
	}
	
	public static void ausgabe(Map<String, String> map) {
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key+""+map.get(key));
		}
	}
	
	public static void main(String[] args) throws IOException {
		Map<String, String> map = Konfigurator.createMap();
		ausgabe(map);
	}

}
