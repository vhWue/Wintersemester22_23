package Klausur_Iterator;

import java.util.Iterator;

public class RouletteZahlenIterator implements Iterator<Integer>{

	private int counter = 0;
	private int zufallszahl;
	
	@Override
	public boolean hasNext() {
		if(counter==3) return false;
		int zufall=(int)(Math.random()*36);
		zufallszahl=zufall;
		if(zufall==0) counter++;
		return true;
		
		
		
	}

	@Override
	public Integer next() {
		return zufallszahl;
	}

	public int getCounter() {
		return counter;
	}

	public int getZufallszahl() {
		return zufallszahl;
	}

}
