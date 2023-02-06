package L19_Generics;

import java.util.ArrayList;

public class Array <E extends Car>{
	
	private ArrayList<E> arrList;
	
	public Array() {
		arrList = new ArrayList<>();
	}

	public ArrayList<E> getArr() {
		return arrList;
	}
	
	
	public void addElement(E element) {
		arrList.add(element);
	}
	
	public void ausgabe() {
		for (E e : arrList) {
			System.out.println(e.getName());
		}
	}

}
