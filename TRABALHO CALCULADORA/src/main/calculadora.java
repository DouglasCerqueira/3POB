package main;
import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculos calc = new calculos();

        String simbolo;
        int sair = 0;
        double num1, num2;
        double resultado;

        do {
            System.out.printf("\nEscolha um simbolo: ");
            System.out.printf("\n+ = Soma");
            System.out.printf("\n- = Subtração");
            System.out.printf("\n/ = Divisão");
            System.out.printf("\n* = Multiplicação\n");
            simbolo = sc.next();

            switch(simbolo){
                case "+": System.out.printf("\nDigite o primeiro numero: ");
                          num1 = sc.nextDouble();
                          System.out.printf("Digite o segundo numero: ");
                          num2 = sc.nextDouble();
                          resultado = calc.soma(num1, num2);
                          System.out.println("O numero " + num1 + " + " + num2 + " é: " + resultado);
                          break;

                case "-": System.out.printf("\nDigite o primeiro numero: ");
                          num1 = sc.nextDouble();
                          System.out.printf("Digite o segundo numero: ");
                          num2 = sc.nextDouble();
                          resultado = calc.subtracao(num1, num2);
                          System.out.println("O numero " + num1 + " - " + num2 + " é: " + resultado);
                          break;

                case "/": System.out.printf("\nDigite o primeiro numero: ");
                          num1 = sc.nextDouble();
                          System.out.printf("Digite o segundo numero: ");
                          num2 = sc.nextDouble();
                          resultado = calc.divisao(num1, num2);
                          System.out.println("O numero " + num1 + " / " + num2 + " é: " + resultado);
                          break;

                case "*": System.out.printf("\nDigite o primeiro numero: ");
                          num1 = sc.nextDouble();
                          System.out.printf("Digite o segundo numero: ");
                          num2 = sc.nextDouble();
                          resultado = calc.multiplicacao(num1, num2);
                          System.out.println("O numero " + num1 + " * " + num2 + " é: " + resultado);
                          break;
            }
            System.out.printf("\nDeseja sair? [1 = Sim / 0 = Não]: ");
            sair = sc.nextInt();

        }while(sair != 1);
        sc.close();
    }
}
