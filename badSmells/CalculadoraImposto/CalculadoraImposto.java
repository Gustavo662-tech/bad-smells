package CalculadoraImposto;

public class CalculadoraImposto {

    public static void main(String[] args) {
        System.out.println(calcular("VIP", 5000));
    }

    public static double calcular(String tipo, double valor) {

        switch (tipo) {

            case "VIP":
                if (valor > 1000) {
                    return valor * 0.8;
                }
                return valor * 0.9;

            case "PREMIUM":
                if (valor > 2000) {
                    return valor * 0.7;
                }
                return valor * 0.85;

            default:
                return valor;
        }
    }
}
