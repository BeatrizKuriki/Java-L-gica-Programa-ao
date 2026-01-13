package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class MainEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		System.out.println("Informe o  nome do funcionário:");
		employee.name = sc.nextLine();
		System.out.println("Informe o  salário bruto do funcionário:");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Informe o valor do imposto:");
		employee.tax = sc.nextDouble();

		System.out.println(employee);

		System.out.println("Qual a porcentagem de aumento do salario??");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);

		System.out.println(employee);

		sc.close();

	}

}
