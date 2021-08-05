package br.com.generation.entregas;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
public class Exercicio05 {

	public static void main(String[] args) {
		
		int num, soma=0;
		
		Scanner entrada = new Scanner(System.in);
		
		
		do {
			System.out.println("Digite um número: ");
			num = entrada.nextInt();
			soma = soma + num;
			
		}
		while(num != 0);
			System.out.println("A soma dos número é " + soma);
			entrada.close();
		}

	}


