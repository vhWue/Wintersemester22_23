package Klausur_UnveränderbareListe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ImmutableList<E> {
    private final List<E> list;

    public ImmutableList(Collection<? extends E> c) {
        this.list = new ArrayList<E>(c);
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException("Cannot add elements to an immutable list");
    }

    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Cannot add elements to an immutable list");
    }

    public void add(int index, E element) {
        throw new UnsupportedOperationException("Cannot add elements to an immutable list");
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Cannot add elements to an immutable list");
    }

    // Other methods, such as those for accessing and manipulating the list's elements,
    // can be implemented here by delegating to the underlying ArrayList object

    public E get(int index) {
        return this.list.get(index);
    }

    public int size() {
        return this.list.size();
    }
    //And other required method like remove, clear, contains etc which you can implement via delegation


    public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("123");
		stringList.add("123");
    	ImmutableList<String> arrList = new ImmutableList<>(stringList);
    	
    	arrList.add("123");
	}
}

