package br.comGeneration.Entrega2;
/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num= 0;
		double raiz, elevado;
		
		System.out.println("Digite um n�mero: ");
		num = entrada.nextInt();
		
		if(num %2 == 0) {
			raiz = Math.sqrt(num);
			System.out.println(num + " � par " + "\nA raiz quadrada de " + num + " � " + raiz);
			
			}
		
		else if(num %2 == 1) {
			elevado = Math.pow(num, 2.0);
			System.out.println(num + " � impar " + "\n" + num + " elevado ao quadrado � " + elevado);
		}
		entrada.close();

	}

}
