package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;


public class MainBack {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		

		Account ac;
		System.out.println("Informe o número da conta: ");
		int number = sc.nextInt();
		System.out.println("Informe o usuário da conta: ");
		String name = sc.next();
		sc.nextLine();
		System.out.println("Deseja fazer um depósito inicial? (s/n)");
		char resp = sc.next().charAt(0);
		if (resp == 's') {
			System.out.println("Informe o valor do depósito:");
			double deposit = sc.nextDouble();
			ac = new Account(name,number, deposit);
		}else {
			ac = new Account(name, number);		
			
		}
		;

		System.out.print(ac);
		System.out.println();
		System.out.println("Digite um valor para deposito:");
		double deposit = sc.nextDouble();
		ac.deposit(deposit);
		System.out.print(ac);
		
		System.out.println();
		System.out.println("Digite um valor para saque:");
		double saque = sc.nextDouble();
		ac.withdraw(saque);
		System.out.print(ac);
		
		
	
		


		sc.close();
	}

}
