package expressoesLogicas;

import java.util.Locale;
import java.util.Scanner;

public class EX5 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o código do produto?");
		int cod = sc.nextInt();
		System.out.println("Qual quantidade do produto?");
		int qtd = sc.nextInt();
		double valor;

		if (cod == 1) {
			valor = qtd * 4;

		} else if (cod == 2) {
			valor = qtd * 4.5;
		} else if (cod == 3) {
			valor = qtd * 5;
		} else if (cod == 4) {
			valor = qtd * 2;
		} else {
			valor = qtd * 1.5;

		}
		System.out.printf("Total: R$ %.2f%n", valor);

	}

}
