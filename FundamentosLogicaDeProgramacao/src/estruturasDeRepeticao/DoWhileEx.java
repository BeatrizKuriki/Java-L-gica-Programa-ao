package estruturasDeRepeticao;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		char res;
		
		do {
			System.out.println("Digite a temperatura em celsius:");
			double temp = sc.nextDouble();
			double f = ((9*temp)/5)+32;
			System.out.printf("Equivalente em fahrenheit: %.1f%n", f);
			System.out.println("Deseja repetir? (s/n)");
			res = sc.next().charAt(0);
;			
		}while(res == 's');
		sc.close();
	}

}
