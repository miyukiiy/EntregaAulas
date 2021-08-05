package br.com.generation.entregas;

import java.util.Scanner;

/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
public class Exercicio03 {

	public static void main(String[] args) {
		
		int cont21 = 0, cont50 = 0, idade = 0;
		
		Scanner ler = new Scanner(System.in);
		
		while(idade != -99) {
			
			System.out.println("Digite a sua idade: ");
			idade = ler.nextInt();
			
			if(idade <= 21) {
			cont21++;
			}
			
		
			else if(idade >= 50) {
			cont50++;
				}
				
			}
		
		ler.close();
		System.out.println("Pessoas com a idade menor que 21: " + cont21);
		System.out.println("Pessoas com a idade maior que 50: " + cont50);
	}

}
