package br.com.generation.Animalinter;

public class Preguica extends Animal implements AnimalInter{

	public void movimento() {
		System.out.println("Movimenta��o: Sobe em arvores");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som Caracter�stico: grito");
		
	}
	
	
}
