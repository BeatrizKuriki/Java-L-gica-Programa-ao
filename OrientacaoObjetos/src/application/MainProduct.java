package application;

import java.util.Scanner;

import entities.Product;


public class MainProduct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Entre com o nome do produto:");
		product.name = sc.nextLine();
		System.out.println("Entre com o preço do produto:");
		product.price = sc.nextDouble();
		System.out.println("Entre com a quantidade do produto em estoque:");
		product.quantity = sc.nextInt();
	
	
		
		
		System.out.println(product);
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}
