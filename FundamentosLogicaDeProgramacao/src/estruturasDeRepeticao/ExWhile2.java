package estruturasDeRepeticao;

import java.util.Scanner;

public class ExWhile2 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma).
		 */
		Scanner sc = new Scanner(System.in);

		int x, y;
		x = 1;
		y = 1;

		while (x != 0 && y != 0) {
			System.out.println("Digite a coordenada de x:");
			x = sc.nextInt();
			System.out.println("Digite a coordenada de y:");
			y = sc.nextInt();
			if (x > 0 && y > 0) {
				System.out.println("QUADRANTE 1");
			} else if (x > 0 && y < 0) {
				System.out.println("QUADRANTE 4");

			} else if (x < 0 && y < 0) {
				System.out.println("QUADRANTE 3");
			} else if (x < 0 && y > 0) {
				System.out.println("QUADRANTE 2");
			}

		}

		sc.close();

	}

}
