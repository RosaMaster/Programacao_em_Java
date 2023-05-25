import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * link: https://www.youtube.com/watch?v=Ah1Y6d6deq0
		 Fazer um programa para ler as medidas da largura e comprimento de um
		 terreno retangular com uma casa decima, bem como o valor do metro quadrado
		 do terreno com duas casas decimais. Em seguida, o programa deve mostrar o 
		 valor da área do terreno, bem como o valor do preço do terreno, 
		 ambos com duas casas decimais. Conforme Exemplo:
		 ENTRADA
		 A = 10.0
		 B = 30.0
		 C = 200.00
		 SAÍDA
		 AREA = 300.00
		 PRECO = 60000.00
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double valorMetro = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * valorMetro;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = R$ %.2f%n",  preco);
		
		sc.close();
	}

}
