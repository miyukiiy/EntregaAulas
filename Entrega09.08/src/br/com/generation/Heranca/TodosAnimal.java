package br.com.generation.Heranca;

public class TodosAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("lulu", 2, "Latir", "Poodle", "Corre");
		Cavalo cavalo = new Cavalo("Jeremias", 5, "Relincha", "Avelin", "Corre");
		preguica preguica = new preguica("Flash", 1, "Grito", "Pregui�a-Bentinho", "escala");
		
		System.out.println("Cachorro Nome: " + cachorro.getNome() + "\nOnomatopeia: " + cachorro.getSom() + 
							"\nRa�a: " + cachorro.getRa�a() + "\nO cachorro: " + cachorro.getCorrer());
		System.out.println();
		System.out.println("Cavalo Nome: " + cavalo.getNome() + "\nOnomatopeia: " + cavalo.getSom() + 
							"\nRa�a: " + cavalo.getRa�a() + "\nO Cavalo: " + cavalo.getCorrer());
		System.out.println();
		System.out.println("Pregui�a Nome: " + preguica.getNome() + "\nOnomatopeia: " + preguica.getSom() + 
							"\nRa�a: " + preguica.getRa�a() + "\nA Pregui�a: " + preguica.getEscalar());
		

	}

}
