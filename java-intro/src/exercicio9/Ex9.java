package exercicio9;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {


			Scanner leitura=new Scanner(System.in);

			System.out.println("Insira quantidade litros: "); 
			String qtdLitros= leitura.nextLine(); 
			System.out.println("Insira preco litro: ");
			String precolitro=leitura.nextLine();

			Double qtd =Double.valueOf(qtdLitros);
			Double preco = Double.valueOf(precolitro);
			Double valorTotal = calculaAbastecimento(qtd, preco);

			System.out.println("Valor total: " + valorTotal);
   }


			private static Double calculaAbastecimento (Double qtd, Double preco) {
			return qtd * preco;
}
}
