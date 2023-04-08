package main;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculos calc = new Calculos();

        int simbolo;
        double num1, num2;
        int sair = 0;

        do {
            System.out.println("\nDigite o primeiro número: ");
            num1 = sc.nextInt();

            System.out.println("\nSelecione a operação desejada:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Seno");
            System.out.println("6 - Cosseno");
            System.out.println("7 - Tangente");
            System.out.println("8 - Raiz quadrada");
            simbolo = sc.nextInt();

            calc.Conta(num1, simbolo);

            System.out.println("Deseja continuar [0 = Sim; 1 = Não]: ");
            sair = sc.nextInt();

        } while (sair != 1);

        sc.close();
    }
}
