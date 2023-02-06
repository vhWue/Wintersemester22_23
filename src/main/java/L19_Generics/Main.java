package L19_Generics;

import java.util.LinkedList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Liste<Car> cars = new Liste<>();
		
		cars.add(new Car("BMW"));
		
		Array<Car> arrayList= new Array<>();
		LinkedList<Car> linkedList = new LinkedList<>();
		
		arrayList.addElement(new Car("Tesla"));
		arrayList.addElement(new Car("Tesla"));
		arrayList.addElement(new Car("Tesla"));
		arrayList.addElement(new Car("Tesla"));
		
		arrayList.ausgabe();
		List<String> versuch = new LinkedList<>();
	}

}
