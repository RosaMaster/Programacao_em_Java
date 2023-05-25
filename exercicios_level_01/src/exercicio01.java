import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		/* 
		 * Link: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1003.java
		Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		mensagem explicativa, conforme exemplos.*/
		
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, soma;
		
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		
		soma = valor1 + valor2;
		
		System.out.println("SOMA = "+ soma);
		sc.close();
	}

}
