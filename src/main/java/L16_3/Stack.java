package L16_3;

import java.util.ArrayList;


@SuppressWarnings("all")
public class Stack{
	
	ArrayList arrList;
	public Stack() {
		arrList=new ArrayList();
	}
	
	
	public void push(String el) {
		arrList.add(el);
	}
	
	public String pop() {
		return  (String) arrList.remove(arrList.size()-1);
		
		
	}
	public void ausgabe() {
		for(int i = 0; i<arrList.size();i++)
		System.out.println(arrList.get(i));
	}
	
	

	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push("Hans");
		stack.push("Gustav");
		stack.push("David");
		
		stack.ausgabe();
		System.out.println("\n"+stack.pop()+" entfernt");
		System.out.println("\nNeue ausgabe");
		stack.ausgabe();
		
	}
}
