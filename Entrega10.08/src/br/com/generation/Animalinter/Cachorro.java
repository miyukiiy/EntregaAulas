package br.com.generation.Animalinter;

public class Cachorro extends Animal implements AnimalInter{

	public void movimento() {
		System.out.println("Movimenta��o: Corre(velocidade moderada)");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som caracter�stico: latido");
		
	}
}
