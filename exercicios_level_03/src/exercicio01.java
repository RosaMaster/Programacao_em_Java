import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// Crie um programa com laço FOR que some a quantidade de números de entrada
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
