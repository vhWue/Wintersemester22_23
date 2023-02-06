package L23_Versuche;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GenericMethod {
	
	public static <A extends Comparable<A>> A max(Collection<A> xs){
		Iterator<A> neu = xs.iterator();
		A w = neu.next();
		while(neu.hasNext()) {
			A x = neu.next();
			if(w.compareTo(x)<0) w=x;
		}
		return w;
	}
	
	public static void printInteger(int...is ) {
		for (int i = 0; i < is.length; i++) {
			System.out.println(is[i]);
		}
	}

	
	public static void main(String[] args) {
		
		printInteger(1,2,3,4,5);
	}
}
