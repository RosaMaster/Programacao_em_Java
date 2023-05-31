import java.util.Locale;
import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da
		 * semana sendo: 1 = Domingo, 2 = Segunda, e assim por diante.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int day = sc.nextInt();

		if (day == 1) {
			System.out.println("Domingo");
		} else if (day == 2) {
			System.out.println("Segunda-Feira");
		} else if (day == 3) {
			System.out.println("Terça-Feira");
		} else if (day == 4) {
			System.out.println("Quarta-Feira");
		} else if (day == 5) {
			System.out.println("Quinta-Feira");
		} else if (day == 6) {
			System.out.println("Sexta-Feira");
		} else if (day == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Número Inválido");
		}

		sc.close();
	}

}
