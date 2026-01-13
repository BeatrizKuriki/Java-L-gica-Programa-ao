package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class MainProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		Product product = new Product();

		System.out.println("Entre com o nome do produto:");
		product.name = sc.nextLine();
		System.out.println("Entre com o preço do produto:");
		product.price = sc.nextDouble();
		System.out.println("Entre com a quantidade do produto em estoque:");
		product.quantity = sc.nextInt();

		System.out.println(product);
		System.out.println("Informe a quantidade do produto que será adicionada no estoque ");
		int qtd = sc.nextInt();
		product.addProducts(qtd);

		System.out.println("ATUALIZAÇÃO : " + product);

		System.out.println("Informe a quantidade de produtos que será retirada do estoque");
		int ret = sc.nextInt();
		product.removeProduct(ret);
		System.out.println("ATUALIZAÇÃO : " + product);

		sc.close();

	}

}
