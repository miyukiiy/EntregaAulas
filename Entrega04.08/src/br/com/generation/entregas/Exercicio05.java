package br.com.generation.entregas;

import java.util.Scanner;

/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
public class Exercicio05 {

	public static void main(String[] args) {
		
		int num, soma=0;
		
		Scanner entrada = new Scanner(System.in);
		
		
		do {
			System.out.println("Digite um n�mero: ");
			num = entrada.nextInt();
			soma = soma + num;
			
		}
		while(num != 0);
			System.out.println("A soma dos n�mero � " + soma);
			entrada.close();
		}

	}


