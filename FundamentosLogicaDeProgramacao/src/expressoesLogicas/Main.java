package expressoesLogicas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
		 * negativo ou não
		 */
		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("Digite um número:");
		num = sc.nextInt();
		int num2;
		System.out.println("Digite outro número");
		num2 = sc.nextInt();

		/*
		 * if(num < 0) { System.out.println("O número é negativo"); }else {
		 * System.out.println("O número é não negativo"); }
		 */

		/*
		 * Exercício 02 Fazer um programa para ler um número inteiro e dizer se este
		 * número é par ou ímpar
		 */
		/*
		 * if(num %2 ==0) { System.out.println("par"); }else {
		 * System.out.println("impar"); }
		 */

		/*
		 * 3-Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
		 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 */
		if(num % num2 ==0 || num2 % num ==0) {
			System.out.println("SÃO MÚLTIPLOS");
		}else {
			System.out.println("NÃO SÃO MÚLTIPLOS");
		}

	}

}
