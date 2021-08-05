package br.com.generation.Entregas.VetorMatriz;

import java.util.Scanner;

/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[][] ValorUsuario = new int [3][3];
		int soma=0,somadiagonal = 0;
		
		for (int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				
				System.out.printf("Digite o valor [%d][%d] ", l, c);
				ValorUsuario[l][c] = ler.nextInt();
				
				soma = soma + ValorUsuario[l][c];
				somadiagonal = ValorUsuario[0][0] + ValorUsuario[1][1] + ValorUsuario[2][2];
			}
			
			System.out.println();
	}
		
		System.out.println("A soma total é: " + soma);
		System.out.println("A soma total da diagonal é: " + somadiagonal);
		ler.close();
}
}