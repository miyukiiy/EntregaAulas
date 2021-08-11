package br.com.generation.Animalinter;

public class Cavalo  extends Animal implements AnimalInter{
	
	public void movimento() {
		System.out.println("Movimentação: corre(alta velocidade)");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som característico: relincho");
		
	}
}