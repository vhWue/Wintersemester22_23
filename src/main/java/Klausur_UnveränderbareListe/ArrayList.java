package Klausur_UnveränderbareListe;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList<E> implements Collection<E>{
	
	private List<E> finalList;
	
	public ArrayList(Collection<? extends E> c) {
		this.finalList=(List<E>) c;
//		this.finalList=List.copyOf(c);
	}

	public List<E> getFinalList() {
		return finalList;
	}
	@Override
	public boolean add(E e){
		throw new UnsupportedOperationException();
	}
	
	public static void main(String[] args) {
		List<String> list = new java.util.ArrayList<>();
		list.add("Eins");
		list.add("zwei");
		ArrayList<String> testList = new ArrayList<>(list);
		
		for (String item : testList.getFinalList()) {
			System.out.println(item);
		}
//		testList.add("test3");
			testList.finalList.add("test3");
			
			
			
			System.out.println("\n");
			for (String item : testList.getFinalList()) {
				System.out.println(item);
			}
			
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	

}
