import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		/* Link: https://www.youtube.com/watch?v=r3qCFqaNHds
		* Leia uma quantidade indeterminada de duplas de valores inteiros X e Y 
		* Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em ordem
		* crescente ou descrescente.*/
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		while (X != Y) {
			if (X < Y) {
				System.out.println("Crescente");
			}
			else {
				System.out.println("Crescente");
			}
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		
		sc.close();

	}

}
