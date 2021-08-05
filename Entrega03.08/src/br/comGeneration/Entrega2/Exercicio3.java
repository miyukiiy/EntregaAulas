package br.comGeneration.Entrega2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int  idade; 
		
		System.out.println("Digite a idade: ");
		idade = entrada.nextInt();
		
		if(idade >= 10 && idade <=14) {
			
			System.out.println("Sua classificação é infantil");
		}
		else if(idade >= 15 && idade <=17) {
			
			System.out.println("Sua classificação é Juvenil");
		}
		else if(idade >= 18 && idade <=25) {
			
			System.out.println("Sua classificação é Adulto");
		}
		
		else{
			System.out.println("Sua idade não tem classificação!");
			
		}
		
		entrada.close();

	}

}
