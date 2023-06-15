import java.util.Locale;
import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		/* 
		 * Testando bit a bit operadores bitwise
		 * exemplo: & - and , | - or , ^ - xor
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		int n3 = sc.nextInt();
		System.out.println(n1 & n3);
		System.out.println(n1 | n3);
		System.out.println(n1 ^ n3);
		System.out.println(n2 & n3);
		System.out.println(n2 | n3);
		System.out.println(n2 ^ n3);
		
		sc.close();
	}

}
