package L20_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MultiMap {
	
	private HashMap<String, ArrayList<Character>> sms = new HashMap<>();

	public HashMap<String, ArrayList<Character>> getSms() {
		return sms;
	}
	
	public MultiMap() {
		addToHandy("2", "ABC");
		addToHandy("3", "DEF");
		addToHandy("4", "GHI");
		addToHandy("5", "JKL");
		addToHandy("6", "MNO");
		addToHandy("7", "PQRS");
		addToHandy("8", "TUV");
		addToHandy("9", "WXYZ");
	}
	
	
	public void addToHandy(String number, String letter) {
		char[] arr = letter.toCharArray();
		ArrayList<Character> letterList = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			letterList.add(arr[i]);
		}
		sms.put(number, letterList);
	}
	
	public void printSmSContainer() {
		Set<String> keySet = sms.keySet();
		
		for (String key : keySet) {
			System.out.println(key+" -> "+sms.get(key));
		}
	}
	
	public String checkForCharacter(char gesucht) {
		Set<String> keySet = sms.keySet();  //Set das Alle keys vom Attribut <sms> enthält;
		for (String key : keySet) {
			for(int i = 0;i<sms.get(key).size();i++) { //so lange wie die länge der value arraylist des aktuellen keys beträgt
				if(sms.get(key).get(i)==gesucht) { // true wenn die aktuelle arraylist den gesuchten Character enthält
					return String.valueOf(key);
				}
			}
		}
		
		return "0";
	}
	
	
	public String checkCompleteString(String str) throws IllegalTelephoneNumberException  {
		char[] charArr = str.toCharArray();
		String rueckgabeString="";
		
		for (int i = 0; i < charArr.length; i++) {
			rueckgabeString+=checkForCharacter(charArr[i]);
		}
		if(rueckgabeString.contains("0")) {
			throw new IllegalTelephoneNumberException("ungueltige Telefonnummer "+rueckgabeString);
		}
		return rueckgabeString;
		
		
	}
	

}
