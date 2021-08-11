package br.com.genaration.exercicio.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Exercici03 {

	public static void main(String[] args) {
		
		String estoque1 = "Bolacha";
		String estoque2 = "Pipoca";
		String estoque3 = "Caramelho";
		String estoque4 = "Chocolate";
		String estoque5 = "Marshmello";
		
		ArrayList<String> estoque = new ArrayList<>();
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		estoque.add(estoque4);
		
		System.out.println(estoque);
		
		estoque.add(estoque5);
		System.out.println(estoque5);
		
		estoque.remove(0);
		System.out.println(estoque);
		
		for(String i: estoque) {
		System.out.println("Estoque: " + i);
		}
		
		for(int i =0; i<estoque.size(); i++) {
			System.out.println((i+1) + "º" + " estoque: " + estoque.get(i));
		}
		
		System.out.println("\nO tamanho do estoque é: " + estoque.size());

		Collections.sort(estoque);
		System.out.println(estoque);
		
		Collections.shuffle(estoque);
		System.out.println(estoque);
		
	}

}
