package L19_Generics;

public class Knoten <E> {
	E element;
	Knoten<E> next;
	
	public Knoten(E element) {
		this.element=element;
	}
	
	public E getElement() {
		return element;
	}
	
}
