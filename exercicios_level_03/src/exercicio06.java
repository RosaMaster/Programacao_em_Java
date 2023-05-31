import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		/* Link:  https://www.youtube.com/watch?v=vT0QEDHK2yU
		* Faça um programa para ler um número independente de dados, contendo em cada um a idade de um individuo. O último
		* dado, que não entrará nos calcúlos, contem um valor de idade negativa. Calcular e imprimir a idade média deste grupo de individuos. Se for ent
		* entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel calcular".*/
		
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int soma = 0;
		int cont = 0;
		
		while (idade >=0) {
			soma = soma + idade;
			cont = cont + 1;
			idade = sc.nextInt();
		}
		
		if (cont > 0) {
			double media = (double) soma / cont;
			System.out.printf("%.2f%n", media);
		}
		
		else {
			System.out.println("Impossivel Calcular");
		}
		
		sc.close();
	}

}
