
public class Exemplo02 {

	public static void main(String[] args) {
		int[] vetor = {10, 20, 30, 40, 50};
		
		//System.out.println( vetor[4] );
		
		for(int i=0; i<=vetor.length-1; i++) {
			System.out.println( vetor[i] );
		}
		
		for(int i=vetor.length-1; i>=0; i--) {
			System.out.println( vetor[i] );
		}
		

	}

}
