package main;
import java.util.Scanner;
import java.lang.Math;

public class Calculos{
    public void Conta(double valor1, int simbolo) {
        double resultado = 0.0;
        double valor2;
        Scanner sc = new Scanner(System.in);

        switch(simbolo){
            case 1:
                System.out.println("\nDigite o segundo número:");
                valor2 = sc.nextDouble();
                resultado = valor1 + valor2;
                System.out.println("\nO resultado de " + valor1 + " + " + valor2 + " é: " + resultado);
                break;
            case 2:
                System.out.println("\nDigite o segundo número:");
                valor2 = sc.nextDouble();
                resultado = valor1 - valor2;
                System.out.println("\nO resultado de " + valor1 + " - " + valor2 + " é: " + resultado);
                break;
            case 3:
                System.out.println("\nDigite o segundo número:");
                valor2 = sc.nextDouble();
                resultado = valor1 * valor2;
                System.out.println("\nO resultado de " + valor1 + " x " + valor2 + " é: " + resultado);
                break;
            case 4:
                System.out.println("\nDigite o segundo número:");
                valor2 = sc.nextDouble();
                resultado = valor1 / valor2;
                System.out.println("\nO resultado de " + valor1 + " / " + valor2 + " é: " + resultado);
                break;
            case 5:
                System.out.println("\nO seno de " + valor1 + " é: " + Math.sin(valor1));
                break;
            case 6:
                System.out.println("\nO cosseno de " + valor1 + " é: " + Math.cos(valor1));
                break;
            case 7:
                System.out.println("\nA tangente de " + valor1 + " é: " + Math.tan(valor1));
                break;
            case 8:
                System.out.println("\nA raiz de " + valor1 + " é: " + Math.sqrt(valor1));
                break;
            default:
                System.out.println("\nOperação invállida.");
                break;
        }
    }
}
