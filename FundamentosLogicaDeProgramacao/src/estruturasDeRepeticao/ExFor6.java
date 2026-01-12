package estruturasDeRepeticao;

import java.util.Scanner;

public class ExFor6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ler um número inteiro N e calcular todos os seus divisores.
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int  i =1; i<=n; i++) {
			if(n % i == 0) {
				
				System.out.println(i);
			}
		}
		sc.close();
	}

}
