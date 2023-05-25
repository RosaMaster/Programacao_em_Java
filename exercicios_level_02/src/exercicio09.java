import java.util.Locale;
import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		/* Link: https://www.youtube.com/watch?v=SRyQZBaA-_s
		 * Fazer um programa para ler as duas notas que um aluno obteve no
		 * primeiro e segundo semestre de uma disciplina anual. Em seguida,
		 * mostrar a nota final que o aluno obteve no ano juntando com um texto explicativo. 
		 * Caso a nota final do aluno seja inferior a 60.00, mostrar a mensagem "REPROVADO",
		 * conforme exemplos. Todos os valores devem ter uma casa decimal.*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		if (media >= 60.00) {
			System.out.println("APROVADO");
		}
		else {
			System.out.printf("REPROVADO");
		}
		
		System.out.printf("NOTA FINAL: %.1f%n", media);
		
		sc.close();
	}

}
