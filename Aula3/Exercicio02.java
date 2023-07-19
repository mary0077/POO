import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		double media = 0;
		int somatorio = 0;
		int contador = 0;
		
		System.out.println("Digite um n�mero: ");
		numero = scanner.nextInt();
		
		while(numero>=0) {
			somatorio += numero;
			contador++;
			
			System.out.println("Digite um n�mero: ");
			numero = scanner.nextInt();
		}
		
		if (contador > 0) {
		
			media = somatorio/contador;
			
			System.out.println("M�dia: " + media);
			System.out.println("Somat�rio: " + somatorio);
			System.out.println("Quantidade: " + contador);
		} else {
			System.out.println("Nenhum n�mero v�lido foi digitado.");
		}
	}
}