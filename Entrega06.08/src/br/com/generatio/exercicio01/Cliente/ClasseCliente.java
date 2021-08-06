package br.com.generatio.exercicio01.Cliente;

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
public class ClasseCliente {

	//atributos
	String nome;
	String sobrenome;
	String email;
	String Sexo;
	String cpf;
	String dataNascimento;
	String telefone;
	String endereco;
	
	int idade;
	int taxa; 
	
	//metodos
	
	void Comprando() {
		System.out.println("Fechando venda");
	}
	void totalComprar(int itens) {
		taxa += itens;
		
	}
	void devolver(int itendevolvido){
		taxa -= itendevolvido;
		
	}
	
	
	
	
}
