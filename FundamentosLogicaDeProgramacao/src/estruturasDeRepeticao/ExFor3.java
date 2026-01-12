package estruturasDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class ExFor3 {

	public static void main(String[] args) {
		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
		 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
		 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
		 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
		 * o terceiro valor tem peso 5.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int caso;
		System.out.println("Digite a quantidade de casos:");
		caso = sc.nextInt();

		double m1, m2, m3, media;
		media = 0;
		m1 = 0.0;
		m2 = 0.0;
		m3 = 0.0;

		for (int i = 0; i < caso; i++) {

			System.out.println("Informe as notas");
			m1 = sc.nextDouble();
			m2 = sc.nextDouble();
			m3 = sc.nextDouble();

			media = (m1 * 2.0 + m2 * 3.0 + m3 * 5.0) / 10.0;
			System.out.printf("Média = %.2f%n", media);
		}

		sc.close();

	}

}
