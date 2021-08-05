package br.comgeneration.entregaAula1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int ano, meses, dias, diastotais;
		
		System.out.println("Digite a sua idade: ");
		ano = entrada.nextInt();
		
		System.out.println("Digite o mês do seu nascimento: ");
		meses = entrada.nextInt();
		
		System.out.println("Digite o dia do seu aniversário: ");
		dias = entrada.nextInt();
		
		
		diastotais = ano * 365 + meses * 30 + dias;
		System.out.println("você tem " + diastotais + " dias de vida");
		
		entrada.close();

	}

}
