package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class exercicio02 {

	public static void main(String[] args) {
		/* Fazer um programa para ler os dados de um produto em estoque (nome, preço e
		quantidade no estoque). Em seguida:
			• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
			estoque)
			• Realizar uma entrada no estoque e mostrar novamente os dados do produto
			• Realizar uma saída no estoque e mostrar novamente os dados do produto
		
		exemplo:
			Enter product data:
				Name: TV
				Price: 900.00
				Quantity in stock: 10
				Product data: TV, $ 900.00, 10 units, Total: $ 9000.00
				Enter the number of products to be added in stock: 5
				Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00
				Enter the number of products to be removed from stock: 3
				Updated data: TV, $ 900.00, 12 units, Total: $ 10800.00 */
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		
		// Updated
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		
		// Removed
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}
