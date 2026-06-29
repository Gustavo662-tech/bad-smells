package Calculadora;

public class Calculadora {

    public static void main(String[] args) {
        calcular(1000);
    }

    // método responsável por calcular imposto
    // recebe o valor bruto
    // retorna valor líquido
    public static void calcular(double valor) {

        double imposto = valor * 0.1;
        double taxa = valor * 0.05;
        double resultado = valor - imposto - taxa;

        System.out.println(resultado);
    }
}
