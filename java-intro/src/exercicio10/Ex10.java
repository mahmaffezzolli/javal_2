package exercicio10;

import java.util.Scanner;

public class Ex10 {
	   public static void main(String[] args) {
	        Scanner leitura = new Scanner(System.in);

	        Double n1, n2, n3, media = 0.0;

	        System.out.println("Digite seu nome: ");
	        String nome = leitura.nextLine();

	        System.out.println("informe a nota 1: ");
	        String nota1 = leitura.nextLine();
	        System.out.println("informe a nota 2: ");
	        String nota2 = leitura.nextLine();
	        System.out.println("informe a nota 3: ");
	        String nota3 = leitura.nextLine();

	        n1 = Double.valueOf(nota1);
	        n2 = Double.valueOf(nota2);
	        n3 = Double.valueOf(nota3);

	        media = (n1 + n2 + n3) / 3;
	        System.out.println(nome +", sua media é = " + media);
            if (media>=6) {
            	System.out.println(" voce esta: Aprovado");
            }
            if (media>= 4 && media< 6) {
            	System.out.println("voce esta: em Recuperação");
            }
            if (media<4) {
            	System.out.println("voce esta: Reprovado");
            }
            

	    }
}
