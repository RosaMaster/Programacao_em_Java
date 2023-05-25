import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		/* Link: https://www.youtube.com/watch?v=3lhkB5I8P6E
		* Leia 3 valores de ponto flutuante e fetue o cálculo das raízes da equação de bhaskara
		* Se não for possível cálcular as raízes, mostre a mensagem correspondente "impossível calcular", caso haja
		* uma divisãopor 0 ou raiz de número negativo. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = b * b - 4.0 * a * c;
		
		if (a == 0 || delta < 0.0) {
			System.out.println("Impossivel Calcular");
		}
		else {
			double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		
		sc.close();
	}

}
