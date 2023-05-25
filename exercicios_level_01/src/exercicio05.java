import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		/*Link: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1010.java
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, qte1, qte2;
	    double preco1, preco2, total;

	    cod1 = sc.nextInt();
	    qte1 = sc.nextInt();
	    preco1 = sc.nextDouble();
	    
	    cod2 = sc.nextInt();
	    qte2 = sc.nextInt();
	    preco2 = sc.nextDouble();

	    total = preco1 * qte1 + preco2 * qte2;
	    
	    System.out.println("Código peca 01: "+ cod1);
	    System.out.println("Preco peca 01: "+ preco1);
	    System.out.println("Qtde peca 01: "+ qte1);
	    System.out.println("Código peca 02: "+ cod2);
	    System.out.println("Preco peca 02: "+ preco2);
	    System.out.println("Qtde peca 02: "+ qte2);
	    System.out.printf("VALOR TOTAL A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
