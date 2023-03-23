package pacote;

import java.util.Scanner;

public class ClassePrincipal {
	public static void main(String[] args) {
		System.out.println("çalve");
		
		int inteiro = 10;
		long longo = 123456789;
		float valor = 12.34f;
		double valorF = 34.56;
		char carac = 'a';
		boolean ehSim = true;
		
		String nome = "vasco da gama";
		
		int resultado = 5 + 2 * 3 / 4;
		System.out.println(resultado);
		
		double resultadoD = 5 + 2 * 3 / 4f;
		System.out.println(resultadoD);
		
		Scanner sc = new Scanner(System.in);
		String nome2;
		int valor1 = 0;
		int valor2 = 0;
		
		System.out.println("Digite your name: ");
		nome2 = sc.next();
		System.out.println("Seu nome é: " + nome2);
		
		System.out.println("Digite um number: ");
		valor1 = sc.nextInt();
		System.out.println("Digite outro number: ");
		valor2 = sc.nextInt();
		
		int result = valor1 + valor2;
		
		System.out.println("A soma dos numbers é: " + result);

		sc.close();
	}
}
