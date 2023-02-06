package Klausur_Paketdienstleister;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Paket {
	private int[] seiten;
	private double gewicht;
	private double groeße;
	
	public Paket(int[] seiten, double gewicht) {
		this.gewicht=gewicht;
		this.seiten = new int[seiten.length];
		List<Integer> seitenList = new ArrayList<>();
		for (Integer integer : seiten) {
			seitenList.add(integer);
		}
		List<Integer> sorted = seitenList.stream().sorted().collect(Collectors.toList());
		for (int i = 0; i < seiten.length; i++) {
			this.seiten[i]=sorted.get(i);	
		}
		
		this.groeße= seiten[0]*seiten[1]*seiten[2];
	}
	public void ausgabe() {
		for (int i : seiten) {
			System.out.print(i+"  ");
		}
		System.out.println();
	}
	
	public int[] getSeiten() {
		return this.seiten;
	}
	
	public static void main(String[] args) {
		int[] test = {1,4,9};
		int[] test2 = {4,1,9};
		int[] test3 = {9,1,4};
		Paket p = new Paket(test, 20.5);
		Paket p2 = new Paket(test2, 20.5);
		Paket p3 = new Paket(test3, 20.5);
		p.ausgabe();
		p2.ausgabe();
		p3.ausgabe();
			
	}
	public double getGewicht() {
		return gewicht;
	}
	public double getGroeße() {
		return groeße;
	}
}
