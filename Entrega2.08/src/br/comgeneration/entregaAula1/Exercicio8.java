package br.comgeneration.entregaAula1;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double carro, fabrica, impostos, distribuidor; 
		
		System.out.println("Digite o custo de fabrica:  ");
		fabrica = entrada.nextInt();
		
		impostos = (fabrica*28) / 100; 
		distribuidor = (fabrica*45) / 100;
		carro = fabrica + impostos + distribuidor;
		
		System.out.println("O custo do carro é: " + carro);
		
		
		entrada.close();

	}

}
