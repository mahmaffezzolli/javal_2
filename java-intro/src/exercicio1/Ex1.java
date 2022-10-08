package exercicio1;

import java.util.Scanner;

public class Ex1 {
 
	public static void main(String[] args) {
		
		System.out.println("informe o valor da variável:");
		Scanner leitura = new Scanner (System.in); 
		String nome = leitura.nextLine(); 
		System.out.println(nome);
	}
}
