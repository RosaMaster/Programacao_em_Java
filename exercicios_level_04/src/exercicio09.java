import java.util.Scanner;


public class exercicio09 {

	public static void main(String[] args) {
		// Link: https://www.youtube.com/watch?v=RVJnkOyc7Kk
		// Leia 2 valores X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe 2 números X e Y: ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int min, max, soma = 0;
		
		if (x < y) {
			min = x;
			max = y;
		}
		else {
			min = y;
			max = x;
		}
		
		for (int i = min +1; i < max; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		System.out.println("A soma dos números impares são: " + soma);
		
		sc.close();
	}

}
