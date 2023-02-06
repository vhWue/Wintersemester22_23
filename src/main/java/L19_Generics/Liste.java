package L19_Generics;

public class Liste <E>{
	Knoten<E> start;
	Knoten<E> ende;
	
	public void add(E element) {
		if(element==null) return;
		Knoten<E> k = new Knoten<E>(element);
		
		if (start==null) {
			start=k;
			ende=start;
		}else {
			ende.next=k;
			ende=k;
		}
	}

}
