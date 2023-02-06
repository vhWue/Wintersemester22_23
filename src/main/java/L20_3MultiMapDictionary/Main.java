package L20_3MultiMapDictionary;


public class Main {
	
	public static void main(String[] args) {
		Dictionary woerterbuch = new Dictionary();
		
	woerterbuch.addToDictionary("to clean", "reinigen","säubern","putzen");
	woerterbuch.addToDictionary("to expand", "vergrößern","wachsen");
	
	
//	woerterbuch.printDictionary();
	
	MultiMap<String, String> buch = new MultiMap<>();
	
	buch.put("to clean", "reinigen");
	buch.put("to clean", "säubern");
	buch.ausgabe();
	
	
	}
	
	

}
