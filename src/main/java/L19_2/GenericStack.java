package L19_2;

import java.util.ArrayList;

public class GenericStack<E>{
	
	ArrayList<E> arrList;
	
	public GenericStack(){
		arrList=new ArrayList<>();
	}
	
	public void push(E el) {
		arrList.add(el);
	}
		
	
	public E pop() {
		return arrList.remove(arrList.size()-1);
	}
	
	public void ausgabe() {
		for(int i = 0; i<arrList.size();i++)
			System.out.println(arrList.get(i));
		}
	
	
	public static void main(String[] args) {
		
		GenericStack<String> s = new GenericStack<>();
		
		s.push("Hallo");
		s.push("Welt");
		
		System.out.println(s.pop());
		System.out.println(s.pop());

		
	}
}
