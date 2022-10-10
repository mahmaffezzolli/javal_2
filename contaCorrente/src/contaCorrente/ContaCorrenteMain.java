package contaCorrente;

import java.util.Scanner;

public class ContaCorrenteMain {

	public static void main(String[] args) {

		Contacorrente x = new Contacorrente();
		

	    x.nome="maria"; 
	    x.cpf= 78594827390l;
	    x.numeroconta = 123456l;
	    x.saldo = 1000.0;
	 
	    x.mostrarDados();
	    
	    x.depositar(100.0);
	    x.sacar(300.0);
	    
	    x.mostrarDados();
	    
	}

}
