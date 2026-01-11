package expressoesLogicas;

import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * uma duração mínima de 1 hora e máxima de 24 horas.
		 */

		Scanner sc = new Scanner(System.in);
		int horaInicial, horaFinal;

		System.out.println("Digite a hora de início do jogo:");
		horaInicial = sc.nextInt();
		System.out.println("Digite a hora de fim do jogo:");
		horaFinal = sc.nextInt();
		int tempo = tempoJogo(horaInicial, horaFinal);
		System.out.printf("O JOGO DUROU " + tempo + " HORAS");

	}

	public static int tempoJogo(int a, int b) {

		int duracao;
		if (a < b) {
			duracao = b - a;
		} else {
			duracao = 24 - a + b;
		}
		return duracao;

	}

}
