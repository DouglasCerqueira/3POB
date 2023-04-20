package triangulo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Triangulo triX = new Triangulo();
		
		System.out.println("Digite os lados do tri‚ngulo X");
		triX.a = sc.nextDouble();
		triX.b = sc.nextDouble();
		triX.c= sc.nextDouble();
		
		double areaX = triX.CalculaArea();
		
		System.out.println("\n¡rea do tri‚ngulo X: " + areaX);
		
		Triangulo triY = new Triangulo();
		System.out.println("Digite os lados do tri‚ngulo Y");
		triY.a= sc.nextDouble();
		triY.b= sc.nextDouble();
		triY.c= sc.nextDouble();
		
		double areaY = triY.CalculaArea();
		
		System.out.println("\n¡rea do tri‚ngulo Y: " + areaY);
		
		sc.close();
	}

}