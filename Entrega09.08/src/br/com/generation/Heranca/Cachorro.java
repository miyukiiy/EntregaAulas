package br.com.generation.Heranca;

public class Cachorro extends Animal {

	private String correr;
	
	public Cachorro(String nome, int idade, String som, String raca, String correr) {
		super(nome, idade, som, raca);
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	
}
