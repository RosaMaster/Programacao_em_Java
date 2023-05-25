import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		/* Link: https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		number = sc.nextInt();
		
		if (number >= 0) {
			System.out.println("Numero Posito!");
		}
		else {
			System.out.println("Numero Negativo!");
		}
		
		sc.close();
	}

}
