package br.comGeneration.Entrega2;

import java.util.Scanner;
//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2, numero3, maior;
		
		System.out.printf("Digite o 1� n�mero: ");
		numero1 = entrada.nextInt(); 
		System.out.printf("Digite o 2� n�mero: ");
		numero2 = entrada.nextInt();
		System.out.printf("Digite o 3� n�mero: ");
		numero3 = entrada.nextInt();
		
		maior = numero1;
		if(numero2 > maior) {
			 maior = numero2;
		}
		if(numero3 > maior) {
			 maior = numero3;
		}
		
		System.out.printf("O maior numero �: %d", maior);
		
		entrada.close();

	}

}
