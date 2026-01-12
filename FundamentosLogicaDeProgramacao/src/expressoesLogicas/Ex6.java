package expressoesLogicas;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		/*
		 * Você deve fazer um programa que leia um valor qualquer e apresente uma
		 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
		 * (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
		 * destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		 */

		Scanner sc = new Scanner(System.in);
		double valor;
		System.out.println("Digite um valor:");
		valor = sc.nextDouble();
		if (valor < 0.0 || valor > 100) {
			System.out.println("FORA DO INTERVALO");
		} else if (valor <= 25.00) {
			System.out.println("INTERVALO: (0,25]");
		} else if (valor > 25.00 && valor <= 50.00) {
			System.out.println("INTERVALO: (25, 50]");

		} else if (valor > 50.00 && valor <= 75.00) {
			System.out.println("INTERVALO: (50,75]");

		} else if (valor > 75.00 && valor <= 100.00) {
			System.out.println("INTERVALO: (75, 100]");

		}
		sc.close();
	}

}
