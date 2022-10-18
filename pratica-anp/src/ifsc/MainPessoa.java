package ifsc;

public class MainPessoa {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Maria");
		aluno1.setCpf(901982389);
		aluno1.setMatricula(456378291);
		
		Professor p1 = new Professor();
		p1.setNome("luiz");
		p1.setCpf(901982389);
		p1.setSiape(7835263);
		
		System.out.println("Nome do aluno: " +aluno1.getNome());
		System.out.println("CPF do aluno: " +aluno1.getCpf());
		System.out.println("Matricula do aluno: " +aluno1.getMatricula());
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("Nome do professor: " +p1.getNome());
		System.out.println("CPF do professor: " +p1.getCpf());
		System.out.println("SIAPE do professor: "+ p1.getSiape());
		
	}

}
