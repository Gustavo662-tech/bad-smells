package CalculadoraFrete;

public class CalculadoraFrete {

    public static void main(String[] args) {

        System.out.println(
                calcularFrete("SEDEX", 8, true));
    }

    public static double calcularFrete(
            String tipo,
            double peso,
            boolean vip) {

        double valor = 0;

        switch (tipo) {

            case "SEDEX":

                if (peso <= 1) {
                    valor = 20;
                } else if (peso <= 5) {
                    valor = 35;
                } else if (peso <= 10) {
                    valor = 60;
                } else {
                    valor = 90;
                }

                break;

            case "PAC":

                if (peso <= 1) {
                    valor = 10;
                } else if (peso <= 5) {
                    valor = 20;
                } else {
                    valor = 50;
                }

                break;
        }

        if (vip) {

            if (valor > 50) {
                valor *= 0.80;
            } else {
                valor *= 0.90;
            }
        }

        return valor;
    }
}
