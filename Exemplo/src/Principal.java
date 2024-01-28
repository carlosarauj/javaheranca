
public class Principal {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		aluno.nome = "Carlos";
		aluno.teste = 6;
		aluno.prova = 7;
		
		System.out.println(aluno.getNome());
		System.out.println(aluno.getMedia());
		
		professor.setNome("Carlos");
		professor.setSalario(1000);
		
		System.out.println(professor.getNome());
		System.out.println(professor.getInss());
		

	}

}
