package L21_3;

public class Tree<E extends Comparable<E>> {
	Element<E> root;
	
	public void einfuegen(Element<E> neu) {
		if(root==null) root = neu;
		else einfuegen(root, neu);
	}
	
	private void einfuegen(Element<E> temp,Element<E> neu) {
		if(neu.element.compareTo(temp.element)<0) {
			if(temp.left==null) temp.left =neu;
			else einfuegen(temp.left, neu);
		}
		else {
			if(temp.right==null) temp.right = neu;
			else einfuegen(temp.right, neu);;
		}
	}


	public void ausgabe() {
		if(root==null) return;
		durchlaufen(root);
	}
	
	void durchlaufen(Element<E> element){
		if(element.left!=null) {
			durchlaufen(element.left);
		}
		System.out.println(element.getElement());
		if(element.right!=null) {
			durchlaufen(element.right);
		}
	}
	
	public Element<E> erstesElement() {
		Element<E> temp = root;
		if(temp.left!=null) {
			durchlaufen(temp.left);
		}
		return temp.left;
	}
	public Element<E> letztesElement() {
		Element<E> temp = root;
		if(temp.right!=null) {
			durchlaufen(temp.right);
		}
		return temp.right;
	}
	
	
	static class Element<T>{
		Element<T> right;
		Element<T> left;
		private T element;
		
		public Element(T element) {
			this.element=element;
		}

		public T getElement() {
			return element;
		}
	}

}
