package br.com.generation.entregas;

import java.util.Scanner;

/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
public class Exercicio02 {

	public static void main(String[] args) {
		
		int num, num2=0, par=0, impar=0;
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		for(num = 0; num <= 9; num++) {
			System.out.println("Digite um número: ");
			num2 = entrada.nextInt();
		
		if(num2 %2 == 0) {
			par++;
		
		}
		else if(num2 %2 == 1) {
			impar++;
		}
		
	}entrada.close();
	System.out.println(par + " número ao total é Par" );
	System.out.println(impar + " número ao total é Impar" );
}
}