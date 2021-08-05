package br.com.generation.entregas;

/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/
public class Exercicio01 {

	public static void main(String[] args) {
		int res;
		for(int i = 1000; i <= 1999; i++) {
			res = i%11;
			System.out.println(i + " O resto deste número dividido por 11 é: " + res);
			
		}
		

	}

}
 