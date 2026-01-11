package exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/**
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais
		 */

		Scanner sc = new Scanner(System.in);
		int numberFunc;
		int horas;
		double salario;
		double horaValor;

		System.out.println("Qual seu número de matrícula?");
		numberFunc = sc.nextInt();
		System.out.println("Quantas horas você trabalhou essa semana?");
		horas = sc.nextInt();
		System.out.println("Quanto vale sua hora de trabalho?");
		horaValor = sc.nextDouble();
		double resultado = ((horas) * horaValor);
		salario = resultado;
		System.out.printf("A matrícula do funcionário= %d%n", numberFunc);
		System.out.printf("A quantidade de horas trabalhadas: %d%n", horas);
		System.out.printf("O valor do salário semanal é: R$ %.2f", salario);

		sc.close();

	}

}
