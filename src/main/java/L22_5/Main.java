package L22_5;

import L22_5.Baum.Knoten;

public class Main {
	
	public static void main(String[] args) {
		Knoten<String> k1 = new Knoten<>("hallo");
		Baum<String> tree = new Baum<>();
		tree.einfuegen(k1);
		tree.einfuegen(new Knoten<>("das"));
		tree.einfuegen(new Knoten<>("ist"));
		tree.einfuegen(new Knoten<>("ist"));
		
		System.out.println(tree.size());
		
	}

}
