package br.comgeneration.entregaAula1;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double segundostotal, horas, minutos, segundos;
		
		System.out.println("Digite os segundo do evento: ");
		segundostotal = entrada.nextInt();
		
			horas = segundostotal / 3600;
			minutos = segundostotal / 60;
			segundos = segundostotal;
			
			
			System.out.println("A dura��o do evento em horas totais �  " + horas);
			System.out.println("dura��o do evento em minutos totais �  " + minutos);
			System.out.println("A dura��o do evento em segundos totais �  " + segundos);
			
			entrada.close();
	}

}
