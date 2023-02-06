package L20_3SimpleMapDictionary;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Vokabeltrainer {
	
	Map<String, String> english2German = new HashMap<>();
	private String wordToGuess;
	
	public String getWordToGuess() {
		return wordToGuess;
	}
	
	public boolean guess(String guess) {
		String solution= english2German.get(wordToGuess);
		if(guess.equals(solution)) {
			return true;
		}
		return false;
	}
	
	
	public void addToDictionary(String englishWord, String germanWord) {
		english2German.put(englishWord, germanWord);
	}
	
	public void createRandomWordToGuess() {
		Set<String> keySet = english2German.keySet();
		int randomIndex = (int)(Math.random()*keySet.size());
		Iterator<String> iterator  = keySet.iterator();
		int i = 0;
		
		while(iterator.hasNext()) {
			String word = iterator.next();
			if(i==randomIndex) {
				wordToGuess=word;
				return;
			}
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		Vokabeltrainer guessingGame = new Vokabeltrainer();
		
		guessingGame.addToDictionary("to count", "zaehlen");
		guessingGame.addToDictionary("car", "auto");
		guessingGame.addToDictionary("to clean", "reinigen");
		guessingGame.addToDictionary("to expand", "vergrößern");
		
		System.out.println(guessingGame.english2German);
		
		guessingGame.createRandomWordToGuess();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Was heißt ["+ guessingGame.getWordToGuess()+"] auf Deutsch?");
		
	}

}
