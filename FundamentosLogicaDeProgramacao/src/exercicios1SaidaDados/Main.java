package exercicios1SaidaDados;
import java.util.Scanner;
public class Main {
	/*
	 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int soma = n1+n2;

		System.out.printf("SOMA: "+ soma);


		/**
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
		 */

		double raio = sc.nextDouble();
		double pi = 3.14159;		
		double area = raio *raio * pi;
		System.out.printf("Area=%.4f%n",area);
		


		sc.close();
	}

}
