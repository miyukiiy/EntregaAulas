package br.com.generation.entregas;

import java.util.Scanner;

/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class Exercicio06 {

	public static void main(String[] args) {
		
		int numinteiro = 0, media=0, soma=0, x=0;
		Scanner entrada = new Scanner(System.in);
		
		
		do {
			System.out.println("Digite um n�mero: ");
			numinteiro = entrada.nextInt();
		
			
			if (numinteiro % 3 == 0) {
				soma = soma + numinteiro;
				x++;
				
				}
			
		}
		
		while(numinteiro != 0);
		media = soma / x;
		
	
		System.out.println("A m�dia de n�mero multiplo por 3 �: " + media);
		
	}
	

}

