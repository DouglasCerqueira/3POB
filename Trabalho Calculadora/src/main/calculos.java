package main;

public class calculos{
    public double conta(double valor1, double valor2, String simbolo) {
        double resultado = 0.0;

        switch(simbolo){
            case "+": resultado = valor1 + valor2;
                break;

            case "-": resultado = valor1 - valor2;
                break;

            case "/": resultado = valor1 / valor2;
                break;

            case "x": resultado = valor1 * valor2;
                break;
        }
        return resultado;
    }
}
