package getset;


public class Exemplo01 {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Jo�o");
		
		System.out.println( p1.getNome() );
		
		p1.setNome("Jos�");
		
		System.out.println( p1.getNome() );
	}
}