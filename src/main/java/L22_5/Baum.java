package L22_5;

import L22_5.Baum.Knoten;

public class Baum<E extends Comparable<E>> {
	
	public static class Knoten<E> {
		Knoten<E> left;
		Knoten<E> right;
		E content;
		
		public Knoten(E content){
			this.content=content;
		}
	}
	Knoten<E> root;
	
	public void einfuegen(Knoten<E> content) {
		if (root == null) root = content;
		else einfuegen(root, content);
	}
	public void einfuegen(Knoten<E> temp, Knoten<E> neu) {
		if(neu.content.compareTo(temp.content)<1) {
			if(temp.left==null) {
				temp.left=neu;
			}else einfuegen(temp.left, neu);			
		}else {
			if(temp.right==null) temp.right=neu;
			else einfuegen(temp.right, neu);
		}
	}
	
	
	protected void traversiere(Visitor<E> visitor) {
		if(root==null) return;
		else traversiere(root, visitor);
	}
	
	protected void traversiere(Knoten<E> current, Visitor<E> visitor) {
		if(current.left!=null) traversiere(current.left,visitor);
		visitor.visit(current);
		if(current.right!=null) traversiere(current.right, visitor);
	}
	
	public int size() {
		class VisitorImpl<T> implements Visitor<T> {
			private int counter=0;
			@Override
			public void visit(Knoten<T> current) {
				counter++;
			}
		}
		VisitorImpl<E> impl = new VisitorImpl<>();
		traversiere(impl);
		return impl.counter;
	}
	
}
