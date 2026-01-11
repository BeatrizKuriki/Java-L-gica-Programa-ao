package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// TODO Auto-generated method stub
		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
		 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
		 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
		 * e B.
		 */

		Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.println("Informe o lado A:");
		a = sc.nextFloat();
		System.out.println("Informe o lado B:");
		b = sc.nextFloat();
		System.out.println("Informe o lado C:");
		c = sc.nextFloat();
		double triangulo, trapezio, quadrado, circulo, retangulo;
		triangulo = areaTriangule(a, c);
		trapezio = areaTrapezio(a, b, c);
		circulo = areaCircle(c);
		quadrado = areaQuadrado(b);
		retangulo = areaRetangulo(a, b);

		System.out.printf("TRIÂNGULO = %.3f%n", triangulo);
		System.out.printf("CIRCULO = %.3f%n", circulo);
		System.out.printf("TRAPÉZIO = %.3f%n", trapezio);
		System.out.printf("QUADRADO = %.3f%n", quadrado);
		System.out.printf("RETANGULO = %.3f%n", retangulo);

	}

	public static double areaTriangule(double a, double c) {
		double area = (a * c) / 2.0;

		return area;
	}

	public static double areaCircle(double c) {
		double pi = 3.14159;
		double areaCircle = (c * c) * pi;
		return areaCircle;
	}

	public static double areaTrapezio( double a, double b, double c) {
		double areaTrapezio = (a + b) / 2 *c;
		return areaTrapezio;

	}

	public static double areaQuadrado(double b) {
		double area = b * b;
		return area;
	}

	public static double areaRetangulo(double a, double b) {
		double retangulo = a * b;
		return retangulo;
	}

}
