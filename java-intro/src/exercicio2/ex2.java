package exercicio2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		System.out.println("informe seu nome:");
		Scanner leitura = new Scanner (System.in); 
		String nome = leitura.nextLine(); 
		System.out.println("informe sua idade:");
		Scanner leitura1 = new Scanner (System.in); 
		Integer idade1 = Integer.valueOf(leitura.nextLine());

		System.out.println(nome);
		System.out.println(idade1);

	} 

}
