package application;

import java.util.Locale;
import java.util.Scanner;

public class MainEx2 {

	public static void main(String[] args) {
		/*
		 * / Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
		 * média dos elementos do vetor
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quanto números você vai digitar?");
		int n = sc.nextInt();
		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número:");
			vetor[i] = sc.nextDouble();
		}
		System.out.print("VALORES = ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf(vetor[i] + " ");
		}
		System.out.println();
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[i];
		}
		double avg = 0;
	
		avg = soma/n;
		System.out.printf("SOMA = %.2f", soma);
		System.out.println();
		System.out.printf("MEDIA = %.2f", avg);

	}

}
