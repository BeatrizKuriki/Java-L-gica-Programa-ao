package estruturasDeRepeticao;

import java.util.Scanner;

public class ExWhile3 {

	public static void main(String[] args) {
		/**
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível, conforme exemplo.
		 */

		Scanner sc = new Scanner(System.in);
		int alcool, gas, diesel, cod;

		alcool = 1;
		gas = 2;
		diesel = 3;
		cod = 0;
		int contAlc = 0;
		int contGas = 0;
		int contDiesel = 0;

		while (cod != 4) {
			System.out.println("Digite o código do combustivel");
			cod = sc.nextInt();
			if (cod == 1) {
				contAlc++;
			} else if (cod == 2) {
				contGas++;
			} else if (cod == 3) {
				contDiesel++;
			}

		}
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + contAlc);
		System.out.println("Gasolina: " + contGas);
		System.out.println("Diesel " + contDiesel);

		/*
		 * OUTRA FORMA DE RESOLUÇÃO 
		 * int alcool = 0;
		 *  int gasolina = 0; 
		 *  int diesel = 0;
		 * 
		 * int tipo = sc.nextInt();
		 * 
		 * while (tipo != 4) { if (tipo == 1) { alcool = alcool + 1; } else if (tipo ==
		 * 2) { gasolina = gasolina + 1; } else if (tipo == 3) { diesel = diesel + 1; }
		 * 
		 * tipo = sc.nextInt(); }
		 * 
		 * System.out.println("MUITO OBRIGADO"); System.out.println("Alcool: " +
		 * alcool); System.out.println("Gasolina: " + gasolina);
		 * System.out.println("Diesel: " + diesel);
		 */
	}

}
