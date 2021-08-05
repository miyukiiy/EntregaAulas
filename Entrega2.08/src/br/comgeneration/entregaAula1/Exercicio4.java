package br.comgeneration.entregaAula1;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double a,b,c,r,d,s;
		
		System.out.println("Digite o valor de A: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = entrada.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = entrada.nextInt();
		
			r = Math.pow((a+b), 2.0);
			s = Math.pow((a+c), 2.0);
			d = ((r+s) / 2);
			
			System.out.println("O valor de r é:  " + r);
			System.out.println("O valor de s é:  " + s);
			System.out.println("O valor de d é:  " + d);
			
			entrada.close();
	}

}
