package L18_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javassist.bytecode.stackmap.TypeData.UninitThis;

public class Galgenmaenchen {
	private ArrayList<String> woertList = new ArrayList<>(); 
	private String word;
	private char[] kopie;
	private char[] wortArr;
	
	public Galgenmaenchen(String... arr) {
		woertList.addAll(Arrays.asList(arr));
		setWords();
	}
	
	private void setWords() {
		this.word=giveWord();
		this.wortArr = word.toCharArray();
		this.kopie   = new char[wortArr.length];
		for (int i = 0; i < kopie.length; i++) {
			kopie[i] = '_';
		}
	}
	private String giveWord() {
		int laenge= woertList.size();
		return woertList.get((int)(Math.random()*laenge));
	}
	
	
	public boolean checkInput(String s) {
		boolean treffer = false;
		char c = s.charAt(0);
		for(int i = 0;i<kopie.length;i++) {
			if(c==wortArr[i]) {
				kopie[i]=c;
				treffer=true;
			}
		}
		return treffer;
	}

	public ArrayList<String> getWoertList() {
		return woertList;
	}
	
	public char[] getKopie() {
		return kopie;
	}
	
	public char[] getWortArr() {
		return wortArr;
	}
	public String getWord() {
		return word;
	}
 
}
