package br.comGeneration.Entrega2;
/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num= 0;
		double raiz, elevado;
		
		System.out.println("Digite um número: ");
		num = entrada.nextInt();
		
		if(num %2 == 0) {
			raiz = Math.sqrt(num);
			System.out.println(num + " é par " + "\nA raiz quadrada de " + num + " é " + raiz);
			
			}
		
		else if(num %2 == 1) {
			elevado = Math.pow(num, 2.0);
			System.out.println(num + " é impar " + "\n" + num + " elevado ao quadrado é " + elevado);
		}
		entrada.close();

	}

}
