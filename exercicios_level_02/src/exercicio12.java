import java.util.Locale;
import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		/* Uma operador de telefonia cobra R$ 50,00 por um plano básico que dá
		 * direito a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
		 * custa R$ 2,00. Fazer um programa para ler a quantidade de minutos que uma pessoa cunsumiu,
		 * dai mostra o valor a ser pago.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int min = sc.nextInt();
		
		double conta = 50.0;
		
		if (min > 100) {
			conta = conta + (min - 100) * 2.0;
		}
	
		System.out.printf("Valor da conta: R$ %.2f%n", conta);
		
		sc.close();
	}

}
