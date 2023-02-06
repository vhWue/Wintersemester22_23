package L20_ausprobieren;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wildcards {
	
	public static void printList(List<?> list) {
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

	
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[] {"Haus","Garten","zimmer"});
		List<Integer> Integerlist = Arrays.asList(new Integer[] {1,2,3,4});
		
		
		printList(list);
		printList(Integerlist);
	}
}
