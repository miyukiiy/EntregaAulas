package br.com.generatio.exercicio01.Cliente;

public class ObjetoCliente {

	public static void main(String[] args) {

		ClasseCliente cliente1 = new ClasseCliente();

		cliente1.nome = "Shrek";
		cliente1.sobrenome = "O Ogro";
		cliente1.Sexo = "Masculino";
		cliente1.dataNascimento = "22/06/2001";
		cliente1.idade = 20;
		cliente1.telefone = "(11) 800052500";
		cliente1.endereco = "Rua do limão";
		cliente1.email = "Skrek@gmail.com";
		cliente1.cpf = "5563.542.44";
		cliente1.taxa = 150;

		cliente1.Comprando();
		System.out.println();

		System.out.println("Nome: " + cliente1.nome + " " + cliente1.sobrenome);
		System.out.println("Sexo: " + cliente1.Sexo);
		System.out.println("Data de Nascimento: " + cliente1.dataNascimento);
		System.out.println("Idade: " + cliente1.idade);
		System.out.println("Telefone: " + cliente1.telefone);
		System.out.println("Endereço: " + cliente1.endereco);
		System.out.println("E-mail: " + cliente1.email);
		System.out.println("Cpf: " + cliente1.cpf);

		cliente1.totalComprar(150);
		System.out.println();

		System.out.println("O valor da compra é: R$" + cliente1.taxa);

		cliente1.devolver(25);
		System.out.println("Valor Total descontado: " + cliente1.taxa);

	}

}
