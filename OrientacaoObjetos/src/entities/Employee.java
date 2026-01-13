package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;

	public Employee() {

	}

	public Employee(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;

	}

	public double netSalary() {
		double netSalary = 0;
		netSalary = grossSalary - tax;
		return netSalary;
	}

	public void increaseSalary(double percentage) {
		grossSalary = grossSalary + (grossSalary * percentage / 100);

	}

	public String toString() {
		return name + " R$ " + String.format("%.2f", netSalary());

	}

}
