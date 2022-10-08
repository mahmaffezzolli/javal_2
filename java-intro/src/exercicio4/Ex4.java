package exercicio4;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		System.out.println("informe os valores: ");
	    Scanner leitura= new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			String valor = leitura.nextLine();
			System.out.println(valor);
		}
}
}
