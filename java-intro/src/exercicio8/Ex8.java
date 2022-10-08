package exercicio8;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		ArrayList listanome = new ArrayList<>();

		Scanner leitura = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
		System.out.println("insira um nome: ");
		String nomes = leitura.nextLine();
		if (!nomes.isEmpty()) {
		listanome.add(nomes);
		}
		
		}
		for (Object coisa : listanome) {
		System.out.println(coisa);
		}
		System.out.println("Tamanho da lista:" + listanome.size());
		System.out.println("Último elemento:" + listanome.get(9));
		
	}
}
