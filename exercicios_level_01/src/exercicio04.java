import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		/* Link: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java
		 * Fazer um programa que leia o número de um funcionário, 
		 * seu número de horas trabalhadas, o valor que recebe por
		 * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		 * decimais.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, horas;
	    double valorHora, salario;

	    numero = sc.nextInt();
	    horas = sc.nextInt();
	    valorHora = sc.nextDouble();

	    salario = valorHora * horas;

	    System.out.println("FUNCIONAL = " + numero);
	    System.out.printf("SALARIO = R$ %.2f%n", salario);
		
		sc.close();

	}

}
