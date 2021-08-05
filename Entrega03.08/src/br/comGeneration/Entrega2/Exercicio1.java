package br.comGeneration.Entrega2;

import java.util.Scanner;
//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2, numero3, maior;
		
		System.out.printf("Digite o 1º número: ");
		numero1 = entrada.nextInt(); 
		System.out.printf("Digite o 2º número: ");
		numero2 = entrada.nextInt();
		System.out.printf("Digite o 3º número: ");
		numero3 = entrada.nextInt();
		
		maior = numero1;
		if(numero2 > maior) {
			 maior = numero2;
		}
		if(numero3 > maior) {
			 maior = numero3;
		}
		
		System.out.printf("O maior numero é: %d", maior);
		
		entrada.close();

	}

}
