package exercicio3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		System.out.println("informe o valor: ");
		Scanner leitura = new Scanner (System.in);
		Integer valor = Integer.valueOf(leitura.nextLine());
		
		if(valor%2==0) {
			System.out.println("o valor é par!");
		} else {
			System.out.println("o valor é impar");
		}
		
		
	}
}
