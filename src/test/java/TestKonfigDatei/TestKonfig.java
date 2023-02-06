package TestKonfigDatei;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

import Klausur_KonfigDatei.Konfigurator;

class TestKonfig {

	@Test
	void test() {
		try {
			Map<String,String> map = Konfigurator.createMap();
			String s ="";
			String s2 = "";
			Set<String> keySet = map.keySet();
			for (String key : keySet) {
				if(key.equals("mail.transport.protocol")) {
					s+=key+map.get(key);
				}
				if(key.equals("password")) {
					s2+=key+map.get(key);
					
				}
			}
			assertEquals("password=K[O8a}5#", s2);
			assertEquals("mail.transport.protocol=smtp", s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
