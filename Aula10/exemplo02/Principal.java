package exemplo02;

public class Principal {

	public static void main(String[] args) {
		
		Estudante e1 = new Estudante();
		e1.setNome("Jo�o");
		e1.setAnoNascimento(2000);
		e1.setCurso("IPI");
		
		TecnicoAdministrativo ta1 = new TecnicoAdministrativo();
		ta1.setNome("Jos�");
		ta1.setAnoNascimento(1990);
		
		Docente d1 = new Docente();
		d1.setAreaAtuacao("Computa��o");
				

	}
}