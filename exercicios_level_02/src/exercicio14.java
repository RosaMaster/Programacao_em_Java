import java.util.Locale;
import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da
		 * semana sendo: 1 = Domingo, 2 = Segunda, e assim por diante.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int entrada = sc.nextInt();
		String dia;
		
		if (entrada == 1) {
			dia = "Domingo";
		} else if (entrada == 2) {
			dia = "Segunda-Feira";
		} else if (entrada == 3) {
			dia = "Terça-Feira";
		} else if (entrada == 4) {
			dia = "Quarta-Feira";
		} else if (entrada == 5) {
			dia = "Quinta-Feira";
		} else if (entrada == 6) {
			dia = "Sexta-Feira";
		} else if (entrada == 7) {
			dia = "Sábado";
		} else {
			dia = "Número Inválido";
		}
		System.out.println("Dia da semana" + dia);
		sc.close();
	}

}
