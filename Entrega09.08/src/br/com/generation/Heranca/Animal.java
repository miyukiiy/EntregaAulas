package br.com.generation.Heranca;

public class Animal {

	private String nome;
	private int idade;
	private String som;
	private String raca;
	
	public Animal (String nome, int idade, String som, String raca) {
		this.nome = nome;
		this.idade = idade;
		this.som =som;
		this.raca = raca;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getRa�a() {
		return raca;
	}
	public void setRa�a(String ra�a) {
		this.raca = ra�a;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	} 
	
	
}
