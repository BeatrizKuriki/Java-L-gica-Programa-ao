package estruturasDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class ExFor4 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e
		 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		 * mostrar a mensagem "divisao impossivel"
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double div = n1 / n2;
			if (n2 == 0) {
				System.out.println("DIVISÃO IMPOSSÍVEL");
			}
			System.out.println(div);

		}
		sc.close();
	}

}
