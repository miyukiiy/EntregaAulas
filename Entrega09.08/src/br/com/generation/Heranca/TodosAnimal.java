package br.com.generation.Heranca;

public class TodosAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("lulu", 2, "Latir", "Poodle", "Corre");
		Cavalo cavalo = new Cavalo("Jeremias", 5, "Relincha", "Avelin", "Corre");
		preguica preguica = new preguica("Flash", 1, "Grito", "Preguiça-Bentinho", "escala");
		
		System.out.println("Cachorro Nome: " + cachorro.getNome() + "\nOnomatopeia: " + cachorro.getSom() + 
							"\nRaça: " + cachorro.getRaça() + "\nO cachorro: " + cachorro.getCorrer());
		System.out.println();
		System.out.println("Cavalo Nome: " + cavalo.getNome() + "\nOnomatopeia: " + cavalo.getSom() + 
							"\nRaça: " + cavalo.getRaça() + "\nO Cavalo: " + cavalo.getCorrer());
		System.out.println();
		System.out.println("Preguiça Nome: " + preguica.getNome() + "\nOnomatopeia: " + preguica.getSom() + 
							"\nRaça: " + preguica.getRaça() + "\nA Preguiça: " + preguica.getEscalar());
		

	}

}
