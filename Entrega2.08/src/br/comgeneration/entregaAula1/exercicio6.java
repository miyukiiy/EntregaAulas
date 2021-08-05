package br.comgeneration.entregaAula1;

import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double x1, x2, y1, y2;
		double  d;
		
		System.out.println("Digite o valor de X do primeiro ponto: ");
		x1 = entrada.nextInt();
		System.out.println("Digite o valor de Y do primeiro ponto: ");
		y1 = entrada.nextInt();
		
		
		System.out.println("Digite o valor de X do segundo ponto: ");
		x2 = entrada.nextInt();
		System.out.println("Digite o valor de Y do segundo ponto: ");
		y2 = entrada.nextInt();
		
			d = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		
			
			System.out.println("A distancia entre os pontos é: " + d);
			
			
			entrada.close();
		
	}

}
