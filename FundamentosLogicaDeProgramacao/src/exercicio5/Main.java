package exercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub,
		
		/**
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
		 */
		
		Scanner sc = new Scanner (System.in);
		int codPc1, codPc2, qtdPc1, qtdPc2;
		double valorPc1, valorPc2;
		
		/**System.out.println("Digite o código da peça 1");
		codPc1 = sc.nextInt();
		System.out.println("Digite a quantidade de peças 1");
		qtdPc1 = sc.nextInt();
		System.out.println("Qual o valor da peça 1?");
		valorPc1 = sc.nextDouble();
		System.out.println("Digite o código da peça 2");
		codPc2 = sc.nextInt();
		System.out.println("Digite a quantidade de peças 2");
		qtdPc2 = sc.nextInt();
		System.out.println("Qual o valor da peça 2?");
		valorPc2 = sc.nextDouble();
		
	    double totalPc1 = qtdPc1 * valorPc1;
	    double totalPc2 = qtdPc2 * valorPc2;
	    int qtdTotal = qtdPc1 + qtdPc2;
	    double valorTotal = totalPc1 + totalPc2;
	    
	   
	    
	    System.out.printf("A quantidade de peças compradas foram = %d%n " ,qtdTotal);
	    System.out.printf("O valor a pagar  = %.2f%n " ,valorTotal);		
		*/
		
		//Usando Métodos para resolver o problema
		System.out.println("Digite o código da peça 1");
		codPc1 = sc.nextInt();
		System.out.println("Digite a quantidade de peças 1");
		qtdPc1 = sc.nextInt();
		System.out.println("Qual o valor da peça 1?");
		valorPc1 = sc.nextDouble();
		System.out.println("Digite o código da peça 2");
		codPc2 = sc.nextInt();
		System.out.println("Digite a quantidade de peças 2");
		qtdPc2 = sc.nextInt();
		System.out.println("Qual o valor da peça 2?");
		valorPc2 = sc.nextDouble();
		int qtdPecas = totalPecas(qtdPc1, qtdPc2);
		double valor = valorDaCompra( qtdPc1,qtdPc2, valorPc1,  valorPc2);
		 
	    System.out.printf("A quantidade de peças compradas foram = %d%n " ,qtdPecas);
	    System.out.printf("O valor a pagar  = %.2f%n " ,valor);	
		
		
	}
	public static double valorDaCompra(int qtdPc1, int qtdPc2, double valorPc1, double valorPc2 ) {
		
		double total = (qtdPc1 * valorPc1) + (qtdPc2 * valorPc2);
		return  total;
		
	}
	public static int totalPecas(int qtdPc1, int qtdPc2) {
		int totalPecas = qtdPc1 + qtdPc2;
		return totalPecas;
	}

}
