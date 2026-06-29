package FreteService;

public class FreteService {

    public static void main(String[] args) {
        System.out.println(calcular(15, true));
    }

    public static double calcular(
            double peso,
            boolean vip) {

        double valor;

        if (peso <= 1) {
            valor = 20;
        } else if (peso <= 10) {
            valor = 50;
        } else {
            valor = 100;
        }

        if (vip) {
            valor *= 0.8;
        }

        return valor;
    }
}