package br.com.generation.entregas;

import java.util.Scanner;

/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class Exercicio06 {

	public static void main(String[] args) {
		int numinteiro = 0, media=0;
		Scanner entrada = new Scanner(System.in);
		
		
		do {
			System.out.println("Digite um número: ");
			numinteiro = entrada.nextInt();
			
			
		}
		while(media % 3 == 0 && numinteiro != 0);
		media = numinteiro * media;

			System.out.println(media);
		}
		

	

}

