import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		// Link: https://www.youtube.com/watch?v=JTa8WEhV38E
		// Imprima a tabuada de N.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número da tabuada: ");
		
		int N = sc.nextInt();
		
		System.out.println("A tabuada de " + N + " é igual á: ");
		
		for (int i=1; i<=10; i++) {

			int resultado = N * i;
			System.out.printf("%d X %d = %d%n", N, i, resultado);
		}
		
		sc.close();

	}

}
