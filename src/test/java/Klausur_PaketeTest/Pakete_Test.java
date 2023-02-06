package Klausur_PaketeTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import Klausur_Paketdienstleister.Paket;

class Pakete_Test {

	
	@Test
	void test() {
		int[] test1 = {1,4,9};
		int[] test2 = {1,9,4};
		int[] test3 = {4,1,9};
		int[] test4 = {4,9,1};
		int[] test5 = {9,1,4};
		int[] test6 = {9,4,1};
		
		int[] korrekt = {1,4,9};
		
		List<int[]> testArrays = Arrays.asList(test1,test2,test3, test4,test5,test6);
		
		testArrays.stream()
			.forEach(testArray->{
				Paket p = new Paket(testArray, 20.5);
				assertArrayEquals(korrekt, p.getSeiten());
			});
		
	}

}
