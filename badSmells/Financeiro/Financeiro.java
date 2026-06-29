package Financeiro;

import java.util.Arrays;
import java.util.List;

public class Financeiro {

    public static void main(String[] args) {

        List<Double> receitas = Arrays.asList(100.0, 300.0, 400.0);
        List<Double> despesas = Arrays.asList(50.0, 80.0, 100.0);

        System.out.println(calcularReceitas(receitas));
        System.out.println(calcularDespesas(despesas));
    }

    public static double calcularReceitas(List<Double> valores) {

        double total = 0;

        for (Double valor : valores) {
            total += valor;
        }

        return total;
    }

    public static double calcularDespesas(List<Double> valores) {

        double total = 0;

        for (Double valor : valores) {
            total += valor;
        }

        return total;
    }
}
