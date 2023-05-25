import java.util.Locale;
import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		/* Link: https://www.youtube.com/watch?v=UjCVIcKccdQ
		 * Fazer um programa para ler 3 números inteiros. Em seguida,
		 * mostrar qual o menor dentre os 3 números lidos. Em caso de empate,
		 * mostrar apenas uma vez.*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if ((a < b && a < c) || (a == b && a < c) || (a == c && a < b)) {
			System.out.println("O menor número é o " + a);
		}
		else if ((b < a && b < c) || (b == c && b < a) || (b == a && b < c)) {
			System.out.println("O menor número é o " + b);
		}
		else if ((c < a && c < b) || (c == a && c < b) || (c == b && c <a )) {
			System.out.println("O menor número é o " + c);
		}
		else if (c == a && c == b) {
			System.out.println("O menor número é o " + a);
		}
		else {
			System.out.println("ERROR");
		}
		
		sc.close();

	}

}
