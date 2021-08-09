package br.com.generation.Heranca;

public class preguica extends Animal{

	private String escalar;
	
	public preguica(String nome, int idade, String som, String raca, String escalar) {
		super(nome, idade, som, raca);
		this.escalar = escalar;
	}
	public String getEscalar() {
		return escalar;
	}

	public void setEscalar(String escalar) {
		this.escalar = escalar;
	}

}
