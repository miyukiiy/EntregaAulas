package br.com.generation.Animalinter;

public class Cavalo  extends Animal implements AnimalInter{
	
	public void movimento() {
		System.out.println("Movimenta��o: corre(alta velocidade)");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som caracter�stico: relincho");
		
	}
}