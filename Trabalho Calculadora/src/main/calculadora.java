package main;
import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculos calc = new calculos();

        String simbolo;
        double num1, num2;
        int sair = 0;

        do {
            System.out.println("\nEntre com o primeiro numero: ");
            num1 = sc.nextDouble();
            System.out.println("\nEntre com o simbolo da operação [+, -, /, x]: ");
            simbolo = sc.next();
            System.out.println("\nEntre com o segundo numero: ");
            num2 = sc.nextDouble();

            System.out.println("\nO resultado de " + num1 + " " + simbolo + " " + num2 + " é: " + calc.conta(num1, num2, simbolo));
            System.out.println("\nDeseja sair? [1 = Sim; 0 = Não]: ");
            sair = sc.nextInt();
        } while (sair != 1);
    }
}
