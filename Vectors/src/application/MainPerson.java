package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class MainPerson {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
		 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		Person[] person = new Person[n];
		for (int i = 0; i < person.length; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			System.out.println("Nome");
			String name = sc.next();
			System.out.println("Idade:");
			int idade = sc.nextInt();
			System.out.println("Altura:");
			double altura = sc.nextDouble();
			person[i] = new Person(name, idade, altura);

		}
		double avg = 0;
		double soma = 0;
		int cont = 0;
		for (int i = 0; i < person.length; i++) {
			soma += person[i].getAltura();
			if (person[i].getIdade() < 16) {
				cont++;
			}

		}

		int percentAvg = 0;
		percentAvg = cont * 100 / n;
		avg = soma / n;
		System.out.printf("ALTURA MÉDIA: %.2f", avg);
		System.out.println();
		System.out.println("PESSOAS COM MENOS DE 16 ANOS:" + percentAvg + "%");

		for (int i = 0; i < person.length; i++) {
			if (person[i].getIdade() < 16) {
				System.out.println(person[i].getName());
			}

		}
		sc.close();
	}

}
