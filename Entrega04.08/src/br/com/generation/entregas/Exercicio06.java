package br.com.generation.entregas;

import java.util.Scanner;

/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class Exercicio06 {

	public static void main(String[] args) {
		
		int numinteiro = 0, media=0, soma=0, x=0;
		Scanner entrada = new Scanner(System.in);
		
		
		do {
			System.out.println("Digite um número: ");
			numinteiro = entrada.nextInt();
		
			
			if (numinteiro % 3 == 0) {
				soma = soma + numinteiro;
				x++;
				
				}
			
		}
		
		while(numinteiro != 0);
		media = soma / x;
		
	
		System.out.println("A média de número multiplo por 3 é: " + media);
		
	}
	

}

