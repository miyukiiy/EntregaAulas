package br.comgeneration.entregaAula1;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double aluno, nota1, nota2, nota3, mediafinal;
		int pesonota;
		
		System.out.println("Digite a primeira nota do aluno: ");
		nota1 = entrada.nextInt();
		
		System.out.println("Digite a segunda nota do aluno: ");
		nota2 = entrada.nextInt();
		
		System.out.println("Digite a terceira nota do aluno: ");
		nota3 = entrada.nextInt();
		
			pesonota = 2+3+5;
			aluno = (nota1*2) + (nota2*3) + (nota3*5);
			mediafinal = aluno / pesonota;
			
			System.out.println("A média final do aluno é: " + mediafinal);
			
			
			entrada.close();
	}

}
