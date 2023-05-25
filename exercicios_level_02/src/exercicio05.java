import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		/* Link: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1038.java
		* Com base na tabela abaixo, escreva um programa que leia o código de um item e o preco deste item. A
		* seguir, calcule e mostre o valor da conta a pagar.*/
		
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int preco = sc.nextInt();
		
		double total;
		if (codigo == 1) {
			total = preco * 4.0;
		}
		else if (codigo == 2) {
			total = preco * 4.5;
		}
		else if (codigo == 3) {
			total = preco * 5.0;
		}
		else if (codigo == 4) {
			total = preco * 2.0;
		}
		else {
			total = preco * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}

}
