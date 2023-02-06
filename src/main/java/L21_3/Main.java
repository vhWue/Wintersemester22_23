package L21_3;

import L21_3.Tree.Element;

public class Main {
	
	public static void main(String[] args) {
		Tree<String> baum = new Tree<>();
		baum.einfuegen(new Element<>("Cool"));
		baum.einfuegen(new Element<>("Zylla"));
		baum.einfuegen(new Element<>("Garrett"));
		baum.einfuegen(new Element<>("Aaronson"));
		
		baum.ausgabe();
		
		
	}

}
