package br.com.generation.Entregas.VetorMatriz;

import java.util.Scanner;

/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double[] pontuacao = new double [5];
		
		int i; 
		double maior=0.0;
		System.out.println("Digite a pontuação do aluno: ");
		
		for(i=0; i<=4; i++) {
			pontuacao[i] = ler.nextDouble();
		}
			for(i=0; i<=4; i++) {
				System.out.println("A pontuação do " + (i+1) + "º aluno é: " + pontuacao[i]);
				
					if(pontuacao[i]>maior) {
						maior = pontuacao[i];
			
		}
		}
		System.out.println("\nA maior pontuação é: " + maior);
		
	} 

}
