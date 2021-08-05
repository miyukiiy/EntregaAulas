package br.comgeneration.entregaAula1;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idadedia, mes, dia, ano; 
		
		System.out.println("Digite a sua idade em dias: ");
		idadedia = entrada.nextInt();
		
			ano = idadedia / 365;
			mes = (idadedia - (365 * ano)) / 30;
			dia = (idadedia - (365 * ano)) % 30;
			
			
			System.out.println("você tem " + ano + " anos");
			System.out.println("nasceu no mês " + mes);
			System.out.println("nasceu no dia " + dia);
			
			entrada.close();

			
	}

}
