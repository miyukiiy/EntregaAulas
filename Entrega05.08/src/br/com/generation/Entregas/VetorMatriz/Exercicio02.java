package br.com.generation.Entregas.VetorMatriz;

import java.util.Random;

/*2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/
public class Exercicio02 {

	public static void main(String[] args) {
		
		int maiorpont= 0, maior=0;
		double media=0.0, soma = 0.0;
		int[] dado = new int [10]; 
		Random gerador =  new Random();
		
		
		
		for(int i = 0; i<=9; i++) {
			dado[i] = gerador.nextInt(6) + 1;
			System.out.println((i+1) + "º Lançamento: " + dado[i]);
			
			soma = soma + dado[i];
			media = soma / 10;
			
			if(dado[i] == 6) {
				maiorpont++;
			}
			
			
			if(maior < dado[i]) {
				maior = dado[i];
			}
		}
		
		System.out.println("\nA média dos lanaçamento é: " + media);
		
		System.out.println("A quantidade de maoir pontação é: " + maiorpont +
							"\nO maior lançamento foi: " + maior);
	}

}
