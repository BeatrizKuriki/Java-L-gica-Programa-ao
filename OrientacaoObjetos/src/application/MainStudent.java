package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class MainStudent {

	public static void main(String[] args) {
	 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("Qual o nome do estudante?");
		student.name = sc.nextLine();
		
		System.out.println("Informe as notas trimestrais:");
		student.n1 = sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();
		
		System.out.println(student);
		System.out.println();
		student.isApproved();
		
		student.missingPoints();
		


		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
