package br.com.generation.entregas;

import java.util.Scanner;

/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class Exercicio06 {

	public static void main(String[] args) {
		int numinteiro = 0, media=0;
		Scanner entrada = new Scanner(System.in);
		
		
		do {
			System.out.println("Digite um n�mero: ");
			numinteiro = entrada.nextInt();
			
			
		}
		while(media % 3 == 0 && numinteiro != 0);
		media = numinteiro * media;

			System.out.println(media);
		}
		

	

}

