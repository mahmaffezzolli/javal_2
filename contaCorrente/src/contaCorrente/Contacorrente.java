package contaCorrente;

public class Contacorrente {

	public String nome;  
	public Long cpf;
	public Long numeroconta;
	public Double saldo;
	
	public Double sacar( Double valor) {
		if(valor>saldo) {
			System.out.println("valor insuficiente");
		}else {
		saldo= saldo-valor; 
		}
		return saldo;
	}
	
	public  Double depositar(Double valor) {
		saldo= saldo+valor; 
		return saldo;
	}

	public void mostrarDados() {
		System.out.println("Titular: " +nome);
		System.out.println("Cpf: " +cpf);
		System.out.println("Conta: " +numeroconta);
		System.out.println("saldo conta:" +saldo);
	}
}
