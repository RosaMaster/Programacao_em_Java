import java.util.Locale;
import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da
		 * semana sendo: 1 = Domingo, 2 = Segunda, e assim por diante.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int entrada = sc.nextInt();
		String dia;
		
		switch (entrada) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-Feira";
			break;
		case 3:
			dia = "Terça-Feira";
			break;
		case 4:
			dia = "Quarta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Número Inválido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();

	}

}
