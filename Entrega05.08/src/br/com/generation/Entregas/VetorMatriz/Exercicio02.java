package br.com.generation.Entregas.VetorMatriz;

import java.util.Random;

/*2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/
public class Exercicio02 {

	public static void main(String[] args) {
		
		int maiorpont= 0, maior=0;
		double media=0.0, soma = 0.0;
		int[] dado = new int [10]; 
		Random gerador =  new Random();
		
		
		
		for(int i = 0; i<=9; i++) {
			dado[i] = gerador.nextInt(6) + 1;
			System.out.println((i+1) + "� Lan�amento: " + dado[i]);
			
			soma = soma + dado[i];
			media = soma / 10;
			
			if(dado[i] == 6) {
				maiorpont++;
			}
			
			
			if(maior < dado[i]) {
				maior = dado[i];
			}
		}
		
		System.out.println("\nA m�dia dos lana�amento �: " + media);
		
		System.out.println("A quantidade de maoir ponta��o �: " + maiorpont +
							"\nO maior lan�amento foi: " + maior);
	}

}
