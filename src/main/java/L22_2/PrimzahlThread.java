package L22_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrimzahlThread implements Runnable{
	
	List<Integer> zahlenList;
	HashMap<Integer, Boolean> ergebnis = new HashMap<>();
	
	public PrimzahlThread(List<Integer> zahlenList) {
		this.zahlenList=zahlenList;
	}
	
	public void ausgabe() {
		Set<Integer> keySet = ergebnis.keySet();
//		for (Integer key : keySet) {
//			System.out.println(key+" -> "+ ergebnis.get(key));
//		}
		
		keySet.stream().forEach(key -> System.out.println(key+" -> "+ ergebnis.get(key)));
	}
	
	
	
	
	public boolean testeObPrimzahl(int zahl) {
		if(zahl<2) return false;
		for(int divisor = 2; divisor<zahl;divisor++) {
			if(zahl%divisor==0) return false;
		}
		return true;
	}
	
	@Override
	public void run() {
		for (Integer wert : zahlenList) {
			boolean istPrim=testeObPrimzahl(wert);
			ergebnis.put(wert, istPrim);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		List<Integer> intList1 = Arrays.asList(new Integer[] {2,78,453,11});
		List<Integer> intList2 = Arrays.asList(new Integer[] {67,23,777,22,8987867});
		List<Integer> intList3 = Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12});
		PrimzahlThread pt1 = new PrimzahlThread(intList1);
		PrimzahlThread pt2 = new PrimzahlThread(intList2);
		PrimzahlThread pt3 = new PrimzahlThread(intList3);
		Thread t1 = new Thread(pt1);
		Thread t2 = new Thread(pt2);
		Thread t3 = new Thread(pt3);
		t1.start();
		t2.start();
		t3.start();
		
		Map<PrimzahlThread, HashMap<Integer, Boolean>> multiMap = new HashMap<>();
		
		
		try {
			t1.join();
			t2.join();
			t3.join();
			
			multiMap.put(pt1, pt1.ergebnis);
			multiMap.put(pt2, pt2.ergebnis);
			multiMap.put(pt3, pt3.ergebnis);
		
			Set<PrimzahlThread> keySet = multiMap.keySet();
			
			for (PrimzahlThread primKey : keySet) {
				primKey.ausgabe();
				System.out.println();
			}
			
//			keySet.stream()
//			.forEach(key->key.ausgabe());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	
	}

}
