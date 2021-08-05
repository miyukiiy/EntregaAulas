package br.com.generation.Entregas.VetorMatriz;

import java.util.Scanner;

/*3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/
public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[][] N1 =  new int [2][3];
		int[][] N2 =  new int [2][3];
		
		int[][] M1 =  new int [2][3];
		int[][] M2 =  new int [2][3];
		
		for (int l = 0; l < 2; l++) {
			for(int c = 0; c < 3; c++) {
				
				System.out.printf("Digite o valor [%d][%d] da matriz N1", l, c);
				N1[l][c] = ler.nextInt();
				
				System.out.printf("Digite o valor [%d][%d] da matriz N2", l, c);
				N2[l][c] = ler.nextInt();
				
				M1[l][c] = N1[l][c] + N2[l][c];
				M2[l][c] = N1[l][c] - N2[l][c];
			}
			
			System.out.println();
		}
		
		for (int l = 0; l < 2; l++) {
			for(int c = 0; c < 3; c++) {
				System.out.println("A soma de N1 E N2 é: " + M1[l][c]);
				
			}
			
		}System.out.println();
		
		for (int l = 0; l < 2; l++) {
			for(int c = 0; c < 3; c++) {
				System.out.println("A subitração de N1 E N2 é: " + M2[l][c]);
	}
			
}ler.close();
}
}