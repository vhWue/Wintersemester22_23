package L23_Versuche;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaShortcuts {
	
	static class Car implements Function<Car,String>{
		private String name;
		
		
		public Car(String name) {
			this.name=name;
		}
		
		static void printCar(Car car) {
			System.out.println(car.name);
		}
		static void printCar2(Car car) {
			System.out.println(car.name);
		}

		@Override
		public String apply(Car t) {
			return t.name;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		List<String> letters = Arrays.asList("a","b","c","d");
		
		letters.stream().map(String::toUpperCase).forEach(s->System.out.println(s+" "));
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Audi"));
		cars.add(new Car("BMW"));
		cars.add(new Car("Mercedes"));
		
		cars.stream().forEach(Car::printCar);
		
		List<String> students = List.of("Peter","Dave","Gustav");

		students.stream().forEach(System.out::println);
		
	}

}
