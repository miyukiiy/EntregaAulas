package br.com.generation.entregas;

import java.util.Scanner;

/*2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
public class Exercicio02 {

	public static void main(String[] args) {
		
		int num, num2=0, par=0, impar=0;
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		for(num = 0; num <= 9; num++) {
			System.out.println("Digite um n�mero: ");
			num2 = entrada.nextInt();
		
		if(num2 %2 == 0) {
			par++;
		
		}
		else if(num2 %2 == 1) {
			impar++;
		}
		
	}entrada.close();
	System.out.println(par + " n�mero ao total � Par" );
	System.out.println(impar + " n�mero ao total � Impar" );
}
}