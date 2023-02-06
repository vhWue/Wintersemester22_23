package L20_3MultiMapDictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Dictionary {
	
	private Map<String, ArrayList<String>> dictionary = new HashMap<>();;

	public Map<String, ArrayList<String>> getDictionary() {
		return dictionary;
	}
	
	
	public void addToDictionary(String englishWord, String ...words) {
		ArrayList<String> gWordList = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			gWordList.add(words[i]);
		}	
		dictionary.put(englishWord, gWordList);
	}
	
	
	public void printDictionary() {
		Set<String> keySet = dictionary.keySet();
			for (String key : keySet) {
				System.out.println(key+" -> "+dictionary.get(key));
			}
	}
}
